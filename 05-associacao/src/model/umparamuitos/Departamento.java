package model.umparamuitos;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
	// Constantes indicando o máximo e mínimo de funcionários
	private static final int MAXIMO_FUNCIONARIOS = 5;
	private static final int MINIMO_FUNCIONARIOS = 1;
	
	private String nome;
	private List<Funcionario> funcionarios;
	
	public Departamento(String nome, Funcionario funcionario) {
		this.nome = nome;
		funcionarios = new ArrayList<Funcionario>();
		
		adicionaFuncionario(funcionario);
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public List<Funcionario> getFuncionarios() {
		return this.funcionarios;
	}

	public boolean adicionaFuncionario(Funcionario funcionario) {
		if (funcionario == null)
			return false;

		// Já tem o limite de funcionários no departamento
		if (funcionarios.size() >= MAXIMO_FUNCIONARIOS)
			return false;
		
		return funcionarios.add(funcionario);
	}
	
	public boolean removeFuncionario(Funcionario funcionario) {
		if (funcionario == null)
			return false;
		
		// Para garantir o mínimo de funcionários no departamento
		if (funcionarios.size() <= MINIMO_FUNCIONARIOS)
			return false;
		
		return funcionarios.remove(funcionario);
	}
}