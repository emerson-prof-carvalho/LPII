package main;

import java.util.Scanner;

import model.Calculadora;

public class Main {
	
	public static void main(String[] args) {
		
		
		Calculadora calc = new Calculadora();
		Scanner leitor = new Scanner(System.in);
		int opcao = 0;
		Number resultado = 0;
		
		while(opcao != 5) {
			System.out.println("1 - Soma");
			System.out.println("2 - Sub");
			System.out.println("3 - Div");
			System.out.println("4 - Mult");
			System.out.println("5 - Sair");
			
			opcao = leitor.nextInt();
			
			Number valorUm = 0;
			Number valorDois = 0;
			
			if (opcao > 0 && opcao < 5) {
				System.out.print("Digite o Valor 1: ");
				valorUm = leitor.nextDouble();
				System.out.print("Digite o Valor 2: ");
				valorDois = leitor.nextDouble();
			}
			
			switch (opcao) {
			case 1: {
				resultado = calc.sum(valorUm, valorDois);
				break;
			}
			case 2: {
				resultado = calc.sub(valorUm, valorDois);
				break;
			}
			case 3: {
				resultado = calc.div(valorUm, valorDois);
				break;
			}
			case 4: {
				resultado = calc.mult(valorUm, valorDois);
				break;
			}
			case 5: {
				System.out.println("Operações realizadas");
				
				for (String operacao : calc.getLastOperations()) {
					System.out.println(operacao);
				}
				
				leitor.close();
				continue;
			}
			default:
				System.out.println("Opção Inválida");
				continue;
			}
			
			System.out.println("Resultado: " + resultado);
		}
	}
}