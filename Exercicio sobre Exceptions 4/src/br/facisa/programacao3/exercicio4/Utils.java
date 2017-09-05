package br.facisa.programacao3.exercicio4;

public class Utils {
	

	private static final double ZERO_ABOSOLUTO = -479.67;
	
	
	public static double toCelsius(double fahrenheit) throws FahrenheitException {
		if(fahrenheit < ZERO_ABOSOLUTO) {
			throw new FahrenheitException("O valor é menor que o zero absoluto");
		}
		
		return (5 * (fahrenheit - 32)) /9 ; 
		
		
	}
	
}
