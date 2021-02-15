package logic;

public class Employee {
	private static int allotId = 0 ;
	private int empId ;
	private String designation ;
	
	public Employee(String designation) {
		super();
		empId = ++allotId ;
		this.designation = designation;
	}

	public int getEmpId() {
		return empId;
	}
	
	public String getDesignation() {
		return designation;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", designation=" + designation
				+ "]";
	}
	
}
