package strings;

public class Palindrom {
	
	public void m1() {
		int s = 121;
		int rev = 0;
		int temp = s;
		while(s<0) {
			int s1 = s%10;
			 s = s/10;
			 rev = (rev*10) + s1;	 
		}
		if(rev == temp) 
			System.out.println("Given number is a Palindrom number:");
		else 
			System.out.println("Given number is not a palindrom number pls cross verify onces >>>");
	}
	public static void main(String[] args) {
		Palindrom p = new Palindrom();
		p.m1();
		
	} 

}
