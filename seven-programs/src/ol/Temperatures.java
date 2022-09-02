package ol;

public class Temperatures {
	
	private double celsius;
	private double fahrenheit;
	private double kelvin;
	private double conversion;
	
	public Temperatures() {
	}
	
	public double getCelsius() {
		return celsius;
	}


	public void setCelsius(double celsius) {
		this.celsius = celsius;
	}


	public double getFahrenheit() {
		return fahrenheit;
	}


	public void setFahrenheit(double fahrenheit) {
		this.fahrenheit = fahrenheit;
	}


	public double getKelvin() {
		return kelvin;
	}


	public void setKelvin(double kelvin) {
		this.kelvin = kelvin;
	}


	public void C2F() {
		conversion = ((celsius * 1.8) + 32);
		System.out.println(celsius+"°C = "+conversion+"°F\n");
	}
	
	public void F2C() {
		conversion = ((fahrenheit -32) * 0.555555555);
		System.out.println(fahrenheit+"°F = "+conversion+"°C\n");
	}
	
	public void C2K() {
		conversion = (celsius + 273.15);
		System.out.println(celsius+"°C = "+conversion+"K\n");
	}
	
	
	public void K2C() {
		conversion = (kelvin - 273.15);
		System.out.println(kelvin+"K = "+conversion+"°C\n");
	}
	
	
	public void F2K() {
		conversion= ((fahrenheit - 32) * 0.5555555 + 273.15);
		System.out.println(fahrenheit+"°F = "+conversion+"K\n");
	}
	
	
	public void K2F() {
		conversion = ((kelvin - 273.15) * 1.8 + 32);
		System.out.println(kelvin+"K = "+conversion+"°F\n");
	}
	
}
