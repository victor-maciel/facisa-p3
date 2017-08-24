package br.unifacisa.programacao3.pacote1;

public class DefaultPacote1 {
	
	private int atributo;
	
	
	
	public int testeAtributo1() {
		return this.atributo;
	}
	
	private int testeAtributo2() {
		return this.atributo;
	}
	
	protected int testeAtributo3() {
		return this.atributo;
	}
	
	int testeAtributo4() {
		return this.atributo;
	}
	
	
	public static void main(String[] args) {
		PublicaPacote1 teste = new PublicaPacote1();
		teste.testeAtributo1();
		//Não está visivel, pois eh um metodo privado.
		teste.testeAtributo2();
		teste.testeAtributo3();
		teste.testeAtributo4();
	
		
		}

}
