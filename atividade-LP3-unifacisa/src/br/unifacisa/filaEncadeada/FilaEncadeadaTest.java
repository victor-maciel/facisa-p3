package br.unifacisa.filaEncadeada;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FilaEncadeadaTest {

	@Test
	void testEnqueue() {
		Aluno paulo = new Aluno("Paulo Martins");
		Aluno claudiano = new Aluno("Claudiano Sampaio");
		Aluno victor = new Aluno("Victor Ranniere");
		
		FilaEncadeada fila = new FilaEncadeada();
		fila.enqueue(paulo);
		fila.enqueue(claudiano);
		fila.enqueue(victor);
		assertEquals("Paulo Martins", fila.getFront());
	}
	@Test
	void testDequeue() {
		Aluno paulo = new Aluno("Paulo Martins");
		Aluno claudiano = new Aluno("Claudiano Sampaio");
		Aluno victor = new Aluno("Victor Ranniere");
		
		FilaEncadeada fila = new FilaEncadeada();
		fila.enqueue(paulo);
		fila.enqueue(claudiano);
		fila.enqueue(victor);
		fila.dequeue();
		fila.dequeue();
		assertEquals("Victor Ranniere", fila.getFront());
	}
	
	@Test
	void testLast() {
		Aluno paulo = new Aluno("Paulo Martins");
		Aluno claudiano = new Aluno("Claudiano Sampaio");
		Aluno victor = new Aluno("Victor Ranniere");
		
		FilaEncadeada fila = new FilaEncadeada();
		fila.enqueue(paulo);
		fila.enqueue(claudiano);
		fila.enqueue(victor);
		fila.dequeue();
		assertEquals("Victor Ranniere", fila.getLast());
	}
	@Test
	void testSize() {
		Aluno paulo = new Aluno("Paulo Martins");
		Aluno claudiano = new Aluno("Claudiano Sampaio");
		Aluno victor = new Aluno("Victor Ranniere");
		
		FilaEncadeada fila = new FilaEncadeada();
		fila.enqueue(paulo);
		fila.enqueue(claudiano);
		fila.enqueue(victor);
		fila.dequeue();
		assertEquals(2, fila.size());
	}
	void testIsEmpty() {
		Aluno paulo = new Aluno("Paulo Martins");
		Aluno claudiano = new Aluno("Claudiano Sampaio");
		Aluno victor = new Aluno("Victor Ranniere");
		
		FilaEncadeada fila = new FilaEncadeada();
		fila.enqueue(paulo);
		fila.enqueue(claudiano);
		fila.enqueue(victor);
		assertEquals(false, fila.isEmpty());
	}
	
}