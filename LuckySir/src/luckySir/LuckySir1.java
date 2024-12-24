package luckySir;

public class LuckySir1 {
	
	public void m1() {
		int s =20;
		for(int i =0; i<=s;) {
			if(i%2==0) {
				System.out.println("Given Number is even ");
			}else
				System.out.println("Given Num is odd");
			
		}
		
	}
	
	public static void main(String[] args) {
		LuckySir1 sd = new LuckySir1();
		sd.m1();
	}
}
