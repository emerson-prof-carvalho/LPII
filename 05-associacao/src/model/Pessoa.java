package model;

public class Pessoa {
	private String nome;
	private String cpf;
	
	public Pessoa(String cpf){
		this.cpf = cpf;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public String getCPF(){
		return this.cpf;
	}
	
	public String dadosFormatados(){
		return String.format("CPF: %s\nNome: %s\n", 
				this.cpf, this.nome);
	} 
}
