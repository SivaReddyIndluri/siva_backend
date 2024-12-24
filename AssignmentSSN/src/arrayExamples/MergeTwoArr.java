package arrayExamples;

//Copy Elements from One Array to Another
public class MergeTwoArr {
	int[] arr = { 12, 54, 23, 67, 89 };
	int[] arr1 = new int[arr.length];

	public void m1() {
		for (int i = 0; i <= arr.length - 1; i++) {
			arr1[i] = arr[i];
		}
		System.out.println("After copy elements from one array to another");
		for (int ss : arr1) {
			System.out.print(ss + " ");
		}

	}

	public static void main(String[] args) {
		MergeTwoArr mm = new MergeTwoArr();
		mm.m1();
	}

}
