package bl;

import java.util.Scanner;

import ol.Parabole;

public class ParaboleData {

		Scanner scan = new Scanner(System.in);
		public void paraboleInfo() {
			Parabole p = new Parabole();
			System.out.println("A continuacion se calculara la altura máxima de un proyectil con trayectoria parabólica\n"
					+ "por favor ingrese la velocidad incial en metros por segundos\n");
			p.setiVelocity(scan.nextDouble());
			System.out.println("\n Ahora ingrese el angulo que fue disparado la particula: \n");
			p.setAngle(scan.nextDouble());
			p.paraboleCalc();
		}
}
