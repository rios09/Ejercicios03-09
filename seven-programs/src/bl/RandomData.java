package bl;

import java.util.Scanner;

import gui.Gui;
import ol.RandomSum;

public class RandomData {
	RandomSum rs = new RandomSum();
	Scanner scan = new Scanner(System.in);
	
	public void randomOption() {
		System.out.println("El programa a continuacion tiene 2 funciones, seleccione la opcion que desea ejecutar: \n"
				+ "1. Generar un numero Aleatorio\n"+"2. Sumar dos numeros\n"+"3. Volver al Menu principal");		
	}
	
	public void randomInfo() {
		randomOption();
	rs.setOp(scan.nextInt());
	if(rs.getOp() >3 || rs.getOp()<1) {
		System.out.println("Opcion ingresada es invalida!\n");
		randomInfo();
	}else {
		switch(rs.getOp()) {
		case 1:
			rs.randomCalc();
			break;
		case 2:
			System.out.println("Ingrese el primer numero:\n");
			rs.setNum1(scan.nextInt());
			System.out.println("Ingrese el segundo numero:\n");
			rs.setNum2(scan.nextInt());
			rs.sumCalc();
			break;
		case 3:
			Gui mm = new Gui();
			mm.menu();
			break;
		}
	}
	}
}
