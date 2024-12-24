package strings;

public class Fibonacci {
	
	public void m1() {
		int num = 10;
		int f1=0,f2=1,f3;
		System.out.println(f1+" "+f2);
		for(int i =2; i<=num; i++) {
			f3 = f1 + f2;
			System.out.print(" "+f3);
			f1 = f2;
			f2 = f3;
		}
	}
	public static void main(String[] args) {
		Fibonacci f = new Fibonacci();
		f.m1();
	}

}
