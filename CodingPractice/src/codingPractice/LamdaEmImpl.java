package codingPractice;

public class LamdaEmImpl {

	public void m2() {

		LamdaEx ex = (a, b) -> {
			if (a.equals(b))
				System.out.println("both are equal:");
			else
				System.out.println("Both are not equal ");

			return null;
		};
		ex.m1("siva", "reddy");
	}

	public static void main(String[] args) {
		LamdaEmImpl lf = new LamdaEmImpl();
		lf.m2();

	}

}
