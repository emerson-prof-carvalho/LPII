// Importa a classe Scanner do pacote java.io
import java.util.Scanner;

// Declara uma classe pública chamada Main.
// O nome dessa classe precisa ter o mesmo nome do arquivo fonte
public class Main {

	// Método de entrada da aplicação, que é executado quando
	// rodamos o programa
	public static void main(String[] args) {
		
		// Escreve na saída do terminal a partir do 
		// fluxo de saída System.out
		System.out.print("Digite seu nome: ");
		
		// Bloco de código protegido contra erros
		try 
		{
			// A classe Scanner permite ler do teclado a partir
			// do fluxo de entrada System.in
			Scanner leitor = new Scanner(System.in);
			
			// nextLine() lê o texto digitado pelo usuário e retorna no formato 
			// String, que é uma representação de um texto
			String nome = leitor.nextLine();
			
			// Fecha o fluxo de entrada aberto com o SO
			leitor.close();
			
			// Podemos usar o operador '+' para concatenar strings
			System.out.print("Olá " + nome + ", bem vindo ao mundo Java!\n");
		
		// Em caso de algum erro dentro do bloco, o catch pega esse erro 
		// como uma exceção. O bloco de código dentro das chaves do catch
		// tem a oportunidade de tratar o erro
		} 
		catch (Exception e) {
			
			System.out.println("Houve algum erro de entrada de dados.");
		}
	}
}