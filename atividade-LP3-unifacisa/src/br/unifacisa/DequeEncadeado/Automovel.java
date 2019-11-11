package br.unifacisa.DequeEncadeado;

public class Automovel {
	
	private String nome;
	private Automovel proximo;
	
	public Automovel(String nome) {
		this.nome = nome;
	}
	
	public Automovel getProximo() {
		return proximo;
	}
	public void setProximo(Automovel proximo) {
		this.proximo = proximo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}

