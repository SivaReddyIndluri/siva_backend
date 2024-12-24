package compaAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeImpl {
	
	public void m1() {
		Employee emp = new Employee();
		emp.setEmpId(1);
		emp.setEmpName("siva");
		emp.setEmpLocation("hyd");
		emp.setEmpAddress("rjpt");
		
		Employee emp1 = new Employee();
		emp1.setEmpId(276);
		emp1.setEmpName("Hari");
		emp1.setEmpLocation("tpt");
		emp1.setEmpAddress("kodur");
		
		Employee emp2 = new Employee();
		emp2.setEmpId(38);
		emp2.setEmpName("jyoshi");
		emp2.setEmpLocation("hyd");
		emp2.setEmpAddress("mvp");
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(emp2);
		list.add(emp1);
		list.add(emp);
		
		Collections.sort(list, new Employee());
		System.out.println(list);

	}
	public static void main(String[] args) {
		EmployeeImpl emps = new EmployeeImpl();
		emps.m1();
		
	}

}
