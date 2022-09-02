package ol;

public class Mru {
	
	private double distance;
	private double time;
	private double speed;
	
	public Mru() {	
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public double getTime() {
		return time;
	}

	public void setTime(double time) {
		this.time = time;
	}
	
	public void mruCalc() {
		speed = (distance / time);
		System.out.println("la velocidad del MRU es: "+speed+" m/s² \n");
	}
	
	
	
	
}
