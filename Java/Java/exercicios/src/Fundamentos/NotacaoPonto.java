package Fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		
		String s = "Bom dia X";
		s = s.replace("X", "Senhora");
		s = s.toUpperCase();
		s= s.concat("!!!");
		
		
		System.out.println(s);
	
		String X = "Wesley".toUpperCase();
		System.out.println(X);
		
		String y = "Bom dia X".replace("X", "Amor da minha vida!");
		System.out.println(y);
		
		// Tipos primitivos não tem o operador "."
		int a = 3;
		System.out.println(a);
	

	}

}
