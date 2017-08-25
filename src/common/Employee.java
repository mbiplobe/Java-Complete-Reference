package common;

public abstract class Employee extends Person {

	private String employeeId;
	private String designation;
	private String salary;
	
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	public abstract void setEmployeeInployeeInformation(String name,String address, String dateOfBirth, String designation, String getEmployeeId);
	
	public abstract String getEmployeeInployeeInformation();
	
	
}
