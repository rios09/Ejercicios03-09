package bl;

import java.util.Scanner;

import ol.DecimalToBinary;

public class DecimalData {
	
	Scanner scan = new Scanner(System.in);
	
	public void decimalInfo() {
		
		DecimalToBinary dtb = new DecimalToBinary();
		System.out.print("A continuacion se convertira el numero decimal que ingreses a Binario\n"+"Ingresa el numero a convertir: \n");
		dtb.setNum(scan.nextInt());
		dtb.decimalCalc();
	}
}
