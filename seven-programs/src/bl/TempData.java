package bl;

import java.util.Scanner;

import gui.Gui;
import ol.Temperatures;

public class TempData {
	Scanner scan = new Scanner(System.in);
	
	public void tempMenu() {
		System.out.println("A continuacion se mostrara un menu de opciones para realizar conversiones de temperaturas\n"+
	    "Selecciona la opcion numerica que deseas ejecutar:");
		System.out.println();
		System.out.println("1. Convertir De celsius a fahrenheit");
		System.out.println("2. Convertir De fahrenheit a celsius");
		System.out.println("3. Convertir De celsius a kelvin");
		System.out.println("4. Convertir De kelvin a celsius");
		System.out.println("5. Convertir De fahrenheit a kelvin");
		System.out.println("6. Convertir De kelvin a fahrenheit");
		System.out.println("7. Volver al menu Principal");
	}
	
	public void tempInfo() {
		Temperatures temp = new Temperatures();
		short op =0;
		tempMenu();
		op=scan.nextShort();
		if(op<1 || op>7) {
			System.out.println("La opcion ingresada es incorrecta!");
			tempInfo();
		}else {
			switch(op) {
			case 1:
				System.out.println("Ingrese los grados Celsius:\n");
				temp.setCelsius(scan.nextDouble());
				temp.C2F();
				break;
				
			case 2:
				System.out.println("Ingrese los grados Fahrenheit: \n");
				temp.setFahrenheit(scan.nextDouble());
				temp.F2C();
				break;
				
			case 3:
				System.out.println("Ingrese los grados Celsius: \n");
				temp.setCelsius(scan.nextDouble());
				temp.C2K();
				break;
				
			case 4:
				System.out.println("Ingrese los grados Kelvin:\n");
				temp.setKelvin(scan.nextDouble());
				temp.K2C();
				break;
				
			case 5:
				System.out.println("Ingrese los grados Fahrenheit:\n");
				temp.setFahrenheit(scan.nextDouble());
				temp.F2K();
				break;
				
			case 6:
				System.out.println("Ingrese los grados Kelvin:\n");
				temp.setKelvin(scan.nextDouble());
				temp.K2F();
				break;
				
			case 7:
				Gui m = new Gui();
				m.menu();
				break;
		
			}
		}
		
	}
}
