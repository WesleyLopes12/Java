package Fundamentos;

public class TipoString {

	public static void main(java.lang.String[] args) {
		System.out.println("Olá pessoal".charAt(2)); // essa e uma funcionalidade pertecente a String consegue pegar
														// letras dentro da String

		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s + "!!!");
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().endsWith("Tarde"));
		System.out.println(s.length());
		System.out.println((s.toLowerCase().equals("boa tarde")));
		System.out.println(s.equalsIgnoreCase("boa tarde"));

		var nome = "Wesley";
		var sobrenome = "Lopes";
		var idade = 33;
		var salario = 1800.33;

		String maisUmaFrase = "Nome: " + nome + "/nSobrenome: " + sobrenome + "\nidade: " + idade + "\nSalario: "
				+ salario + "\n\n";

		System.out.println(maisUmaFrase);

		System.out.printf("O senhor %s %s tem %d  e ganha %f.", nome, sobrenome, idade, salario);

		String frase = String.format("\nO senhor %s %s tem %d  e ganha %f.", nome, sobrenome, idade, salario);
		System.out.println(frase);

		System.out.println("Nome: " + nome + "/nSobrenome: " + sobrenome + "\n Idade: " + idade + "\nSalario: "
				+ salario + "\n\n");

		System.out.println("Frase qualquer".contains("qual"));
		System.out.println("Frase qualquer".indexOf("qual"));
		System.out.println("Frase qualquer".substring(6));
		System.out.println("Frase qualquer".substring(6, 10));

	}

}
