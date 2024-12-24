package arrayExamples;

public class ArrayAs {
	/*
	 * public void m1() { int[] arr = {2,59,7,9,11,35}; boolean flag = false;
	 * for(int i =0; i<=arr.length;i++) { if(arr[i]<arr[i+1]) { flag = true; break;
	 * } } if(!flag) System.out.println("elements in the order of accending"); else
	 * System.out.println("not a assending order:"); }
	 * 
	 * public static void main(String[] args) { ArrayAs ss = new ArrayAs(); ss.m1();
	 * }
	 */
	// copy an elements from one array to another array
	public void m1() {
		int[] arr = { 12, 54, 23, 87, 23 };
		int[] arr1 = new int[arr.length];
		for (int i = 0; i <= arr.length - 1; i++) {
			arr1[i] = arr[i];
		}
		for (int ar : arr1) {
			System.out.print(ar + " ");
		}
	}

	// Count Even and Odd Numbers in an Array
	public void m2() {
		int arr[] = { 12, 5, 87, 34 };
		int evencount = 0;
		int oddcount = 0;
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] % 2 == 0) {
				evencount = evencount + arr[i];
			} else
				oddcount = oddcount + arr[i];
		}
		System.out.println("even numbers count:" + evencount);
		System.out.println("even numbers count:" + oddcount);
	}

	// Find Duplicate Elements in an Array
	public void m4() {
		int[] arr = { 1, 2, 3, 4, 1, 5, 2 };

		boolean foundDuplicate = false;

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					foundDuplicate = true;
					System.out.println("Duplicate elements found: " + arr[i]);
				}
			}
		}
		 if (!foundDuplicate) {
	            System.out.println("No duplicate elements found in the array.");
	        }
	}

	public static void main(String[] args) {
		ArrayAs ss = new ArrayAs();
		ss.m4();
	}

}
