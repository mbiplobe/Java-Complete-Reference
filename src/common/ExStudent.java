package common;

/*

			Static Method
			Static variable
			Static Class
			Inner Class

*/


public class ExStudent extends Student {
	public static String passingYear;
	public static String session;
	

	/*public ExStudent() {
		super();
	}
	
	public ExStudent(String passingYear) {
		super();
		this.passingYear = passingYear;
	}
	
	public ExStudent(String passingYear,String session) {
		super();
		this.passingYear = passingYear;
		this.session = passingYear;
	}
	
	public String getSession() {
		return session;
	}

	public void setSession(String session) {
		this.session = session;
	}


	
	public String getPassingYear() {
		return passingYear;
	}

	public void setPassingYear(String passingYear) {
		this.passingYear = passingYear;
	}*/
	
	
	
	
	public static class Convocation{
		
		public static boolean getConvacationOpertunity(){
			boolean status;
			if(2007>=Integer.parseInt(session) && (2016<=Integer.parseInt(passingYear) && Integer.parseInt(passingYear)>2012)){
				status=true;
			}
			else {
				status=false;
			}
			return status;
		}
	}
	
	
	
	
}
