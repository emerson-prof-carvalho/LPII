package view;

import model.Comissionado;
import model.Empregado;
import model.Horista;

public class Main {

	public static void main(String[] args) {
		Empregado comissionado = new Comissionado(
				"Juan", "99...", 5000, 50, 100);
		
		Horista horista = new Horista("Maria", "88...");
		horista.setValorHora(80);
		horista.setTotalHoras(200);
		
		System.out.println("Salário comissionado");
		System.out.println(comissionado.getNome() + " " + 
				comissionado.salario());
		
		System.out.println("Salário horista");
		System.out.println(horista.getNome() + " " +
				horista.salario());
	}
}
