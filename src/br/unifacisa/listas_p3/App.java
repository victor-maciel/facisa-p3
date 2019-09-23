package br.unifacisa.listas_p3;

public class App {

	public static void main(String[] args) {
		SequentialList sequencia = new SequentialList();
		

		sequencia.inserirInicio(5);
		sequencia.inserirInicio(10);
		sequencia.inserirInicio(20);
		sequencia.inserirInicio(30);
		sequencia.inserirFinal(14);
		sequencia.inserirInicio(40);
		sequencia.inserirInicio(50);
		sequencia.inserirInicio(1);
		
		
		sequencia.impressao();
	}

}
