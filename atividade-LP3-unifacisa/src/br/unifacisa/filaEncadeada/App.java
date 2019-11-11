package br.unifacisa.filaEncadeada;

public class App {
	public static void main(String [] args) {
		Aluno paulo = new Aluno("Paulo Martins");
		Aluno claudiano = new Aluno("Claudiano Sampaio");
		Aluno victor = new Aluno("Victor Ranniere");
		Aluno aleff = new Aluno("Aleff Diniz");
		Aluno matheus = new Aluno("Matheus Souza");
		
		FilaEncadeada fila = new FilaEncadeada();
		fila.enqueue(paulo);
		fila.enqueue(claudiano);
		fila.enqueue(victor);
		fila.enqueue(aleff);
		fila.enqueue(matheus);
		fila.dequeue();
		fila.imprime();
	}

}
