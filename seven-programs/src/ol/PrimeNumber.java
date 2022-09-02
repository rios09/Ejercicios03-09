package ol;

public class PrimeNumber {

	private int num;
	private boolean prime=true;
	
	public PrimeNumber() {
		
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	
	public void primeCacl() {
		
		for( int i = 2; i<num; i++) {
			if(num%i == 0) {
				prime = false;
				break;
			}
		}
		
		if(prime) {
			System.out.println(num+" es primo\n");
		}else {
			System.out.println(num+" no es primo\n");
		}
	}
}
