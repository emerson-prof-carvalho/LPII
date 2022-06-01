package model;

public class Vetor {
	private int tamanho;
	private int maiorValor;
	private int menorValor;
	private int soma;
	private int vetor[];
	
	public Vetor(int tamanho) {
		this.tamanho = tamanho;
		this.vetor = new int[this.tamanho];
		this.maiorValor = 0;
		this.menorValor = 0;
	}
	
	public int[] getVetor() {
		return this.vetor;
	}
	
	public int getMaiorValor() {
		return this.maiorValor;
	}
	
	public int getMenorValor() {
		return this.menorValor;
	}
	
	public void adicionaValor(int indice, int valor) {
		if (indice >= 0 && indice < tamanho) {
			soma = soma - vetor[indice];
			vetor[indice] = valor;
			soma = soma + valor;

			this.menorValor = this.vetor[0];
			this.maiorValor = this.vetor[0];
		    for (int i : vetor) {
		    	if (i > this.maiorValor)
					maiorValor = i;
				
				if (i < this.menorValor)
					menorValor = i;
			}
		}
	}
	
	public int somaDosValores() {
		return this.soma;
	}
	
	public Vetor somaVetores(Vetor v) {
		if (v == null || this.tamanho != v.tamanho) 
			return new Vetor(0); 
		
		Vetor vetorSoma = new Vetor(this.tamanho);
		
		for (int i = 0; i < this.tamanho; i++) {
			int soma = this.vetor[i] + v.vetor[i];
			vetorSoma.adicionaValor(i, soma);
		}
		
		return vetorSoma;
	}
	
	public Vetor ordenar() {
		Vetor vetorOrdenado = new Vetor(this.tamanho);
		
		int [] copiaVetor = new int[this.tamanho];
		for (int i = 0; i < this.tamanho; i++)
			copiaVetor[i] = this.vetor[i];
		
		for (int i = 0; i < this.tamanho; i++) {
			for (int j = i; j < this.tamanho; j++) {
				if (copiaVetor[i] > copiaVetor[j])
                {
                    int aux = copiaVetor[i];
                    copiaVetor[i] = copiaVetor[j];
                    copiaVetor[j] = aux;
                }
			}
			
			vetorOrdenado.adicionaValor(i, copiaVetor[i]);
		}
		
		return vetorOrdenado;
	}
}
