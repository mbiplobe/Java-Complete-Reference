

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.Faculty;

/**
 * Servlet implementation class InterfacaeExample
 */
@WebServlet("/InterfacaeExample")
public class InterfacaeExample extends HttpServlet implements OnSelectionListener {
	private static final long serialVersionUID = 1L;
	
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InterfacaeExample() {
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
	
		if(faculty.getDesignation().equalsIgnoreCase("Professor")||faculty.getDesignation().equalsIgnoreCase("Associate Professor"))
		{
			OnSelectionListener listener=new InterfacaeExample();
			listener.onSelected();
		}
	return faculty;
	}
	
	@Override
	public void onSelected() {
		System.out.println("Hello");
	}

}
