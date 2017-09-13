package br.cesed.si.p3.ed.lista.sequencial;

import org.junit.Assert;
import org.junit.Test;

public class ListaSequencialTest {

	@Test
	public void tamanho1() {
			ListaSequencial ls = new ListaSequencial();
			Assert.assertEquals(0, ls.tamanho());
	}

	@Test
	public void inserir1() {	
			ListaSequencial ls = new ListaSequencial();
			ls.inserir(new Conta());
			Assert.assertEquals(1, ls.tamanho());
	}

	@Test
	public void inserir2() {	
			ListaSequencial ls = new ListaSequencial();
			ls.inserir(new Conta());
			ls.inserir(new Conta());
			ls.inserir(new Conta());
			Assert.assertEquals(3, ls.tamanho());
	}

	@Test
	public void inserir3() {	
			ListaSequencial ls = new ListaSequencial();
			ls.inserir(new Conta());
			ls.inserir(new Conta());
			ls.inserir(new Conta());
			ls.inserir(new Conta());
			Assert.assertEquals(4, ls.tamanho());
	}

	@Test
	public void excluir1() throws InvalidObjectException {	
			ListaSequencial ls = new ListaSequencial();
			ls.inserir(new Conta(1,1));
			ls.inserir(new Conta(2,2));
			ls.inserir(new Conta(3,3));
			Conta c = new Conta(4,4);
			ls.inserir(c);
			ls.excluir(c);
			
			Assert.assertEquals(3, ls.tamanho());
	}

	@Test
	public void excluir2() throws InvalidObjectException {	
			ListaSequencial ls = new ListaSequencial();
			ls.inserir(new Conta(1,1));
			ls.inserir(new Conta(2,2));
			Conta c = new Conta(3,3);
			ls.inserir(c);
			ls.inserir(new Conta(4,4));
			ls.excluir(c);
			
			Assert.assertEquals(3, ls.tamanho());
	}
	
	@Test
	public void excluir3() throws InvalidObjectException {	
			ListaSequencial ls = new ListaSequencial();
			Conta c = new Conta(1,1);
			ls.inserir(c);
			ls.inserir(new Conta(2,2));
			ls.inserir(new Conta(3,3));			
			ls.inserir(new Conta(4,4));
			ls.excluir(c);
			
			Assert.assertEquals(3, ls.tamanho());
	}

	@Test(expected=InvalidObjectException.class)
	public void excluir4() throws InvalidObjectException {	
			ListaSequencial ls = new ListaSequencial();
			Conta c = new Conta(1,1);
			ls.inserir(c);
			ls.inserir(new Conta(2,2));
			ls.inserir(new Conta(3,3));			
			ls.inserir(new Conta(4,4));
			ls.excluir(new Conta(5,5));
			
			Assert.assertEquals(3, ls.tamanho());
	}
	
}
