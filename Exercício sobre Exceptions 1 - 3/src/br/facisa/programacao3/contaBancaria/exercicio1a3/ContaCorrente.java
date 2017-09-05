package br.facisa.programacao3.contaBancaria.exercicio1a3;

public class ContaCorrente {

	private float limite = 1000;
	private float saldo;
	private float valorLimite;
	

	/**
	 * @return a variavel saldo
	 */
	public float getSaldo() {
		return saldo;
	}

	/**
	 * Metodo setter para a variavel setValorLimite
	 * 
	 * @param valorLimite para ser ajustada
	 */
	public void setValorLimite(float valorLimite) {
		if(valorLimite < 0) {
			throw new IllegalArgumentException("Você não pode atribuir um valor negativo");
		}else if (limite > valorLimite) {
			throw new IllegalArgumentException("seu limite é maior que o valor limite");
		}else {
			this.valorLimite = valorLimite;
		}

	}

	//Método para efetuar um saque
	public void sacar(float valor) throws SaldoInsuficienteException {
		if(saldo < valor) {
			throw new SaldoInsuficienteException("Saldo insuficiente");
		}else if (valor <= 0.0) {
			throw new IllegalArgumentException("Você não pode atribuir um valor negativo");
		}else {
			 saldo = saldo - valor; 
		}
	}
	//Metodo para efetuar o deposito
	public void depositar(float valor) throws ValorLimiteExcedidoException {
		if(valor > limite) {
			throw new ValorLimiteExcedidoException("O valor ultrapassa o limite da sua conta");
		}else if (valor <= 0) {
			throw new IllegalArgumentException("Você não pode atribuir um valor negativo");
		}else {
			 saldo += valor;
		}

	}

	/**
	 * @param limite
	 * @param saldo
	 * @param valorLimite
	 */
	
}






