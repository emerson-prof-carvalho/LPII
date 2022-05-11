package model;

import java.util.List;

public class Departamento {
	
	private String descricao;
	private List<Funcionario> funcinarios;
	
	public Departamento(String pDescricao) {
		
		this.descricao = pDescricao;
	}
	
	public String getDescricao() {
		
		return this.descricao;
	}
}
