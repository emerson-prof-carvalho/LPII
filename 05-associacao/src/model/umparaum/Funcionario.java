package model.umparaum;

public class Funcionario {
	private String nome;
	private Departamento gerencia;

	public Funcionario(String nome) {
		this.nome = nome;
	}
	
	public Departamento getGerencia() {
		return gerencia;
	}

	public void setGerencia(Departamento gerencia) {
		this.gerencia = gerencia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}