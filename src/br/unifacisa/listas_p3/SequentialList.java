package br.unifacisa.listas_p3;

public class SequentialList {

	private static int ALOCACAO = 3;

	private Object[] arrayInterno = new Object[ALOCACAO];

	private int inseridos = 0;

	public void impressao() {
		for (int i = 0; i < inseridos; i++) {
			System.out.println(arrayInterno[i]);

		}
	}

	public void inserirFinal(Object objeto) {

		if (inseridos == arrayInterno.length) {
			Object[] novoArrayInterno = new Object[ALOCACAO * 2];

			ALOCACAO = ALOCACAO * 2;

			for (int i = 0; i < arrayInterno.length; i++) {
				novoArrayInterno[i] = arrayInterno[i];
			}
			arrayInterno = novoArrayInterno;
		}
		arrayInterno[inseridos] = objeto;
		inseridos++;

	}

	public void inserirInicio(Object objeto) {
		if (inseridos == arrayInterno.length) {
			ALOCACAO = ALOCACAO * 2;
			Object[] novoArrayInterno = new Object[ALOCACAO];

			for (int i = 0; i < inseridos; i++) {
				novoArrayInterno[i + 1] = arrayInterno[i];

			}
			arrayInterno = novoArrayInterno;
			
		} 
		else {
			Object[] novoArrayInterno = new Object[ALOCACAO];
			for (int i = 0; i < inseridos; i++) {
				novoArrayInterno[i + 1] = arrayInterno[i];
			}
			arrayInterno = novoArrayInterno;
			

		}
		arrayInterno[0] = objeto;
		inseridos++;
		
	}

}
