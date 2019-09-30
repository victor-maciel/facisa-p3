package questao_1;

public class Luna {

	protected Luna proximo;
	private Object luna;
	
	public Luna(Object luna) {
		this.luna = luna;
		this.proximo = null;	
	}

	public Object getLuna() {
		return luna;
	}
	
	public void setLuna(Object luna) {
		this.luna = luna;
	}
	
	public Luna getProximo() {
		return  proximo;
	}	
	
	public void setProximo(Luna proximo) {
		this.proximo = proximo;
	}
	
	}


