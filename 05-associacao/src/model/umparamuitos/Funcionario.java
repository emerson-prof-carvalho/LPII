package model.umparamuitos;

public class Funcionario {
	private String nome;
	private Departamento departamento;

	public Funcionario(String nome) {
		this.nome = nome;
	}
	
	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}