package strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeCollectionOne {
	public void m1() {
		
		EmployyeeCollection ex = new EmployyeeCollection();
		EmployyeeCollection ex1 = new EmployyeeCollection();
		EmployyeeCollection ex2 = new EmployyeeCollection();
		EmployyeeCollection ex3 = new EmployyeeCollection();
		
		ex.setEmpAddress("Hyderabad");
		ex.setEmpNAme("Siva Reddy");
		ex.setEmpSalary(20000.0f);
		ex.setId(12);
		
		ex.setEmpAddress("TPT");
		ex.setEmpNAme("Siva Reddy");
		ex.setEmpSalary(21000.0f);
		ex.setId(12);
		
		ex.setEmpAddress("Hyderabad");
		ex.setEmpNAme("Siva Reddy");
		ex.setEmpSalary(45000.0f);
		ex.setId(12);
		
		ex.setEmpAddress("Hyderabad");
		ex.setEmpNAme("Siva Reddy");
		ex.setEmpSalary(56900.0f);
		ex.setId(12);
		
		List<EmployyeeCollection> list = new ArrayList<EmployyeeCollection>();
		list.add(ex3);
		list .add(ex2);
		list.add(ex1);
		list.add(ex);
		
	}
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(23);
		list.add(6);
		list.add(90);
		list.add(12);
		list.add(9);
		list.add(43);
		//Collections.sort(list.reversed());
		Collections.binarySearch(list, 34);
		System.out.println(list);
		
	}
	
}
