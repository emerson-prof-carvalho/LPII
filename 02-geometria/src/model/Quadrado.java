package model;

// Declara a classe Quadrado
public class Quadrado {
	// Atributos da classe
	private double lado;
	private String nome;

	// Métodos públicos da classe (sua interface)
	public void setLado(double lado) {
		if (lado > 0) {
			this.lado = lado;
		}
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public double calculaArea() {
		double area = lado * lado;

		return area;
	}
	
	public void desenhar() {
		for (int i = 0; i < lado; i++) {
			for (int j = 0; j < lado; j++) {
				System.out.print(". ");
			}

			System.out.println();
		}
	}
}