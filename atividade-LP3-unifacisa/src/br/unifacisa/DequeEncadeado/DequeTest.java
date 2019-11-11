package br.unifacisa.DequeEncadeado;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DequeTest {

	@Test
	void testInsertFront() {
		Automovel carro = new Automovel("carro");
		Automovel carreta = new Automovel("carreta");
		Automovel camionete = new Automovel("camionete");
		Automovel caminhao = new Automovel("caminhao");
		DequeAutomovel deque = new DequeAutomovel();
		deque.insertFront(carro);
		deque.insertFront(carreta);
		deque.insertLast(camionete);
		deque.insertFront(caminhao);
		assertEquals("caminhao", deque.getFront());
	}
	
	@Test
	void testInsertLast() {
		Automovel carro = new Automovel("carro");
		Automovel carreta = new Automovel("carreta");
		Automovel camionete = new Automovel("camionete");
		Automovel caminhao = new Automovel("caminhao");
		DequeAutomovel deque = new DequeAutomovel();
		deque.insertFront(carro);
		deque.insertFront(carreta);
		deque.insertFront(caminhao);
		deque.insertLast(camionete);
		assertEquals("camionete", deque.getLast());
	}
	@Test
	void testIsEmpty() {
		Automovel carro = new Automovel("carro");

		DequeAutomovel deque = new DequeAutomovel();
		deque.insertFront(carro);

		assertEquals(false, deque.isEmpty());
	}
	@Test
	void testDeleteFront() {
		Automovel carro = new Automovel("carro");
		Automovel carreta = new Automovel("carreta");
		DequeAutomovel deque = new DequeAutomovel();
		deque.insertFront(carro);
		deque.insertFront(carreta);
		deque.deleteFront();
		assertEquals("carro", deque.getFront());
	}
	@Test
	void testDeleteLast() {
		Automovel carro = new Automovel("carro");
		Automovel carreta = new Automovel("carreta");
		Automovel camionete = new Automovel("camionete");
		Automovel caminhao = new Automovel("caminhao");
		DequeAutomovel deque = new DequeAutomovel();
		deque.insertFront(carro);
		deque.insertFront(carreta);
		deque.insertFront(caminhao);
		deque.insertLast(camionete);
		deque.deleteLast();
		assertEquals("carro", deque.getLast());
	}
	@Test
	void testSize() {
		Automovel carro = new Automovel("carro");
		Automovel carreta = new Automovel("carreta");
		DequeAutomovel deque = new DequeAutomovel();
		deque.insertFront(carro);
		deque.insertFront(carreta);
		deque.deleteLast();
		assertEquals(1, deque.size());
	}
}