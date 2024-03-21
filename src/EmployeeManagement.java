import java.util.Scanner;

public class EmployeeManagement {
	
	public int menu() {
		int choice;
		System.out.println("Enter Your option from below menu: ");
		System.out.println("Press 1. To Create Employee");
		System.out.println("Press 2. Display Employee Details");
		System.out.println("Press 3. Update Employee Details");
		System.out.println("Press 4. Delete Employee Details");

		
		Scanner s = new Scanner(System.in);
		choice = s.nextInt();
		return choice;

	}
	
	
	//1. Creating Employee Data
	public Employee[] createEmp() {
		Scanner s = new Scanner(System.in);
		System.out.println("How Many Employee Data you want to create: ");
		int numOfEmp=s.nextInt();
		Employee[] e = new Employee[numOfEmp];
	    for(int i=0; i<e.length;i++)
		{
	    	System.out.println("Enter Employee ID: ");
	    	int empNo = s.nextInt();
	    	System.out.println("Enter Employee Name: ");
	    	String name = s.next();
	    	System.out.println("Enter Employee Salary: ");
	    	float salary = s.nextFloat();
	    	e[i]= new Employee(empNo,name,salary);
		}
		System.out.println("New Employee Details Created Successfully.");

			
		return e;
		
	}
	//2. Displaying Employee Data
	public void dispEmp(Employee[] e) {
		
		
		for(int i=0;i<e.length;i++) {
			e[i].dispEmpDetails();
		}
		
	}
	
	//3. Updating the Employee Data
	public void updateEmp(Employee[] e) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Employee ID: ");
		int updateEmp= s.nextInt();
		boolean employeeFound = false;
		for(int i = 0;i < e.length; i++) {
			if(e[i].empNo == updateEmp) {
				System.out.println("Enter new Employee Salary: ");
				e[i].salary = s.nextFloat();
				employeeFound = true;
				System.out.println("Employee details Updated Successfully!");
				break;
			}
		}
		if(!employeeFound) {
		System.out.println("Employee with Employee Number " + updateEmp + " not found.");
		}
	}
	
	
	//4. Deleting the Employee Data
	
	public void deleteEmp(Employee[] e) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Employee ID: ");
		int deleteEmp= s.nextInt();
		boolean employeeFound = false;
		for(int i = 0;i < e.length; i++) {
			if(e[i].empNo == deleteEmp) {
				e[i].empNo = 0;
				e[i].name = " ";
				e[i].salary = 0;
				employeeFound = true;
				System.out.println("Employee details Deleted Successfully!");
				break;
			}
	}
		if(!employeeFound) {
		System.out.println("Employee with Employee Number " + deleteEmp + " not found.");
		}
	}
		
	
		
}
 