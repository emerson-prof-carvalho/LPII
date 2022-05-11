package model;

public class Funcionario {

	private String nome;
	private double salario;
	private Departamento departamento;
	
	public Funcionario(String pNome, double pSalario, Departamento pDpto) {
		
		this.nome = pNome;
		this.salario = pSalario;
		this.departamento = pDpto;
	}
	
	public String getNome() {
		
		return this.nome;
	}
	
	public double getSalario() {
		
		return this.salario;
	}

	public Departamento getDepartamento() {
		
		return this.departamento;
	}
}
