package Animais;

public class Cachorro {

	public String nome;
	public String cor;
	public int altura;
	public double peso;
	public int tamanhoDoRabo;

	public String estadoDeEspirito;

	public void comer() {
	}

	public void latir() {
		System.out.println("Au Au");
	}

	public String pegar() {

		return "Bolinha";
	}

	public String interagir(String acao) {

		switch (acao) {
		case "carinho":
			this.estadoDeEspirito = "feliz";
			break;
			
		case "nada":
			this.estadoDeEspirito = "Bravo";
			break;
			
		
		default:
			this.estadoDeEspirito = "Neutro";
			break;
		}
		return this.estadoDeEspirito;
	}

}


