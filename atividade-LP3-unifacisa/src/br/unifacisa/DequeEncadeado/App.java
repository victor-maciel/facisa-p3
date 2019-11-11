package br.unifacisa.DequeEncadeado;

public class App {

	public static void main(String[] args) {
		
		Automovel carro = new Automovel("carro");
		Automovel carreta = new Automovel("carreta");
		Automovel camionete = new Automovel("camionete");
		Automovel caminhao = new Automovel("caminhao");
		
		DequeAutomovel deque = new DequeAutomovel();
		deque.insertFront(carro);
		deque.insertFront(carreta);
		deque.insertLast(camionete);
		deque.insertFront(caminhao);
		
		deque.imprime();
		

	}

}
