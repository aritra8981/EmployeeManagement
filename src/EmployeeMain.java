
public class EmployeeMain {

	public static void main(String[] args) {
		
		//menu driven
		EmployeeManagement em = new EmployeeManagement();
		
		Employee[] e = new Employee[2];
		
		int choice;
		
		choice = em.menu();
		switch(choice) {
		case 1:
			 e =em.createEmp();
			break;
		case 2:
			em.dispEmp(e);
			break;
		case 3:
			em.updateEmp(e);
			break;
		case 4:
			em.deleteEmp(e);
			break;
		case 5: 
			System.out.println("Thank You for Showing Your Interest!");
			break;
		default:
				System.out.println("Invalid Choice!");
		}
		
		
//		Employee[] e = em.createEmp();
//		em.dispEmp(e);
//		em.updateEmp(e);
//		em.dispEmp(e);
//		em.deleteEmp(e);
//		em.dispEmp(e);
		
	}

}
