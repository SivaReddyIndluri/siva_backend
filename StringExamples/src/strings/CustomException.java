package strings;

public class CustomException extends Exception {
	
	public void m1() {
		try {
			int a = 10/0;
			throw new RuntimeException("Invalid input number Id of getting :" + a);
		}catch (Exception e) {
			//throw e;
			System.out.println(e);
		}	
	}
	public static void main(String[] args) {
		CustomException ss = new CustomException();
		ss.m1();
	}

}
