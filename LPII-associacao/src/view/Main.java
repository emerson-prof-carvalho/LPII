package view;

import model.Departamento;
import model.Funcionario;

public class Main {

	public static void main(String[] args) {
		
		Departamento ti = new Departamento("Tecnologia");
		
		Funcionario emerson = new Funcionario("Emerson Assis", 
				1.500, ti);
		
		System.out.println(emerson.getNome());
		System.out.println(emerson.getSalario());
		System.out.println(emerson.getDepartamento().getDescricao());
	}
}
