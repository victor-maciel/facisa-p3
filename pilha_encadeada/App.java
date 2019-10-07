package pilha_encadeada;

public class App {
	
	public static void main(String[] args) {
		
		Prato prato = new Prato("Macarronada");
		Prato prato2 = new Prato("Feijoada");
		Prato prato3 = new Prato("Carne de Charque");
		Prato prato4 = new Prato("Lasanha");
		Prato prato5 = new Prato("Arrumadinho");
		Prato prato6 = new Prato("Feijão Verde");
		
		
		Pilha pilha = new Pilha();
		
		System.out.println(pilha.isVazio());
		
		pilha.push(prato);
		pilha.push(prato2);
		pilha.push(prato3);
		pilha.push(prato4);
		pilha.push(prato5);
		pilha.push(prato6);
		
		
		System.out.println(pilha.tamanho());
		
		pilha.pop();
		pilha.pop();
		pilha.pop();
		pilha.pop();
		pilha.pop();

		System.out.println(pilha.isVazio());
		System.out.println(pilha.tamanho());
		
		pilha.imprimir();
		
		
		
		
	}

}
