package Fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		System.out.print("Bom"); /*
									 * println e saida do sistema tipo usb uma impressora isso e uma saida de um
									 * computador como o monitor
									 */

		System.out.print("Dia\n"); // Imprimi e matem na mesma linha

		System.out.println("Bom"); // println imprime, depois quebra a linha.
		System.out.println("Dia");

		System.out.printf("Megasena: %d %d  %d  %d  %d  %d  %n", 1, 2, 3, 4, 5,
				6);/*
					 * printf Conseguimos imprimir uma String formatada com alguns simbolos %d e
					 * usamos o simbolo para subistuir dentro da String
					 */

		System.out.printf("Salario: %.1f%n", 1234.5678);
		System.out.printf("Nome: %S%n", "Wesley"); // %s Define para substuir por string

		Scanner entrada = new Scanner(System.in); // Scanner e uma entrada tipo um teclado um mouse aquilo que você
													// recebe informações de entrada

		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine();

		System.out.print("Digite o seu Sobrenome: ");
		String sobrenome = entrada.nextLine();

		System.out.print("Digite a Sua idade: ");
		int idade = entrada.nextInt();

		System.out.printf("%s %s tem %d anos.%n", nome, sobrenome, idade);

		entrada.close();

	}

}
