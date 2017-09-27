package br.cesed.programacao3.dequesequencial.victor;

import static org.junit.Assert.*;
import org.junit.Test;


public class DequeTest {

	@Test
	public void inserirInicioTest1() {
		Deque deque = new Deque();
		deque.inserirInicio("elementoA");
		NoDeque objeto = (NoDeque) deque.getInicio();
		assertEquals("elementoA", objeto.getDeque());
	}
	
	@Test 
	public void inserirInicioTest2() {
		Deque deque = new Deque();
		deque.inserirInicio("ElementoA");
		deque.inserirInicio("ElementoB");
		assertEquals("ElementoB",deque.getInicioValor());
	}
	
	@Test
	public void inserirInicioTest3() {
		
		Deque deque = new Deque();
		deque.inserirInicio("ElementoA");
		deque.inserirInicio("ElementoB");
		deque.inserirInicio("ElementoC");
		assertEquals("ElementoC", deque.getInicioValor());
		
	}
	
	

	@Test
	public void removerInicioTest1() throws DequeVazioException {
		Deque deque = new Deque();
		deque.inserirInicio("Elemento");
		deque.removerInicio();
		assertEquals(null, deque.getInicio());
	}
	@Test
	public void removerInicioTest2() throws DequeVazioException {
		Deque deque = new Deque();
		deque.inserirInicio("ElementoA");
		deque.inserirInicio("ElementoB");
		deque.inserirInicio("ElementoC");
		
		deque.removerInicio();
		assertEquals("ElementoB", deque.getInicioValor());	
	}
	@Test
	public void removerInicioTest3() throws DequeVazioException {
		Deque deque = new Deque();
		deque.inserirInicio("ElementoA");
		deque.inserirInicio("ElementoB");
		deque.inserirInicio("ElementoC");
		deque.removerInicio();
		assertEquals("ElementoB", deque.getInicioValor());
		
	}
	
	@Test(expected = DequeVazioException.class)
	public void removerInicioTest4() throws DequeVazioException {
		Deque deque = new Deque();
		deque.removerInicio();
		
	}
	
	
	@Test
	public void inserirFinalTest1() {
		Deque deque = new Deque();
		deque.inserirFinal("Elemento");
		
		assertEquals("Elemento", deque.getInicioValor());
		assertEquals("Elemento", deque.getFinal());
		
	}
	
	@Test
	public void inserirFinalTest2() {
		Deque deque = new Deque();
		deque.inserirFinal("ElementoFINAL");
		deque.inserirInicio("ElementoA");
		assertEquals("ElementoFINAL", deque.getFinal());

	}

	
	@Test
	public void removerFinalTest1() throws DequeVazioException {
		Deque deque = new Deque();
		deque.inserirInicio("Elemento");
		deque.removerFinal();
	}
	
	@Test(expected = DequeVazioException.class)
	public void removerFinalTest2() throws DequeVazioException {
		Deque deque = new Deque();
		deque.removerFinal();
		
	}
	

}
