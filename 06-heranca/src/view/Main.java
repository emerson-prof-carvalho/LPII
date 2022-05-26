package view;

import model.Usuario;
import model.Aluno;

public class Main {
	public static void main(String args[]) {
		Usuario usuario1 = new Usuario("050.1");
		usuario1.setNome("Emerson");
		
		System.out.println(usuario1.dadosFormatados());
		
		Aluno aluno1 = new Aluno("123.1", "321");
		aluno1.setNome("Ana");
		aluno1.setCurso("Sistemas");
		
		System.out.println(aluno1.dadosFormatados());
	}
}
