import java.util.Scanner;

public class ProdutoSimples {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int A = input.nextInt();
		int B = input.nextInt();
		input.close();

		int PROD = A * B;

		System.out.println("PROD = " + PROD);

	}

}
