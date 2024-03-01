package Fundamentos;

public class notacaoPonto {

	public static void main(String[] args) {

		String s = "Boa noite X";
		s = s.replace("X", "Senhora");
		s = s.toUpperCase();
		s = s.concat("!!!");

		System.out.println(s);

		String x = "Wesley".toUpperCase();
		System.out.println(x);

		String y = "Boa noite X".replace("X", "Wes");
		System.out.println(y);

		// Tipos primitivos não tem operador "."
		int a = 3;
		System.out.println(a);

	}

}
