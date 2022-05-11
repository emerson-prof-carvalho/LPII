package view;
import model.Vetor;

public class Main {

	public static void main(String[] args) {
		// Criando dois vetores
		Vetor vet1 = new Vetor(3);
		vet1.adiciona(0, 10);
		vet1.adiciona(1, 30);
		vet1.adiciona(2, 20);
		
		Vetor vet2 = new Vetor(3);
		vet2.adiciona(0, 3);
		vet2.adiciona(1, 4);
		vet2.adiciona(2, 5);
		
		// Teste soma total
		int somaVet1 = vet1.soma();
		System.out.printf("Soma vetor 1: %d \n", somaVet1);
		
		int somaVet2 = vet2.soma();
		System.out.printf("Soma vetor 2: %d \n", somaVet2);
		
		// Teste maior e menor valores
		System.out.printf("Maior valor no vetor 1: %d \n", vet1.maiorValor());
		System.out.printf("Menor valor no vetor 1: %d \n", vet1.menorValor());
		
		System.out.printf("Maior valor no vetor 2: %d \n", vet2.maiorValor());
		System.out.printf("Menor valor no vetor 2: %d \n", vet2.menorValor());
		
		// Teste soma elementos
		System.out.print("Soma vetores 1 e 2: ");
		Vetor vet3 = vet1.somaVetor(vet2);
		for (int valor : vet3.getItens()) {
			System.out.print(valor + " ");
			
		}
	}
}
