package br.cesed.programacao3.dequesequencial.victor;

public class NoDeque {



	protected NoDeque proximo;
	private Object deque;
	
	public NoDeque(Object deque) {
		this.deque = deque;
		this.proximo = null;	
	}

	public Object getDeque() {
		return deque;
	}
	
	public void setDeque(Object deque) {
		this.deque = deque;
	}
	
	public NoDeque getProximo() {
		return  proximo;
	}	
	
	public void setProximo(NoDeque proximo) {
		this.proximo = proximo;
	}
	
	
		
	
}
