package br.cesed.si.p3.ed.pilhas;

import static org.junit.Assert.*;
import org.junit.Test;


public class PilhaTest {

	@Test(expected=IllegalArgumentException.class)
	public void testPush1() {
		Pilha pilha = new Pilha();
		pilha.push(null);
	}

	@Test
	public void testPush2() {
		Pilha pilha = new Pilha();
		pilha.push("Elemento 1");
		assertEquals(1, pilha.tamanho());
	}

	@Test
	public void testPush3() {
		Pilha pilha = new Pilha();
		pilha.push("Elemento 1");
		pilha.push("Elemento 2");
		assertEquals(2, pilha.tamanho());
	}

	@Test
	public void testTop1() {
		Pilha pilha = new Pilha();
		String entrada1 = "Elemento 1";
		pilha.push(entrada1);
		
		assertEquals(entrada1,pilha.top());
	}

	@Test
	public void testTop2() {
		Pilha pilha = new Pilha();
		assertNull(pilha.top());
	}

	@Test
	public void testPop1() {
		Pilha pilha = new Pilha();
		String entrada1 = "Elemento 1";
		pilha.push(entrada1);
		assertEquals(entrada1,pilha.pop());
	}

	@Test
	public void testPop2() {
		Pilha pilha = new Pilha();
		assertNull(pilha.pop());
	}

	@Test
	public void testPop3() {
		
		Pilha pilha = new Pilha();
		
		String entrada1 = "A";
		pilha.push(entrada1);

		String entrada2 = "B";
		pilha.push(entrada2);

		String entrada3 = "C";
		pilha.push(entrada3);
		
		assertEquals(entrada3,pilha.pop());
	}

}
