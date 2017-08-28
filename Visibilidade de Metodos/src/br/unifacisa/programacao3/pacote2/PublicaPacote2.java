package br.unifacisa.programacao3.pacote2;

import br.unifacisa.programacao3.pacote1.PublicaPacote1;

public class PublicaPacote2 {

	public PublicaPacote2() {

		// A Classe n�o est� vis�vel por ser uma classe default de outro pacote.
		// DefaultPacote1 defaultPacote1 = new DefaultPacote1();
		PublicaPacote1 publicaPacote1 = new PublicaPacote1();
		DefaultPacote2 defaultPacote2 = new DefaultPacote2();
		PublicaPacote2 publicaPacote2 = new PublicaPacote2();

		publicaPacote1.testeMetodoPubico();
		/*
		 * // Os M�todos n�o podem ser vistos pois n�o podem ser acessados por outra
		 * classe de outro pacote. Pelo fato de serem default, protected e privado
		 * respetivamente.
		 */

		// publicaPacote1.testeMetodoDefault();
		// publicaPacote1.testeMetodoProtected();
		// publicaPacote1.testeMetodoPrivado();

		publicaPacote2.testeMetodoPubico();
		publicaPacote2.testeMetodoDefault();

		publicaPacote2.testeMetodoPrivado();
		publicaPacote2.testeMetodoProtected();

		defaultPacote2.testeMetodoDefault();
		// O m�todo n�o est� visivel por ser um m�todo privado de outro classe mesmo
		// sendo do mesmo pacote.
		// defaultPacote2.testeMetodoPrivado();
		defaultPacote2.testeMetodoProtected();
		defaultPacote2.testeMetodoPubico();

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
