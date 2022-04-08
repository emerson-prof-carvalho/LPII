package model;

// Declara a classe Círculo
public class Circulo {
	// Atributos da classe
	private double raio;
	private String nome;

	// Métodos públicos da classe (sua interface)
	public void setRaio(double raio) {
		if (raio > 0) {
			this.raio = raio;
		}
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public double calculaArea() {
		// A classe Math tem uma série de constantes e métodos para cálculos
		// Como 'PI' e 'pow' para exponencial
		double area = Math.PI * Math.pow(raio, 2);

		return area;
	}

	public void desenhar() {
		// Variáveis locais do método
		double raioLocal = this.raio;

		// Para padronizar o desenho
		if (raioLocal % 2 == 0)
			raioLocal = raioLocal + 1;
		
		// O modificadro 'final' declara variáveis que não
		// podem ter seus valores alterados, portanto, declara constantes
		final String VAZIO = "  ";
		final String CARACTER = ". ";
		
		double comprimento = raioLocal * 2;
		double percentualInicialEliminacao = 30.0;
		double percentualRestanteEliminacao = 100.0 - percentualInicialEliminacao;
		double percentualElimina = percentualInicialEliminacao;

		// Primeiro e segundo quadrantes
		double elimina = Math.round(percentualElimina/100.0 * comprimento);
		for (int i = 0; i < raioLocal; i++) {
			for (int j = 0; j < comprimento; j++) {
				if (i % 2 == 1 || j < elimina || j >= comprimento - elimina) {
					System.out.print(VAZIO);
				} else {
					System.out.print(CARACTER);
				}
			}

			System.out.println();
			
			percentualElimina = percentualElimina - percentualRestanteEliminacao / raioLocal;
			elimina = Math.round(percentualElimina / 100.0 * comprimento);
		}
		
		// Terceiro e quarto quadrantes
		elimina = 0;
		for (int i = 0; i < raioLocal + 1; i++) {
			for (int j = 0; j < comprimento; j++) {
				if (i % 2 == 0 || j < elimina || j >= comprimento - elimina) {
					System.out.print(VAZIO);
				} else {
					System.out.print(CARACTER);
				}
			}

			System.out.println();
			
			percentualElimina = percentualElimina + percentualRestanteEliminacao / raioLocal;
			elimina = Math.round(percentualElimina / 100.0 * comprimento);
		}
	}
}
