package questao_2;

public class App {

	public static void main(String[] args) throws ListaLotadaException {
		GonzagaList lista = new GonzagaList();
		lista.inserir(1);
		lista.inserir(3);
		lista.inserir(5);
		lista.inserir(7);
		lista.inserir(9);
		lista.inserir(0);
		lista.inserir(2);
		lista.inserir(4);
		lista.inserir(6);
		lista.inserir(8);
		
		System.out.println(lista.getTamanho());
		
		lista.imprimir();
		
		
		
	}

}