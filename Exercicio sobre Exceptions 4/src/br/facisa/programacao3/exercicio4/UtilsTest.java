package br.facisa.programacao3.exercicio4;

import static org.junit.Assert.*;

import org.junit.Test;

public class UtilsTest {

	@Test(expected = FahrenheitException.class)
	public void toCelsiustest() throws FahrenheitException {
		Utils.toCelsius(-500.0);
		assertEquals(-500, -500);
	}


}
