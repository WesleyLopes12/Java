package Fundamentos;

import java.util.Scanner;

public class AreaCircoferencia {
	
	Scanner input = new Scanner (System.in);

	public static void main(String[] args) {
		

		double raio = 3.4;
		final double PI = 3.14159;

		double area = PI * raio * raio;
		System.out.println(area);

		raio = 10;
		area = PI * raio * raio;
		System.out.println("Area =" + area + "m2.");

	}

}
