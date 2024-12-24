package strings;

public class MinRMax {
	
	public void m1() {
		int[] arr = {23,4,7,98,46,23,9};
		int min = arr[0];
		int max = arr[1];
		for(int i : arr) {
			if(i < min) 
				min = i;	
			if(i>max)
				max = i;
		}
		
		System.out.println("Max number is:"+max);
		System.out.println("Min number is:"+min);
		
	}
	public static void main(String[] args) {
		MinRMax min = new MinRMax();
		min.m1();
	}

}
