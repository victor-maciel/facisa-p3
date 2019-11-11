package br.unifacisa.DequeEncadeado;

public class DequeAutomovel {

	private Automovel inicio;
	private int inseridos;

	public void insertFront(Automovel automovel) {
		if (this.inicio == null) {
			this.inicio = automovel;
		} else {
			Automovel temp = this.inicio;
			this.inicio = automovel;
			this.inicio.setProximo(temp);
		}
		inseridos++;
	}

	public void insertLast(Automovel automovel) {
		if (this.inicio == null) {
			this.inicio = automovel;
		} else {
			Automovel temp = this.inicio;
			while (temp.getProximo() != null) {
				temp = temp.getProximo();
			}
			temp.setProximo(automovel);
		}
		inseridos++;
	}

	public void deleteFront() {
		if (this.inicio == null) {
			throw new NullPointerException();
		} else {
			this.inicio = this.inicio.getProximo();
		}
		inseridos--;
	}

	public void deleteLast() {
		if (inseridos == 0) {
			throw new NullPointerException();
		} else if (inseridos == 1) {
			this.inicio = null;
		} else if (inseridos > 1) {
			Automovel temp = this.inicio;
			while (temp.getProximo().getProximo() != null) {
				temp = temp.getProximo();
			}
			temp.setProximo(null);
		}
		inseridos--;
	}

	public String getFront() {
		return this.inicio.getNome();
	}

	public String getLast() {
		Automovel temp = this.inicio;
		while (temp.getProximo() != null) {
			temp = temp.getProximo();
		}
		return temp.getNome();
	}

	public int size() {
		return inseridos;
	}

	public boolean isEmpty() {
		return inseridos == 0;
	}

	public void imprime() {
		Automovel temp = this.inicio;
		while (temp != null) {
			System.out.println(temp.getNome());
			temp = temp.getProximo();
		}
	}
}
