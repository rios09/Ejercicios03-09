package gui;

import java.util.Scanner;

import bl.DecimalData;
import bl.FactorialData;
import bl.MruData;
import bl.ParaboleData;
import bl.PrimeData;
import bl.RandomData;
import bl.TempData;

public class Gui {

	Scanner scan = new Scanner(System.in);
	public void showOptions() {
		System.out.println("Bienvenido a la aplicacion! \n"+"Ingrese la opcion numerica del programa que desea ejecutar:\n");
		System.out.println("1. Calcular la velocidad de un MRU");
		System.out.println("2. Calcular la altura máxima de un proyectil con trayectoria parabólica.");
		System.out.println("3. Ientificar si un número es primo");
		System.out.println("4. Calcular el factorial de un número");
		System.out.println("5. Programa para generar un numero aleatorio o Sumar 2 numeros");
		System.out.println("6. Convertir un número decimal  a un número binario");
		System.out.println("7. Conversor de Temperaturas");
		System.out.println("8. Salir de la App\n");
	}
	
	public void menu() {
		short op = 0;
		do {
			System.out.println();
			showOptions();
			System.out.println();
			op = scan.nextShort();
			switch (op) {
			case 1:
				MruData d = new MruData();
				d.MruInfo();
				break;
			
			case 2:
				ParaboleData pd = new ParaboleData();
				pd.paraboleInfo();
				break;

			case 3:
				PrimeData pda = new PrimeData();
				pda.primeInfo();
				break;
			
			case 4:
				FactorialData fd = new FactorialData();
				fd.factorialInfo();
				break;
				
			case 5:
				RandomData rda = new RandomData();
				rda.randomInfo();
				break;
				
			case 6:
				DecimalData dcd = new DecimalData();
				dcd.decimalInfo();
				break;
				
			case 7:
				TempData tpd = new TempData();
				tpd.tempInfo();
				break;

			case 8:
				System.exit(0);
				break;
				
			default: System.out.println("La opcion no es valida");
			}
			
		} while(op != 8);
			
		
		
		
	}
}
