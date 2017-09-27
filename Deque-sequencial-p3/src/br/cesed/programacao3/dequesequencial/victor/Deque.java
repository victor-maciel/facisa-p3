package br.cesed.programacao3.dequesequencial.victor;

/** Representa uma estrutura de dados como deck com lista de encadeados
 * @author Victor Maciel
 * R
 */
public class Deque {

	
	private NoDeque inicio;
	private NoDeque fim;
	private int tamanho;
	

	/**
	 * Construtor indicicando seu inicio
	 */
	public Deque() {
		this.inicio = null;
	}

	/**Método para inserir um objeto no inicio
	 * @param objeto, o objeto será inserido no deck
	 */
	
	public void inserirInicio(Object objeto){
		if(tamanho == 0) {
			this.inicio = new NoDeque(objeto);
			fim = inicio;
		}else {
			NoDeque auxiliar = inicio;
			inicio = new NoDeque(objeto);
			inicio.setProximo(auxiliar);
		}
		tamanho ++;
	}
	
	/** Método para inserir um objeto no final do deck
	 * @param objeto o objeto será inserido no deck
	 */
	public void inserirFinal(Object objeto) {
		if(tamanho == 0) {
			this.inicio = new NoDeque(objeto);
			fim = inicio;
		}else {
			NoDeque auxiliar = fim;
			fim = new NoDeque(objeto);
			auxiliar.setProximo(fim);
		

		}
		tamanho++;

	}

	
	/** Método para remover o primeiro objeto do Deck
	 * @throws DequeVazioException caso tente remover algo tipo null, a exceção é lançada.
	 */
	public void removerInicio() throws DequeVazioException{
		if(this.inicio == null) {
			throw new DequeVazioException("Deque Vazio");
		}

		NoDeque auxiliar = inicio;
		inicio = auxiliar.getProximo();
		auxiliar.setDeque(null);
		tamanho--;

	}



	/** Método para remover o ultimo objeto do Deck.
	 * @throws DequeVazioException caso tente remover algo tipo null, a exceção é lançada.
	 */
	public void removerFinal() throws DequeVazioException{
		if(this.fim == null) {
			throw new DequeVazioException("Deque Vazio");
		}
		
		NoDeque aux = inicio;
		for(int i = 0; i < tamanho - 2; i++) {
			aux = aux.getProximo();
		}	
		
		fim = aux;
		fim.setProximo(null);
		tamanho --;
	}

	/**
	 * @return Retorna o tamanho da lista
	 */
	public Object getTamanho() {
		return this.tamanho;
	}
	
	/**
	 * @return O retorna o inicio 
	 */
	public Object getInicio() {
		return this.inicio;
	}
	
	/**
	 * @return Retorna o primeiro objeto da lista
	 */
	public Object getInicioValor() {
		return this.inicio.getDeque();
	}
	
	/**
	 * @return Retorna o ultimo objeto da lista
	 */
	public Object getFinal() {
		return fim.getDeque();
		
	}

}
