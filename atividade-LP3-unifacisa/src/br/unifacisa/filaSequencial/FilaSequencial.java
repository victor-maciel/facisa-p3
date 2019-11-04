package br.unifacisa.filaSequencial;

public class FilaSequencial {
 //Métodos: enqueue, dequeue, size, getFront, getRear e isEmpty
	
	private Object[] arrayInterno = new Object[6];
	private int inseridos;
	
	public void enqueue(Object objeto) {
		if(inseridos == arrayInterno.length) {
			Object[] novoArray = new Object[arrayInterno.length *2];
			for (int i = 0; i <inseridos; i++) {
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
	
	public Object dequeue() {
		if(arrayInterno[0] == null) {
			throw new NullPointerException();
		}else {
			for (int i = 0; i <inseridos; i++) {
				arrayInterno[i] = arrayInterno[i + 1];
			}
			inseridos --;
		}
		return arrayInterno;
	}
	
	public int getSize() {
		return inseridos;
	}
	
	public Object getFront() {
		return arrayInterno[0];
	}
	
	public Object getRear( ) {
		return arrayInterno[inseridos - 1];
	}
	
	public boolean isEmpty() {
		return inseridos == 0;
	}
	
	
	public void imprimir() {
		for (int i = 0; i < inseridos; i++) {
			System.out.println(arrayInterno[i]);
			
		}
	}
	
}
