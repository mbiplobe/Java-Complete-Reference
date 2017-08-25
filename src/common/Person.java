package common;

public class Person {
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String address;
	private String dateOfBirth;

	public Person(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	
	public Person(String name, String address,String dateOfBirth) {
		super();
		this.name = name;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
	}

	public Person() {
		super();
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	protected String getDetails() {
		String details = "Name :" + name + " Address : " + address + " Date of Birth :" + dateOfBirth;
		return details;
	}
	
	@Override
	public String toString() {
		return name.toUpperCase()+address.toUpperCase()+dateOfBirth.toUpperCase();
	}

}
