package strings;

public class StringEvenOrOdd {
	
	public void m1() {
		String str = " SivaReddy";
		str = str.toLowerCase();
		int count = 0;
		int consonent=0;
		//char[] ch = str.toCharArray();		
		for(char ch : str.toCharArray()) {
			if(ch>='a'&&ch<='z') {
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='o') {
					count++;
				}else {
					consonent++;
				}	
			}
		}
		System.out.println("Number of Vowels"+count);
		
		System.out.println("Number of consonents"+consonent);
		
	}
	public static void main(String[] args) {
		StringEvenOrOdd ss = new StringEvenOrOdd();
		ss.m1();
	}

}
