import java.util.Locale;
import java.util.Scanner;

public class AreaCircoferencia {

	public static void main(String[] args) {
		Locale.setDefault(Locale.ENGLISH);
		
		Scanner input = new Scanner(System.in);
		double raio = input.nextDouble();
		
		
		
		double area = 3.14159 * raio * raio;
		System.out.printf("A=%.4f\n",area);
		
		input.close();
		


	}

}
