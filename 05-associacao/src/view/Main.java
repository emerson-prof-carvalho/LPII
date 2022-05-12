package view;

import model.Departamento;
import model.Funcionario;

public class Main {

	public static void main(String[] args) {
		
		Departamento ti = new Departamento("Tecnologia");
		
		Funcionario emerson = new Funcionario("Emerson Assis", 
				1.500, ti);
		
		Funcionario joseh = new Funcionario("Joseh", 
				2.500, ti);
		
		System.out.println(emerson.getNome());
		System.out.println(emerson.getSalario());
		System.out.println(emerson.getDepartamento().getDescricao());
		
		System.out.println(joseh.getNome());
		System.out.println(joseh.getSalario());
		System.out.println(joseh.getDepartamento().getDescricao());
		
		ti.adicionaFuncionario(emerson);
		ti.adicionaFuncionario(joseh);

		System.out.println("+++++++");
		for (Funcionario f : ti.getFuncionaios()) {
			System.out.println(f.getNome());
		}
	}
}
