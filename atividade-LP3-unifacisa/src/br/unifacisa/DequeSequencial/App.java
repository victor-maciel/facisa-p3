package br.unifacisa.DequeSequencial;

public class App {
	
	public static void main(String[] args) {
		
		DequeSequencial deque = new DequeSequencial();
		deque.insertFront("NumeroUm");
		deque.insertFront("NumeroDois");
		deque.insertFront("NumeroTres");
		deque.insertFront("NumeroQuatro");
		
		deque.imprime();
		
	
	}

}
