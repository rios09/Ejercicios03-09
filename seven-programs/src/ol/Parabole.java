package ol;

public class Parabole {

		private double iVelocity;
		private double angle;
		private double gravity = 10;
		private double maxHeight;
				
		
		public Parabole() {
			
		}
		
		public double getiVelocity() {
			return iVelocity;
		}


		public void setiVelocity(double iVelocity) {
			this.iVelocity = iVelocity;
		}


		public double getAngle() {
			return angle;
		}



		public void setAngle(double angle) {
			this.angle = angle;
		}


		public void paraboleCalc() {
		iVelocity= Math.pow(iVelocity, 2);
		angle = Math.toRadians(angle);
		angle = Math.sin(angle);
		angle = Math.pow(angle, 2);
		gravity = 20;
		maxHeight = ((iVelocity * angle) / gravity);
		System.out.println("La altura maxima que alcanzo el movimiento parabolico fue de "+ maxHeight+ " metros\n");

		}
}
