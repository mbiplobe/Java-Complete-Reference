

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.Faculty;
import common.Student;

/**
 * Servlet implementation class AbstructExample
 */
@WebServlet("/AbstructExample")
public class AbstractExample extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AbstractExample() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		super.service(request, response);
		Faculty faculty=setFacultyInformation( request);
		
		PrintWriter printWriter = response.getWriter();
		printWriter.println("Employee Details \n" + faculty.getEmployeeInployeeInformation());

	}
	
	private Faculty setFacultyInformation(HttpServletRequest request){
		Faculty faculty = new Faculty();
		faculty.setEmployeeInployeeInformation(request.getParameter("name"), request.getParameter("address"), request.getParameter("date_of_birth"), request.getParameter("designation"), request.getParameter("employee_id"));
	
	return faculty;
	}
	

}
