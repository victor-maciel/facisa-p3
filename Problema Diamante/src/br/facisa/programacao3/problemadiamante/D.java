package br.facisa.programacao3.problemadiamante;

// O JAVA não reconheceria qual metodo chamar, pois a classe estaria sendo estendida de outras duas classas classes.

/*
public class D extends B, C{}

	public void teste() {
		System.out.println("Quem manda? ");
}
*/

// o "Problema" poderia ser resolvido com o código abaixo
public class D {

	private B b = new B();
	private C c = new C();

	public void quemManda() {
		c.teste();
		b.teste();
	}
}
