package br.unifacisa.filaSequencial;

public class App {

	public static void main(String[] args) {
		FilaSequencial  fila = new FilaSequencial();
		fila.enqueue("NumeroUm");
		fila.enqueue("NumeroDois");
		fila.enqueue("NumeroTrês");
		fila.enqueue("NumeroQuatro");
		fila.enqueue("NumeroCinco");
		fila.dequeue();
		
		fila.imprimir();
		System.out.println();
		System.out.println(fila.getFront());
		System.out.println();
		System.out.println(fila.getRear());
		System.out.println();
		System.out.println(fila.getSize());

	}

}
