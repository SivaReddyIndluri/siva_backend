package pallyTechPractice;

public interface InterfaceEx {
	
	void m1();
	private void m2() {
		System.out.println("private method in interface:");
	}
	default void m3() {
		m2();
		System.out.println("Default method in interface");
	}
	public static void m4() {
		System.out.println("static method in interface");
	}
	

}
