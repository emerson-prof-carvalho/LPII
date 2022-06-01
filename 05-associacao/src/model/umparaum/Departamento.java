package model.umparaum;

public class Departamento {
	private String nome;
	private Funcionario gerente;
	
	public Departamento(String nome) {
		this.nome = nome;
	}

	public Funcionario getGerente() {
		return gerente;
	}

	public void setGerente(Funcionario gerente) {
		this.gerente = gerente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}