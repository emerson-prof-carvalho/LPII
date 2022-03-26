package main;

import java.util.List;

import model.Calc;

public class Main {

	public static void main(String[] args) {
		
		Calc calc = new Calc();
		System.out.println("Soma: 9 + 2: " + calc.sum(9, 2));	
		System.out.println("Sub: 9.5 - 2.5: " + calc.sub(9.5, 2.5));
		System.out.println("Div: 9 / 2: " + calc.div(9, 2));
		System.out.println("Mult: 9 * 2: " + calc.mult(9, 2));
		
		
		List<String> operations = calc.getLastOperations();
		System.out.println("Operações realizadas");
		for (String operation : operations) {
			System.out.println(operation);
		}
	}

}
