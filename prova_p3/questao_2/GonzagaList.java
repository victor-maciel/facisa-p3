package questao_2;

public class GonzagaList {
	
	public static final int TAMANHO_FINAL = 10;
	
	private int inseridos;
	private int par = 0;
	private int impar = 1;

	
	private Object [] arrayInterno = new Object[TAMANHO_FINAL];

	
	public void inserir(Object objeto) throws ListaLotadaException {
		if(inseridos == TAMANHO_FINAL) {
			throw new ListaLotadaException("LOTADA");
		}
		else if(impar < TAMANHO_FINAL) {
			arrayInterno[impar] = objeto;
			impar+=2;
			inseridos++;
		}
		else if(par < TAMANHO_FINAL){
			arrayInterno[par] = objeto;
			par+=2;
			inseridos++;
		}
	}
	
	public void remove(Object objeto) {
		for(int i = 0; i < inseridos; i++) {
			if(arrayInterno[i] == objeto) {
				arrayInterno[i] = null;
				if(i % 2 == 0) {
					par-= 2;
					System.out.println(par + " posicao par");
				}
				else {
					impar-= 2;
					System.out.println(impar + " posicao impar");
				}
				i = inseridos;
			}
		}
		inseridos--;
	}
	
	public void imprimir() {
		for(int i = 0; i < inseridos; i++) {
			System.out.print(arrayInterno[i] + " ");
		}
	}
	public int getTamanho() {
		return inseridos;
	}
}
