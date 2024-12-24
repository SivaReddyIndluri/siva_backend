package arrayExamples;

  //Check if Array Contains a Specific Element Program
public class ArrayEx {
	
	public void m1() {
		
		int[] arr = {12,54,2,87,4,23};
		int ns = 54;
		boolean b = false;
		for(int i =0; i<=arr.length-1;i++) {
			if(arr[i]==ns) {
				b = true;
				//System.out.println("given number is found:" +arr[i]);
				break;
			}
		}if(b) 
			System.out.println("element  found:");
		else
			System.out.println("element not found");
		
	}
	
	public static void main(String[] args) {
		ArrayEx ex = new ArrayEx();
		ex.m1();
		
	}

}
