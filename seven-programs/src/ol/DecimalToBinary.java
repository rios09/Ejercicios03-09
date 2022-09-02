package ol;

public class DecimalToBinary {
	
	private int i=0;
	private int num;
	private int binary[] = new int[100];
	
	
	public DecimalToBinary() {
		
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public void decimalCalc() {
		while(num != 0) {
			binary[i] = num%2;
			num = num / 2;
			i++;
		}
	System.out.print("El numero en binario es: ");	
	
	for(int j = i-1; j>=0; j--) {
		
		System.out.print(""+binary[j]+"\n");
		
	}
	}
	
}
