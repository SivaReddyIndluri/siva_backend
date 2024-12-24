package codingPractice;

public class Palindrom {
	
	public void m1() {
		int num = 121;
		int ast = num;
		int count = 0;
		while(num>0) {
			int n = num%10;
			num = num/10;
			count = (count * 10) + n;	
		}if(count == ast)
			System.out.println("Given number is ast num");
		else 
			System.out.println("given num is not a ast num");
	}
	
	public static void main(String[] args) {
		Palindrom s = new Palindrom();
		s.m1();
	}

}
