package strings;

import java.util.StringTokenizer;

//•	How do you remove a specific character from a string in Java?

public class StringReplace {
	
	public void m1() {
		String str = "SivaReddy";
		 str = str.replace("S", "");
		System.out.println(str);
	}
	
	//•	How do you check if a string starts with a specific character in Java?
	
	public void m2(){
		String str = "SivaReddy";
		String ch ="k";
		if(str.startsWith(String.valueOf(ch))) {
			System.out.println("String Start with"+ch);
		}else
			System.out.println("String Not start with"+ch);
	  
	}
	//•	How do you remove the first character from a string in Java?
	public void m3() {
		String str ="Siva";
		 str = str.substring(1);
		System.err.println(str);
	}
	public void m4() {
		String str = "Sivreddy";
		str = str.substring(0,str.length()-1);
		System.out.println(str);
	
	}
	
	public void m5() {
		StringTokenizer tokenizer = new StringTokenizer("Hello, World! This is Java.");
		if (tokenizer.hasMoreTokens()) {
		    String token = tokenizer.nextToken();
		    System.out.println(token);
		}
	}
	public static void main(String[] args) {
		StringReplace st = new StringReplace();
		//st.m1();
		//st.m2();
		//st.m3();
		//st.m4();
		st.m5();
	}

}
