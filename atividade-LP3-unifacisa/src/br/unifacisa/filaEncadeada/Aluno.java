package br.unifacisa.filaEncadeada;

public class Aluno {
	
	private String nome;
	private Aluno proximo;
	
	public Aluno (String nome) {
		this.setNome(nome);
	}
	
	public Aluno getProximo() {
		return proximo;
	}
	public void setProximo(Aluno proximo) {
		this.proximo = proximo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


}
