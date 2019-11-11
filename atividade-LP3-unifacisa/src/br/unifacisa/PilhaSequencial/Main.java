package br.unifacisa.PilhaSequencial;

class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PilhaSequencial pilha = new PilhaSequencial();
		pilha.push("NumeroUm");
		pilha.push("NumeroDois");
		pilha.push("NumeroTres");
		pilha.push("NumeroQuatro");
		pilha.push("NumeroCinco");
		pilha.pop();
		pilha.imprime();
		System.out.println();
		System.out.println("Topo da pilha é o " + pilha.top());
		System.out.println("Tamanho da pilha é o " + pilha.size());
	
		System.out.println();
		pilha.clear();
		System.out.println("Tamanho da pilha depois de limpar é: " + pilha.size());
	}

}
