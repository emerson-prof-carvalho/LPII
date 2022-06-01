package view;

import model.umparaum.Departamento;
import model.umparaum.Funcionario;

public class Main {
	public static void main(String[] args) {
		// Testes um para um
		Funcionario emerson = new Funcionario("Emerson");
		Departamento ti = new Departamento("TI");

		emerson.setGerencia(ti);
		ti.setGerente(emerson);

		System.out.println("Gerente do departamento de TI: " + 
				ti.getGerente().getNome());

		System.out.println("Departamento que o Emerson gerencia: " +
				emerson.getGerencia().getNome());
		
		// Testes um para muitos
		model.umparamuitos.Funcionario luiza = new 
				model.umparamuitos.Funcionario("Luiza");
		model.umparamuitos.Funcionario rosania = new 
				model.umparamuitos.Funcionario("Rosania");
		model.umparamuitos.Funcionario noe = new 
				model.umparamuitos.Funcionario("Noé");
		
		model.umparamuitos.Departamento ensino = new 
				model.umparamuitos.Departamento("Ensino", luiza);
		
		ensino.adicionaFuncionario(rosania);
		ensino.adicionaFuncionario(noe);
		
		luiza.setDepartamento(ensino);
		rosania.setDepartamento(ensino);
		noe.setDepartamento(ensino);
		
		System.out.println("Funcionários do departamento " 
				+ ensino.getNome() + ".");
		for (model.umparamuitos.Funcionario func : ensino.getFuncionarios()) {
			System.out.println(func.getNome());
		}
		
		ensino.removeFuncionario(noe);
		System.out.println("Funcionários do departamento " 
				+ ensino.getNome() + " após remoção.");
		for (model.umparamuitos.Funcionario func : ensino.getFuncionarios()) {
			System.out.println(func.getNome());
		}
	}
}