package br.unifacisa.PilhaEncadeada;

public class App {
	public static void main(String[] args) {
		
		Aluno alunoUm = new Aluno("alunoUm",16124141);
		Aluno alunoDois = new Aluno("alunoDois", 16214214);
		Aluno alunoTres = new Aluno("alunoTres", 16421412);
		
		NoDeAluno node = new NoDeAluno();
		node.push(alunoUm);
		node.push(alunoDois);
		node.push(alunoTres);
		node.pop();	
		node.imprimePilha();
		
	}

}
