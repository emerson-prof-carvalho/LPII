package model;

public class Gerente extends Empregado {
	private double salario;
	
	public Gerente(String nome, String fone, double salario) {
		super(nome, fone);
		this.salario = salario;
	}
	
	@Override
	public double salario() {
		return this.salario;
	}
}
