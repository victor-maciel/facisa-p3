package br.unifacisa.PilhaEncadeada;

public class NoDeAluno {

	private Aluno inicio;
	private int inseridos;
	
	public void push(Aluno aluno) {
		if(this.inicio == null) {
			this.inicio = aluno;
		}
		else {
			Aluno temp = this.inicio;
			while(temp.getProximo() != null) {
				temp = temp.getProximo();
			}
			temp.setProximo(aluno);
		}
		inseridos++;
	}
	public String pop() {
		Aluno temp = this.inicio;
		if(inseridos == 0) {
			throw new NullPointerException();
		}
		else {
			while(temp.getProximo().getProximo() != null) {
				temp = temp.getProximo();
			}
			temp.setProximo(null);
			inseridos--;
		}
		return temp.getNome();
	}
	public Object top() {
		Aluno temp = this.inicio;
		while(temp.getProximo() != null) {
			temp = temp.getProximo();
		}
		return temp.getNome();
	}
	public int size() {
		return inseridos;
	}
	public void clear() {
		Aluno temp = null;
		this.inicio = temp;
		this.inseridos = 0;
	}
	public void imprimePilha() {
		Aluno temp = this.inicio;
		while(temp != null) {
			System.out.println(temp.getNome());
			temp = temp.getProximo();
		}
	}
}
