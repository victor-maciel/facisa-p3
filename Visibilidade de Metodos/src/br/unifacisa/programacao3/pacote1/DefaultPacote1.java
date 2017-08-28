package br.unifacisa.programacao3.pacote1;

import br.unifacisa.programacao3.pacote2.PublicaPacote2;

class DefaultPacote1 {

	public DefaultPacote1() {

		DefaultPacote1 defaultPacote1 = new DefaultPacote1();
		PublicaPacote1 publicaPacote1 = new PublicaPacote1();
		// A Classe não está visível por ser uma classe default de outro pacote.
		// DefaultPacote2 defaultPacote2 = new DefaultPacote2();
		PublicaPacote2 publicaPacote2 = new PublicaPacote2();

		defaultPacote1.testeMetodoDefault();
		defaultPacote1.testeMetodoPrivado();
		defaultPacote1.testeMetodoProtected();
		defaultPacote1.testeMetodoPubico();

		publicaPacote1.testeMetodoDefault();
		publicaPacote1.testeMetodoProtected();
		publicaPacote1.testeMetodoPubico();
		// O método não está visivel por ser um método privado de outro classe mesmo
		// sendo do mesmo pacote.
		// publicaPacote1.testeMetodoPrivado();

		publicaPacote2.testeMetodoPubico();
		// Os Métodos não podem ser vistos pois não podem ser acessados por outra classe
		// de outro pacote.
		// publicaPacote2.testeMetodoDefault();
		// publicaPacote2.testeMetodoPrivado();
		// publicaPacote2.testeMetodoProtected();

	}

	public void testeMetodoPubico() {
	}

	private void testeMetodoPrivado() {
	}

	protected void testeMetodoProtected() {
	}

	void testeMetodoDefault() {
	}

}
