package multiThread;

public class MultiThread {
	
	public static void main(String[] args) {
		Thread t = new Thread();
		t.setName("Sumanth");
		
		Thread t1 = new Thread();
		t1.setName("sumanth");
		
		System.out.println(t.getId() + " "+t.getName());
		System.out.println(t1.getId() + " "+t1.getName());
		
		MultiThread c = new  MultiThread();
	}

}
