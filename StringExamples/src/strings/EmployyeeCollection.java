package strings;

public class EmployyeeCollection {
	
	public int id;
	public String empNAme;
	public String empAddress;
	public float empSalary;
	
	public EmployyeeCollection() {
		super();
	}
	
	public EmployyeeCollection(int id, String empNAme, String empAddress, float empSalary) {
		super();
		this.id = id;
		this.empNAme = empNAme;
		this.empAddress = empAddress;
		this.empSalary = empSalary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpNAme() {
		return empNAme;
	}
	public void setEmpNAme(String empNAme) {
		this.empNAme = empNAme;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public float getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}
}
