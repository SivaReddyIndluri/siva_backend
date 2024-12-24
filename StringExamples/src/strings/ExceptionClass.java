package strings;

import java.util.ArrayList;
import java.util.List;

public class ExceptionClass {
	public static void main(String[] args) {
		
		/*String s1 = new String("xyz");
		String s2 = "xyz";
		System.out.println(s1.intern()== s2);*/
		
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.set(1, "C");
		list.add("D");
		System.out.println(list);
		
	}
}
