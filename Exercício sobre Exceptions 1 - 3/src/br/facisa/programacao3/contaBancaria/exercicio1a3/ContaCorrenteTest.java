package br.facisa.programacao3.contaBancaria.exercicio1a3;

import org.junit.Assert;
import org.junit.Test;

public class ContaCorrenteTest {

	@Test
	public void SaldoInsuficienteTest() throws SaldoInsuficienteException, ValorLimiteExcedidoException {
		ContaCorrente conta = new ContaCorrente();
		conta.depositar(5);
		Assert.assertEquals(5.0, conta.getSaldo(), 0.00);
		
	}
	@Test(expected = IllegalArgumentException.class)
	public void valorNegativoTeste() throws ValorLimiteExcedidoException{
		ContaCorrente conta = new ContaCorrente();
		conta.depositar(-5);
	}
	@Test
	public void depositarTeste() throws ValorLimiteExcedidoException {

		ContaCorrente conta = new ContaCorrente();
		conta.depositar(5);
		Assert.assertEquals(5, conta.getSaldo(), 0.0000);
		
	}

}
