package arrayPrac;

public class ArrayOne {
	
	public void m1(int[] s) {
		
		int max = s[0];
		int min = s[0];
		for(int i =0; i<=s.length-1; i++) {
			if(s[i]<min) {
				min = s[i];
			}
			if(s[i]>max) {
				max = s[i];
			}
		}
		System.out.println("Maximun number is--"+max);
		System.out.println("Minimum number is--"+min);
		
	}
	public static void main(String[] args) {
		ArrayOne str = new ArrayOne();
		int[] ss = {23,5,36,87,23};
		str.m1(ss);
	}

}
