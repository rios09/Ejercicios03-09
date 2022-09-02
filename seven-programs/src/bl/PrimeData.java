package bl;

import java.util.Scanner;

import ol.PrimeNumber;

public class PrimeData {
	
	 Scanner scan = new Scanner(System.in);
	 
	 public void primeInfo () {
		 PrimeNumber pm = new PrimeNumber();
		 System.out.println("A continuacion se determinara si el numero ingresado es Primo\n"
		 		+ "Ingrese el numero porfavor: \n");
		 pm.setNum(scan.nextInt());
		 pm.primeCacl();		 
 }
}


