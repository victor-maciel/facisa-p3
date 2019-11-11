package br.unifacisa.PilhaEncadeada;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class NodDeAlunoTest {
	
	@Test
	void testPush() {
		Aluno alunoUm = new Aluno("alunoUm",16124141);
		Aluno alunoDois = new Aluno("alunoDois", 16214214);
		Aluno alunoTres = new Aluno("alunoTres", 16421412);
		
		NoDeAluno node = new NoDeAluno();
		node.push(alunoUm);
		node.push(alunoDois);
		node.push(alunoTres);
		assertEquals("alunoTres", node.top());
	}
	@Test
	void testPop() {
		Aluno alunoUm = new Aluno("alunoUm",16124141);
		Aluno alunoDois = new Aluno("alunoDois", 16214214);
		Aluno alunoTres = new Aluno("alunoTres", 16421412);
		
		NoDeAluno node = new NoDeAluno();
		node.push(alunoUm);
		node.push(alunoDois);
		node.push(alunoTres);
		node.pop();
		assertEquals("alunoDois", node.top());
	}
	@Test
	void testTop() {
		Aluno alunoUm = new Aluno("alunoUm",16124141);
		Aluno alunoDois = new Aluno("alunoDois", 16214214);
		Aluno alunoTres = new Aluno("alunoTres", 16421412);
		
		NoDeAluno node = new NoDeAluno();
		node.push(alunoUm);
		node.push(alunoDois);
		node.push(alunoTres);
		assertEquals("alunoTres", node.top());
	}
	@Test
	void testSize() {
		Aluno alunoUm = new Aluno("alunoUm",16124141);
		Aluno alunoDois = new Aluno("alunoDois", 16214214);
		Aluno alunoTres = new Aluno("alunoTres", 16421412);
		
		NoDeAluno node = new NoDeAluno();
		node.push(alunoUm);
		node.push(alunoDois);
		node.push(alunoTres);
		assertEquals(3, node.size());
	}
	@Test
	void testClear() {
		Aluno alunoUm = new Aluno("alunoUm",16124141);
		Aluno alunoDois = new Aluno("alunoDois", 16214214);
		Aluno alunoTres = new Aluno("alunoTres", 16421412);
		
		NoDeAluno node = new NoDeAluno();
		node.push(alunoUm);
		node.push(alunoDois);
		node.push(alunoTres);
		node.clear();
		assertEquals(0, node.size());
	}

}
