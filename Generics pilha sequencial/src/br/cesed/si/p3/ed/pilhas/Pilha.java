package br.cesed.si.p3.ed.pilhas;

public class Pilha <Tipo> {

	private static final int TAMANHO_INICIAL_ARRAY_INTERNO = 3;
	
	private Tipo[] arrayInterno = (Tipo[]) new Object[TAMANHO_INICIAL_ARRAY_INTERNO];

	private int inseridos = 0;
	
	public void push(Tipo objeto) {
		
		if(objeto == null) {
			throw new IllegalArgumentException();
		}
			
		if(inseridos == arrayInterno.length) {
			
			Tipo[] arrayTemporario = (Tipo[])new Object[arrayInterno.length * 2];
			
			for (int i = 0; i < arrayInterno.length; i++) {
				arrayTemporario[i] = arrayInterno[i];
			}
			arrayInterno = arrayTemporario;
		}
		
		arrayInterno[inseridos] = objeto;
		inseridos++;
		
		
	}

	public Tipo pop() {

		if(isEmpty()) {
			return null;
 		}
		
		Tipo topo = arrayInterno[inseridos-1];
		arrayInterno[inseridos-1] = null;
		inseridos--;
		
		return topo;
	}
	
	public Tipo top() {
		if(isEmpty()) {
			return null;
 		}
		
		return arrayInterno[inseridos-1];
	}
	
	public int tamanho() {
		return inseridos;
	}
	
	public boolean isEmpty() {
		return inseridos == 0;
	}
}
