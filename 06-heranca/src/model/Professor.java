package model;

public class Professor extends Usuario {
	private String siape;
	private String area;
	
	public Professor(String pCPF, String pSiape) {
		super(pCPF);
		
		this.siape = pSiape;
	}
	
	public String getSiape() {
		return this.siape;
	}
	
	public void setArea(String pArea) {
		this.area = pArea;
	}
	
	public String getArea() {
		return this.area;
	}
	
	@Override
	public String dadosFormatados() {
		
		return super.dadosFormatados() + String.format(
				"Siape: %s\n", siape);
	}
}