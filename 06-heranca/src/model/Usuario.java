package model;

public class Usuario {
	private String nome;
	private String cpf;
	
	public Usuario(String pCPF){
		this.cpf = pCPF;
	}
	
	public String getCPF(){
		return this.cpf;
	}

	public void setNome(String pNome){
		this.nome = pNome;
	}
	
	public String getNome(){
		return this.nome;
	}

	public String dadosFormatados(){
		return String.format("CPF: %s\nNome: %s\n", 
				this.cpf, this.nome);
	} 
}