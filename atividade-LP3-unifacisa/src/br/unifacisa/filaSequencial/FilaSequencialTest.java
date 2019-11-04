package br.unifacisa.filaSequencial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FilaSequencialTest {
	
	@Test
	void testeEnqueueFront() {
		
		FilaSequencial  fila = new FilaSequencial();
		fila.enqueue("NumeroUm");
		fila.enqueue("NumeroDois");
		fila.enqueue("NumeroTrês");
		fila.enqueue("NumeroQuatro");
		fila.enqueue("NumeroCinco");
		assertEquals("NumeroUm", fila.getFront());
		
	}
	@Test
	void testeEnqueueRear() {
		
		FilaSequencial  fila = new FilaSequencial();
		fila.enqueue("NumeroUm");
		fila.enqueue("NumeroDois");
		fila.enqueue("NumeroTrês");
		fila.enqueue("NumeroQuatro");
		fila.enqueue("NumeroCinco");
		assertEquals("NumeroCinco", fila.getRear());
		
	}
	
	@Test
	void testeDequeue() {
		FilaSequencial fila = new FilaSequencial();
		fila.enqueue("NumeroUm");
		fila.enqueue("NumeroDois");
		fila.enqueue("NumeroTrês");
		fila.enqueue("NumeroQuatro");
		fila.enqueue("NumeroCinco");
		fila.dequeue();
		assertEquals("NumeroDois", fila.getFront());

	}

	@Test
	void testIsEmpty() {
		FilaSequencial fila = new FilaSequencial();
		fila.enqueue("NumeroUm");
		fila.enqueue("NumeroDois");
		fila.enqueue("NumeroTrês");
		fila.enqueue("NumeroQuatro");
		fila.enqueue("NumeroCinco");
		assertEquals(false, fila.isEmpty());
	}
	
	@Test
	void testeSize() {
		FilaSequencial fila = new FilaSequencial();
		fila.enqueue("NumeroUm");
		fila.enqueue("NumeroDois");
		fila.enqueue("NumeroTrês");
		fila.enqueue("NumeroQuatro");
		fila.enqueue("NumeroCinco");
		assertEquals(5, fila.getSize());
	}

}
