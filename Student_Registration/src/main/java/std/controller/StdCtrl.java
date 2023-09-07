package std.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import std.dao.Std_Dao;
import std.model.Student;


/**
 * Servlet implementation class StdCtrl
 */
@WebServlet("/StdCtrl")
public class StdCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StdCtrl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());

		 
		 RequestDispatcher rd1=request.getRequestDispatcher("Registration.jsp");	
		 rd1.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String user_id=request.getParameter("user_id");
		 String Password=request.getParameter("Password");
		 String type=request.getParameter("type");
		 String Name=request.getParameter("Name");
		 int Age=Integer.parseInt(request.getParameter("Age"));
		 String Branch=request.getParameter("Branch");
		 String Address=request.getParameter("Address");	
		 String Mobile=request.getParameter("Mobile");
		 
		 Student std=new Student();
		 
		 std.setUser_id(user_id);
		 std.setPassword(Password);
		 std.setType(type);
		 std.setName(Name);
		 std.setAge(Age);
		 std.setBranch(Branch);
		 std.setAddress(Address);
		 std.setMobile(Mobile);
		 
		 Std_Dao dao=new Std_Dao();
		 int i=0;
		 
		 try {
			i=dao.addStudent(std);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 if(i!=0) {
			 System.out.println("Added successfully");
		 }else {
			 System.out.println("Not added");
		 }
		
		
		
		 RequestDispatcher rd=request.getRequestDispatcher("Std_Data.jsp");
		 
		 rd.forward(request, response);
		 
	}

}
