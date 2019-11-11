package br.unifacisa.DequeSequencial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DequeSequencialTest {
	
	@Test
	void testInsertFront() {
		DequeSequencial deque = new DequeSequencial();
		deque.insertFront("NumeroUm");
		deque.insertFront("NumeroDois");
		deque.insertFront("NumeroTres");
		deque.insertFront("NumeroQuatro");
		assertEquals("NumeroQuatro", deque.getFront());
	}
	
	@Test
	void testInsertLast() {
		DequeSequencial deque = new DequeSequencial();
		deque.insertFront("NumeroUm");
		deque.insertFront("NumeroDois");
		deque.insertFront("NumeroTres");
		deque.insertLast("NumeroCinco");
		deque.insertFront("NumeroQuatro");
		
		assertEquals("NumeroCinco", deque.getRear());
	}
	
	@Test
	void testIsEmpty() {
		DequeSequencial deque = new DequeSequencial();
		deque.insertFront("NumeroUm");
		deque.insertFront("NumeroDois");
		deque.insertFront("NumeroTres");
		deque.insertFront("NumeroQuatro");
		assertEquals(false, deque.isEmpty());
	}
	
	@Test
	void testDeleteFront() {
		DequeSequencial deque = new DequeSequencial();
		deque.insertFront("NumeroUm");
		deque.insertFront("NumeroDois");
		deque.insertFront("NumeroTres");
		deque.insertFront("NumeroQuatro");
		deque.deleteFront();
		assertEquals("NumeroTres", deque.getFront());
	}

	@Test
	void testDeleteLast() {
		DequeSequencial deque = new DequeSequencial();
		deque.insertFront("NumeroUm");
		deque.insertFront("NumeroDois");
		deque.insertFront("NumeroTres");
		deque.insertFront("NumeroQuatro");
		deque.deleleLast();
		assertEquals("NumeroDois", deque.getRear());
	}

	@Test
	void testSize() {
		DequeSequencial deque = new DequeSequencial();
		deque.insertFront("NumeroUm");
		deque.insertFront("NumeroDois");
		deque.insertFront("NumeroTres");
		deque.insertFront("NumeroQuatro");
		assertEquals(4, deque.size());
	}


}
