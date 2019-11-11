package br.unifacisa.PilhaSequencial;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class PilhaSequencialTest {
	
	@Test
	void testPush() {
		PilhaSequencial pilha = new PilhaSequencial();
		pilha.push("NumeroUm");
		pilha.push("NumeroDois");
		pilha.push("NumeroTres");
		pilha.push("NumeroQuatro");
		pilha.push("NumeroCinco");
		assertEquals("NumeroCinco", pilha.top());
	}
	
	@Test
	void testPop() {
		PilhaSequencial pilha = new PilhaSequencial();
		pilha.push("NumeroUm");
		pilha.push("NumeroDois");
		pilha.push("NumeroTres");
		pilha.push("NumeroQuatro");
		pilha.push("NumeroCinco");
		pilha.pop();
		assertEquals("NumeroQuatro", pilha.top());
	}
	
	@Test
	void testTop() {
		PilhaSequencial pilha = new PilhaSequencial();
		pilha.push("NumeroUm");
		pilha.push("NumeroDois");
		pilha.push("NumeroTres");
		pilha.push("NumeroQuatro");
		pilha.push("NumeroCinco");
		assertEquals("NumeroCinco", pilha.top());
	}
	
	@Test
	void testSize() {
		PilhaSequencial pilha = new PilhaSequencial();
		pilha.push("NumeroUm");
		pilha.push("NumeroDois");
		pilha.push("NumeroTres");
		pilha.push("NumeroQuatro");
		pilha.push("NumeroCinco");
		assertEquals(5, pilha.size());
	}
	
	@Test
	void testClear() {
		PilhaSequencial pilha = new PilhaSequencial();
		pilha.push("NumeroUm");
		pilha.push("NumeroDois");
		pilha.push("NumeroTres");
		pilha.push("NumeroQuatro");
		pilha.push("NumeroCinco");
		pilha.clear();
		assertEquals(0, pilha.size());
	}

}
