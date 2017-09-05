package br.cesed.programacao3.exercicio5a6;


public class Conta {
	
	private double saldo;

	public double getSaldo() {
		return this.saldo;
	}

	public void sacar(double valor) throws SaldoInsuficienteException {
		if(saldo < valor) {
			throw new SaldoInsuficienteException("Saldo insuficiente, seu saldo atual é: " + getSaldo());
		}else {
			 saldo = saldo - valor; 
		}

	}
}
