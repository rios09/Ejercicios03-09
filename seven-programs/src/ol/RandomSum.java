package ol;
import java.util.Random;

public class RandomSum {
	
	private int op;
	private int num1;
	private int num2;
	private int result;
	
	public RandomSum() {
		
	}

	public int getOp() {
		return op;
	}

	public void setOp(int op) {
		this.op = op;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public void randomCalc() {
		Random random = new Random();
		int x = random.nextInt();
		System.out.println(x+"\n");
	}
	
	public void sumCalc() {
		result = num1 + num2;
		System.out.println("La suma de "+num1+" y "+num2+" es: "+result+"\n");
	}

}
