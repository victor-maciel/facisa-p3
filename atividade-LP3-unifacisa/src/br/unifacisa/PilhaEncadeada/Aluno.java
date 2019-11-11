package br.unifacisa.PilhaEncadeada;

public class Aluno {

	private String nome;
	private int matricula;
	private Aluno proximo;
	
	public Aluno(String nome, int matricula) {
		this.setNome(nome);
		this.setMatricula(matricula);
	}

	public Aluno getProximo() {
		return proximo;
	}

	public void setProximo(Aluno proximo) {
		this.proximo = proximo;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
