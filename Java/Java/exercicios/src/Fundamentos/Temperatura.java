package Fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		// (ºF -32) X 5/9 = ºC
		final double FATOR = 5.0 / 9.0;
		final double AJUSTE = 32;

		double fahrenheite = 86;
		double celsius = (fahrenheite - AJUSTE) * FATOR;
		System.out.println("O resultadoé " + celsius + "ºC.");

		fahrenheite = 0;
		celsius = (fahrenheite - AJUSTE) * FATOR;
		System.out.println("O resultado é" + celsius + "ºC.");

	}

}
