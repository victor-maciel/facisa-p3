package br.unifacisa.DequeSequencial;

public class DequeSequencial {
	// Métodos: size, insertFront, insertLast,
	// deleteFront, deleteLast, getFront, getRear e isEmpty

	private Object[] arrayInterno = new Object[3];
	private int inseridos;

	public void insertFront(Object objeto) {
		if(inseridos == arrayInterno.length) {
			Object [] novoArray = new Object[arrayInterno.length * 2];
			for(int i = 0; i < inseridos; i++) {
				novoArray[i+1] = arrayInterno[i];
			}
			novoArray[0] = objeto;
			arrayInterno = novoArray;
		}
		else {
			Object [] novoArray = new Object[arrayInterno.length];
			for(int i = 0; i < inseridos; i++) {
				novoArray[i+1] = arrayInterno[i];
			}
			novoArray[0] = objeto;
			arrayInterno = novoArray;
		}
		inseridos++;
	};

	public void insertLast(Object objeto) {
		if (inseridos == arrayInterno.length) {
			Object[] novoArray = new Object[arrayInterno.length * 2];
			for (int i = 0; i < inseridos; i++) {
				novoArray[i] = arrayInterno[i];

			}
			novoArray[inseridos] = objeto;
			arrayInterno = novoArray;

		} else {
			arrayInterno[inseridos] = objeto;

		}
		inseridos++;
	}

	public Object deleteFront() {
		if (arrayInterno[0] == null) {
			System.out.println("Campo vazio");
		} else {
			for (int i = 0; i < inseridos; i++) {
				arrayInterno[i] = arrayInterno[i + 1];
			}
			inseridos--;
		}
		return arrayInterno[0];
	};

	public Object deleleLast() {
		if (inseridos == 0) {
			throw new NullPointerException();
		} else {
			arrayInterno[inseridos - 1] = null;
			inseridos--;
		}
		return arrayInterno[inseridos - 1];
	};

	public Object getFront() {
		return arrayInterno[0];
	}

	public Object getRear() {
		return arrayInterno[inseridos - 1];
	}

	public int size() {
		return inseridos;
	}

	public boolean isEmpty() {
		return inseridos == 0;
	}

	public void imprime() {
		for (int i = 0; i < inseridos; i++) {
			System.out.println(arrayInterno[i]);
		}
	}

}
