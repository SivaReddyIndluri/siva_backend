package luckySir;

public class LuckySirPra { 
	public void m1() {
		
		String str = "momgf";
		String rev ="";
		for(int i = str.length()-1; i>=0;i--) {
			 rev = rev + str.charAt(i);
		}
		
		boolean isignoreCase = str.equalsIgnoreCase(rev);
		//System.out.println(str + "String is Palindrom" + isignoreCase);
		if(rev.equals(str))
			System.out.println("Given String is palindrom:" + isignoreCase);
		else
			System.out.println("Given String is not palindrom:" + isignoreCase);
			
	}

	public static void main(String[] args) {
		LuckySirPra f = new LuckySirPra();
		f.m1();
	}

}
