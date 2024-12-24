package compaAndComparator;

import java.util.Comparator;

public class Employee  implements Comparator<Employee> {
	
	public int empId;
	public String empName;
	public String empAddress;
	public String empLocation;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public String getEmpLocation() {
		return empLocation;
	}
	public void setEmpLocation(String empLocation) {
		this.empLocation = empLocation;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAddress=" + empAddress + ", empLocation="
				+ empLocation + "]";
	}
	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.empName.compareTo(o2.empName);
	}
}
