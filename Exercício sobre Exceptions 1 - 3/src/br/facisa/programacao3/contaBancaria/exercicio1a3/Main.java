package br.facisa.programacao3.contaBancaria.exercicio1a3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaCorrente conta = new ContaCorrente();
		
		try {
			conta.sacar(100);
		} catch (SaldoInsuficienteException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
		conta.setValorLimite(2000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
		try {
			conta.depositar(2000);
		} catch (ValorLimiteExcedidoException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
