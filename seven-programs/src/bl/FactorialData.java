package bl;

import java.util.Scanner;

import ol.Factorial;

public class FactorialData {
	
	Scanner scan = new Scanner (System.in);
	public void factorialInfo() {
		Factorial f = new Factorial();
		System.out.println("A continuacion se calculara el factorial del numero que ingreses \n"
				+ "Digita el numero: \n");
		f.setNumber(scan.nextInt());
		f.factorialCalc();
		
	}
}
