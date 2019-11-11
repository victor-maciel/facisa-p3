package br.unifacisa.PilhaSequencial;

public class PilhaSequencial {
	//	Métodos: push, pop, top, size, clear
	
	private Object [] arrayInterno = new Object[3];
	private int inseridos;
	
	public void push(Object objeto) {
		if(inseridos == arrayInterno.length) {
			
			Object[] novoArray = new Object[arrayInterno.length * 2];
			
			for (int i = 0; i < inseridos; i++) {
				novoArray[i] = arrayInterno[i];	
			}
			novoArray[inseridos] = objeto;
			arrayInterno = novoArray;
		}
		else {
			arrayInterno[inseridos] = objeto;
		}
		inseridos++;
		
	}
	
	public Object pop() {
		if(arrayInterno[0] == null) {
			throw new NullPointerException();
		}
		else {
			arrayInterno[inseridos - 1] = null;
		}
		inseridos--;
		return arrayInterno[inseridos -1];
	};
	
	public Object top() {
		if(inseridos == 0) {
			throw new NullPointerException();
		}
		return arrayInterno[inseridos -1];
	};
	
	public int size() {
		return inseridos;
	};
	
	public void clear() {
		
		if(inseridos == 0) {
			System.out.println("Vazia");
		}else {
			for (int i = 0; i < inseridos; i++) {
				arrayInterno[i] = null;
				
			}
			this.inseridos = 0;
		}
	};
	
	public void imprime() {
		for (int i = 0; i < inseridos; i++) {
			System.out.println(arrayInterno[i]);
		}
	}
	


}
