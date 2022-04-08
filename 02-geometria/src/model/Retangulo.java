package model;

// Declara a classe Retângulo
public class Retangulo {
	// Atributos da classe
	private double base;
	private double altura;
	private String nome;

	// Métodos públicos da classe (sua interface)
	public void setBase(double base) {
		if (base > 0) {
			this.base = base;
		}
	}

	public void setAltura(double altura) {
		if (altura > 0) {
			this.altura = altura;
		}
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public double calculaArea () {
		double area = base * altura;

		return area;
	}

	public void desenhar() {
		for (int i = 0; i < altura; i++) {
			for (int j = 0; j < base; j++) {
				System.out.print(". ");
			}

			System.out.println();
		}
	}
}
