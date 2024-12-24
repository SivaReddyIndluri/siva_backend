package arrayExamples;

import java.lang.reflect.Array;
import java.util.Arrays;

//Write a Java program that demonstrates the use of arrays
// Declare and initialize an array of integers
// Print the elements of the array
// Sort the array in ascending order
// Print the sorted array
// Find the sum of all elements in the array
// Find the maximum element in the array
// Find the average of all elements in the array

public class UseOfArray {

	public void m1() {
		// Declare and initialize an array of integers
		int[] arr = { 12, 5, 9, 23, 65 };
		// Print the elements of the array
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		// Sort the array in ascending order
		Arrays.sort(arr);
		// Print the sorted array
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.print(arr[i] + " ");
		}
		// Find the sum of all elements in the array
		int sum = 0;
		for (int i = 0; i <= arr.length - 1; i++) {
			sum = sum + arr[i];
		}
		System.out.println("\n" + sum);

		// Find the maximum element in the array
		int max = arr[0];
		for(int i =0; i<=arr.length-1;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println("Maximum element in the arry is:"+ max);
		// Find the average of all elements in the array
		 double db = sum/arr.length;
		 System.out.println(db);

	}

	public static void main(String[] args) {
		UseOfArray ss = new UseOfArray();
		ss.m1();
	}

}
