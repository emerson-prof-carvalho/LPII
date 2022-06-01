package main;

import model.Vetor;

public class Main {

	public static void main(String[] args) {
		Vetor v1 = new Vetor(3);
		
		for (int valor : v1.getVetor()) {
			System.out.println(valor);
		}
		System.out.println("Soma antes: " + v1.somaDosValores());
		System.out.println("Maior antes: " + v1.getMaiorValor());
		System.out.println("Menor antes: " + v1.getMenorValor());
		
		
		v1.adicionaValor(0, 1);
		v1.adicionaValor(1, 2);
		v1.adicionaValor(2, 3);
		
		for (int valor : v1.getVetor()) {
			System.out.println(valor);
		}
		System.out.println("Soma antes: " + v1.somaDosValores());
		System.out.println("Maior antes: " + v1.getMaiorValor());
		System.out.println("Menor antes: " + v1.getMenorValor());
		
		v1.adicionaValor(0, 10);
		v1.adicionaValor(1, 20);
		v1.adicionaValor(2, 30);
		
		for (int valor : v1.getVetor()) {
			System.out.println(valor);
		}
		
		System.out.println("Soma depois: " + v1.somaDosValores());
		System.out.println("Maior antes: " + v1.getMaiorValor());
		System.out.println("Menor antes: " + v1.getMenorValor());
	}
}
