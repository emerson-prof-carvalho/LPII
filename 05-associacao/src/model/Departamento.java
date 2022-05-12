package model;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
	
	private String descricao;
	private List<Funcionario> funcinarios;
	
	public Departamento(String pDescricao) {
		
		this.descricao = pDescricao;
		this.funcinarios = new ArrayList<Funcionario>();
	}
	
	public void adicionaFuncionario(Funcionario pFuncionario) {
		if(this.funcinarios.size() < 5) {
			this.funcinarios.add(pFuncionario);
		}
	}
	
	public List<Funcionario> getFuncionaios(){
		return this.funcinarios;
	}
	
	public String getDescricao() {
		
		return this.descricao;
	}
}
