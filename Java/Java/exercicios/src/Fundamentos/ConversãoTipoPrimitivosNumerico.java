package Fundamentos;

public class ConversãoTipoPrimitivosNumerico {

	public static void main(String[] args) {

		double a = 1; // implicida
		System.out.println(a);

		float b = (float) 1.12345678888; // explicita (CAST)
		System.out.println(b);

		int c = 4;
		byte d = (byte) c; // explicita (CAST)
		System.out.println(d);

		double e = 1.99999;
		int f = (int) e; // explicita (CAST)
		System.out.println(f);

	}

}
