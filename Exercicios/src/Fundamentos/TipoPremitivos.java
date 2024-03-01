package Fundamentos;

public class TipoPremitivos {

	public static void main(String[] args) {
		// Informações do Funcionario

		// Tipo numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDevoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L;

		// Tipos numéricos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797;

		// Tipo booleano
		boolean estaDeFerias = false;

		// Tipo Caractere
		char status = 'A'; // Ativo aceito uma unica letra

		// Dias de empresa
		System.out.println(anosDeEmpresa * 365);

		// Numero de Vianges
		System.out.println(numeroDevoos / 2);

		// Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);

		// id
		System.out.println(id + ":ganha -> " + salario);

		System.out.println("Ferias? " + estaDeFerias);

		System.out.println("Status: " + status);

	}

}
