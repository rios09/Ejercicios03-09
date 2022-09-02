package ol;

import bl.FactorialData;

public class Factorial {
	
	private long factorial = 1;
	private int number;
	
	public Factorial() {
		
	}
	
	public long getFactorial() {
		return factorial;
	}
	
	public void setFactorial(long factorial) {
		this.factorial = factorial;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public void factorialCalc() {
		FactorialData fda = new FactorialData();
		if(number < 0) {
		 System.out.println("No se puede calcular el factorial de un numero negativo\n");
		 fda.factorialInfo();
		} else if(number<=1) {
			System.out.printf("%d! = %d\n",number,factorial);
		}else {
			for(int contador = number; contador>=2; contador-- ) {
				factorial = factorial * contador;
			}
			System.out.printf("%d! = %d\n",number,factorial);
		}
	}
	
	}

