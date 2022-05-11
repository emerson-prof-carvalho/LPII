package model;
public class Vetor {
	private int tamanho;
	private int[] itens;
	
	public Vetor(int tamanho) {
		this.tamanho = tamanho;
		this.itens = new int[this.tamanho];
	}
	
	public int[] getItens() {
		return this.itens;
	}
	
	public void adiciona(int indice, int valor) {
		if (indice >= 0 && indice < this.tamanho)
			this.itens[indice] = valor;
	}
	
	public int soma() {
		int soma = 0;
		
		for (int valor : this.itens) {
			soma = soma + valor;
		}
		
		return soma;
	}
	
	public int menorValor() {
		int menor = this.itens[0];
		 
		for (int valor : this.itens) {
			if (valor < menor) {
				menor = valor;
			}
		}
		
		return menor;
	}
	
	public int maiorValor() {
		int maior = this.itens[0];
		
		for (int valor : this.itens) {
			if (valor > maior) {
				maior = valor;
			}
		}
		
		return maior;
	}
	
	public Vetor somaVetor(Vetor outroVetor) {
		
		if (this.tamanho != outroVetor.tamanho) {
			return null;
		}
		
		Vetor soma = new Vetor(this.tamanho);
		
		for (int i = 0; i < this.tamanho; i++) {
			soma.itens[i] = this.itens[i] + outroVetor.itens[i];
		}
		
		return soma;
	}
}
