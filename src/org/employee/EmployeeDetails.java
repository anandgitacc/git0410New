package org.employee;

public class EmployeeDetails {

	// private -> access specifier/modifier of the method
	// void -> return type of the method
	// empName -> method name
	// () -> arguments/ input / parameter passing place
	// {} -> block of the method / body of the method

	private void empName() {

		System.out.println("Employee name: Anand");
	}
	private void empMobile() {
		System.out.println("employee mobile: 999999999");
	}
	private void empId() {
		System.out.println("employee id: 1234");
	}
//<<<<<<< HEAD
//=======
//>>>>>>> 58e189bc2febc7711397da8a41be661d8eba8370
	
	public static void main(String[] args) {
		
		EmployeeDetails emp = new EmployeeDetails();
		
		emp.empName();
	}
	

}
