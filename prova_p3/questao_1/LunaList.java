package questao_1;

import questao_2.ListaLotadaException;

public class LunaList  {

	
	private Luna inicio;
	private int tamanho;
	

	public LunaList() {
		this.inicio = null;
	}

	public void inserir(Object objeto) throws ListaLotadaException{
		if(tamanho == 30) {
			throw new ListaLotadaException("LOTADA");
		}
		if(tamanho == 0) {
			this.inicio = new Luna(objeto);
		}else {
			Luna auxiliar = inicio;
			inicio = new Luna(objeto);
			inicio.setProximo(auxiliar);
		}
		tamanho ++;
	}
	

	public Object getTamanho() {
		return this.tamanho;
	}

	
}