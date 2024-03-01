package Fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {

		double a = 1; // implicita
		System.out.println(a);

		float b = (float) 1.23456; // explicita (CAST)
		System.out.println(b);

		int c = 127;
		byte d = (byte) c; // explicita (CAST)
		System.out.println(d);

		double e = 1.0;
		int f = (int) e; // //explicita (CAST)
		System.out.println(f);
	}

}
