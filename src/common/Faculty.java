package common;

public abstract class Faculty extends Person {
	private String designation;
	private String employeeId;
	
	public Faculty() {
		super();
		this.designation = designation;
		this.employeeId = employeeId;
	}
	
	public Faculty(String designation, String employeeId) {
		super();
		this.designation = designation;
		this.employeeId = employeeId;
	}
	
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	

}
