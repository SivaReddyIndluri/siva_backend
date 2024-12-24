package pallyTechPractice;
//Take an array of numbers and print the position of a given element x. If element is not
//available print “element not available”.
public class ArrayElement {
	public static void m1() {
		int[] arr = {12,54,23,65,65,65,9};
		int pos = 65;
		int count =  0;
		for(int i =0; i<=arr.length-1; i++) {
			if(arr[i] == pos) {
				count ++;
			}
		}
		System.out.println("Given number is counted:"+" "+ count);
	}
	
	public static void main(String[] args) {
		ArrayElement.m1();
		
	}

}
