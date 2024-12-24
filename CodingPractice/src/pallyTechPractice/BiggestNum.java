package pallyTechPractice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class BiggestNum {
	
	public void m1() {
		List<Integer> list =  Arrays.asList(23,54,76,87);
		 Optional<Integer> li =  list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		 if(li.isPresent()) {
			 System.out.println("Biggest value is "+ li.get());
		 }else 
			 System.out.println("Value is not present in given array:");
		
	}
	public static void main(String[] args) {
		BiggestNum ss = new BiggestNum();
		ss.m1();
	}

}
