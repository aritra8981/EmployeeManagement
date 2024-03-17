
public class Employee {
	int empNo;
	String name;
	float salary;
	
	public Employee(int empNo, String name, float salary) {
		this.empNo = empNo;
		this.name = name;
		this.salary = salary;
	}
	
	
	
	public void dispEmpDetails() {
		System.out.println("Employee Details are: ");
		System.out.println("Employee Employee Number: " + empNo);
		System.out.println("Employee Name: " + name);
		System.out.println("Employee Salary: "+ salary);
	}
}

