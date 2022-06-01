package model;

public class Professor extends Pessoa {
	private String siape;
	
	public Professor(String cpf, String siape) {
		super(cpf);
		
		this.siape = siape;
	}
	
	@Override
	public String dadosFormatados() {
		
		return super.dadosFormatados() + String.format(
				"Siape: %s\n", siape);
	}
}
