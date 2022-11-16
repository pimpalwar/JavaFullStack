
class EmployeeException extends Exception {
	
	public EmployeeException(String s) {
		super(s);
	}
}

class SampleEmp1 {
	void empIDCheck(int EmpID) throws EmployeeException {
		if (EmpID <= 0 || EmpID > 999) {
			throw new EmployeeException("Invalid Employee ID");
		}
	}

	public static void main(String args[]) {
		SampleEmp1 emp = new SampleEmp1();
		try {
			emp.empIDCheck(1000);
			System.out.println("Exceptions not accured");
		} catch (EmployeeException e) {
			System.out.println("Exception caught");
			System.out.println(e.getMessage());
		}
	}
}