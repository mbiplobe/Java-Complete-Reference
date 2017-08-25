
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.ExStudent;
import common.Student;

/**
 * Servlet implementation class Constructor
 */
@WebServlet("/Constructor")
public class Constructor extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Constructor() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(request, response);
		getServerResponse(request, response);

	}

	private void getServerResponse(HttpServletRequest request, HttpServletResponse response) {
		String type = request.getParameter("person");

		switch (type) {
		case "Student":
			getStudentResponse(request, response);
			break;

		case "Ex-Faculty":
			
			break;

		case "Faculty":
			break;

		default:
			getExStudentResponse(request, response);
			break;
		}
	}

	private void getStudentResponse(HttpServletRequest request, HttpServletResponse response) {
		try {
			Student student = new Student();
			student.setName(request.getParameter("name"));
			student.setAddress(request.getParameter("address"));
			student.setDateOfBirth(request.getParameter("date_of_birth"));
			student.setCgpa(request.getParameter("cgpa"));
			student.setStudentId(request.getParameter("student_id"));

			Student student1 = new Student(request.getParameter("student_id"), request.getParameter("cgpa"));
			student1.setName(request.getParameter("name"));
			student1.setAddress(request.getParameter("address"));
			student1.setDateOfBirth(request.getParameter("date_of_birth"));

			Student student2 = new Student(request.getParameter("name"), request.getParameter("address"),
					request.getParameter("date_of_birth"), request.getParameter("student_id"),
					request.getParameter("cgpa"));

			PrintWriter printWriter;
			printWriter = response.getWriter();
			printWriter.println("Normal Constructor Response : \n" + student.getDetails());
			printWriter.println("Two Argumment Constructor : \n" + student1.getDetails());
			printWriter.println("Multiple Argumment : \n" + student2.getDetails());

			printWriter.println("Constructor Chainning : \n" + student2.toString());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		} catch (Exception e) {
			e.getMessage();
		}

	}

	public void getExStudentResponse(HttpServletRequest request, HttpServletResponse response) {
		String convocvationStatus = "";
		try {
			ExStudent.passingYear = request.getParameter("passing_year");
			ExStudent.session = request.getParameter("session");

			if (ExStudent.Convocation.getConvacationOpertunity()) {
				convocvationStatus = "Welcome to convocation";
			} else {
				convocvationStatus = "Sorry you are not allow for this Convocation";
			}

			ExStudent exStudent = new ExStudent();
			exStudent.setName(request.getParameter("name"));
			exStudent.setAddress(request.getParameter("address"));
			exStudent.setDateOfBirth(request.getParameter("date_of_birth"));
			exStudent.setCgpa(request.getParameter("cgpa"));
			exStudent.setStudentId(request.getParameter("student_id"));

			PrintWriter printWriter;
			printWriter = response.getWriter();
			printWriter.println("Student Details : " + exStudent.getDetails());
			printWriter.println(convocvationStatus);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
