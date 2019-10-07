package pilha_encadeada;

public class Pilha {

	private Prato inicio;
	private int quantidade;

	public void push(Prato prato) {
		if (inicio == null) {
			this.inicio = prato;
		} else {
			Prato temp = this.inicio;
			this.inicio = prato;
			this.inicio.setProximo(temp);
		}
		quantidade++;

	}

	public void pop() throws NullPointerException {
		if (isVazio()) {
			throw new NullPointerException();
		} else {
			this.inicio = this.inicio.getProximo();
			quantidade--;
		}
	}

	public String top() {
		if (isVazio()) {
			throw new NullPointerException();
		} else {
			return this.inicio.getNome();
		}

	}

	public int tamanho() {
		return quantidade;
	}

	public boolean isVazio() {
		return quantidade == 0;
	}

	public void imprimir() {
		Prato temp = this.inicio;
		while (temp != null) {
			System.out.println(temp.getNome());
			temp = temp.getProximo();

		}

	}
}
