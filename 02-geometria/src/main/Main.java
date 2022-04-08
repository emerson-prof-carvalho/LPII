package main;

import model.Circulo;
import model.Quadrado;
import model.Retangulo;
import model.Triangulo;

public class Main {

	public static void main(String[] args) {

		Quadrado quadrado1 = new Quadrado();
		quadrado1.setNome("q1");
		quadrado1.setLado(10);

		double areaQuadrado1 = quadrado1.calculaArea();
		System.out.printf("\nÁrea do quadrado '%s': %.2f\n", quadrado1.getNome(), areaQuadrado1);

		System.out.printf("\nDesenho do quadrado '%s'\n", quadrado1.getNome());
		quadrado1.desenhar();


		Retangulo retangulo1 = new Retangulo();
		retangulo1.setNome("r1");
		retangulo1.setBase(10);
		retangulo1.setAltura(5);

		double areaRetangulo1 = retangulo1.calculaArea();
		System.out.printf("\nÁrea do retângulo '%s': %.2f\n", retangulo1.getNome(), areaRetangulo1);

		System.out.printf("\nDesenho do retângulo '%s'\n", retangulo1.getNome());
		retangulo1.desenhar();

		Triangulo triangulo1 = new Triangulo();
		triangulo1.setNome("t1");
		triangulo1.setBase(10);
		triangulo1.setAltura(10);

		double areaTriangulo1 = triangulo1.calculaArea();
		System.out.printf("\nÁrea do triângulo %s: %.2f\n", triangulo1.getNome(), areaTriangulo1);

		System.out.printf("\nDesenho do triângulo '%s'\n", triangulo1.getNome());
		triangulo1.desenhar();

		Circulo circulo1 = new Circulo();
		circulo1.setNome("c1");
		circulo1.setRaio(10);
		
		double areaCirculo1 = circulo1.calculaArea();
		System.out.printf("Área do círculo %s: %.2f\n", circulo1.getNome(), areaCirculo1);
		
		circulo1.desenhar();
	}

}
