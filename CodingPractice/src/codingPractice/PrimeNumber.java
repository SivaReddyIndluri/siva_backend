package codingPractice;

public class PrimeNumber {
	
	public void m1() {
		int num =  50;
		boolean b = false;
		for(int i= 2; i<num; i++) {
			if(num%i == 0) {
				b = true;
				break;
			}
		}
		if(b)
			System.out.println("given num is prime");
		else
			System.out.println("given num is not a prime");
		
		
	}
	
	public static void main(String[] args) {
		PrimeNumber p = new PrimeNumber();
		p.m1();
	}

}
