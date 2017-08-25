package common;

public class Student extends Person {

	private String studentId;
	
	public Student() {super();}
	
	public Student(String id) {
		super();
		this.studentId=id;
		}
	
	public Student(String id,String cgpa) {
		super();
		this.cgpa=cgpa;
		}
	
	public Student(String name,String address,String dateOfBirth,String id,String cgpa) {
		
		this.cgpa=cgpa.toUpperCase();
		this.studentId=id.toUpperCase();
		this.setName(name.toUpperCase());
		this.setAddress(address.toUpperCase());
		this.setDateOfBirth(dateOfBirth.toUpperCase());
		
		}
	
	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}


	private String cgpa;
	public String getCgpa() {
		return cgpa;
	}
	
	public void setCgpa(String cgpa) {
		this.cgpa = cgpa;
	}
	
	
	/*Method Overriding*/
	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return super.getDetails()+ " Student Id :"+ studentId+" Student CGPA : "+cgpa;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
/*	
	Method Overloading*/
	public String getEligibilityTestStatus(){
		return "Sorry you are not eligible for this program";
	}
	
	public String getEligibilityTestStatus(String cgpa){
		String status;
		int result=Integer.parseInt(cgpa);
		
		if(result>3.5)
			status="Congrats";
		else if(result<=3.5 && result>2.5)
			status="You must fetch out amplitude test";
		else 
			status="Sorry you are not eligible for this program";
		
		return status;
	}
	
	public String getEligibilityTestStatus(String cgpa,String institudeName){
		String status;
		int result=Integer.parseInt(cgpa);
		
		if(result>3.5)
			status="Congrats";
		else if(result<=3.5 && result>2.5 && institudeName.equalsIgnoreCase("IBAIS"))
			status="Ok you can join with us";
		else if(result>=2.25 && institudeName.equalsIgnoreCase("IBAIS"))
			status ="You must fetch out amplitude test";
		else 
			status="Sorry you are not eligible for this program";
		
	
		return status;
	}
}
