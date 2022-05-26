package model;

public class Aluno extends Pessoa {
	private String matricula;
	private String curso;
	
	public Aluno(String cpf, String matricula){
		super(cpf);
		
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getMatricula() {
		return matricula;
	}
	
	@Override
	public String dadosFormatados(){
		String dadosPessoa = super.dadosFormatados();
		
		String dadosAluno = String.format("Mat: %s\nCurso: %s\n", 
				this.matricula, this.curso);
			
		return dadosPessoa + dadosAluno;
	}
}