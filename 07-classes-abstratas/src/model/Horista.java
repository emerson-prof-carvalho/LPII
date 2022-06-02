package model;

public class Horista extends Empregado {
	private double valorHora;
	private double totalHoras;
	
	public Horista(String nome, String fone) {
		super(nome, fone);
	}
	
	@Override
	public double salario() {
		return valorHora * totalHoras;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public double getTotalHoras() {
		return totalHoras;
	}

	public void setTotalHoras(double totalHoras) {
		this.totalHoras = totalHoras;
	}
}
