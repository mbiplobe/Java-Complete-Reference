package common;

public class Faculty extends Employee {

	
	
	@Override
	public void setEmployeeInployeeInformation(String name,String address, String dateOfBirth, String designation, String getEmployeeId) {
		setName(name);
		setAddress(address);
		setDesignation(designation);
		setEmployeeId(getEmployeeId);
		setDateOfBirth(dateOfBirth);

	}

	@Override
	public String getEmployeeInployeeInformation() {
	
		String details= "Name : "+getName()
		+"Address : "+getAddress()
		+" Date of Birth : "+getDateOfBirth()
		+"Designation : "+getDesignation()
		+"Employee Id : "+getEmployeeId();
	
		return details;
	}

	

	
	

}
