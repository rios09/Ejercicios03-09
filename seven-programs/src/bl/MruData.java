package bl;

import java.util.Scanner;

import ol.Mru;

public class MruData {
	
Scanner scan = new Scanner(System.in);
	
	public void MruInfo() {
		
		Mru m = new Mru();
		System.out.println("A continuacion se calculara la velocidad de un MRU\n"+"Ingrese la distancia en metros que recorrio el objeto:\n");
		m.setDistance(scan.nextDouble());
		System.out.println("Ahora ingresa el tiempo en segundos que duro el desplazamiento el objeto:\n");
		m.setTime(scan.nextDouble());
		m.mruCalc();
	}
}
