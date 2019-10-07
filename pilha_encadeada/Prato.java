package pilha_encadeada;

public class Prato {
	
	private String nome;
	
	private Prato proximo;
	
	public Prato(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public Prato getProximo() {
		return proximo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setProximo(Prato proximo) {
		this.proximo = proximo;
	}
	
	
	

}
