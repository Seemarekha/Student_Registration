package std.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import std.model.Student;

public class Std_Dao {
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/student_registration","root","sutun@123");
		
	}
	
	public int addStudent(Student student) throws SQLException {
		
		Connection con=null;		
		int status=0;
		
		try {
			con = Std_Dao.getConnection();
			con.setAutoCommit(false);
			PreparedStatement ps=con.prepareStatement("insert into login(user_id,Password,type) values(?,?,'student')");
			
			ps.setString(1, student.getUser_id());
			ps.setString(2, student.getPassword());
			
			status = ps.executeUpdate();
			
			if(status!=0) {
				status=0;
				
				ps=con.prepareStatement("insert into student(Name,Age,user_id,Branch,Address,Mobile) values(?,?,?,?,?,?)");
				
				ps.setString(1, student.getName());
				ps.setInt(2,student.getAge());
				ps.setString(3, student.getUser_id());
				ps.setString(4, student.getBranch());
				ps.setString(5, student.getAddress());
				ps.setString(6, student.getMobile());
				
				status=ps.executeUpdate();
				
				
				if(status!=0) {
				    con.commit();
				}else {
					con.rollback();
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
			con.rollback();
			
		}
		finally {
			con.close();
		}
		return status;
		
	}
	public Student checkLogin(String user_id, String Password) throws SQLException {
		// TODO Auto-generated method stub
		Connection con=null;
		Student std=null;
		ResultSet rs=null;
		try {
			con=Std_Dao.getConnection();
			
			//PreparedStatement ps=con.prepareStatement("select s.user_id,s.Name,s.Age,s.Branch,s.Address,s.Mobile where l.user_id=?,l.Password=? and l.user_id=s.user_id");
			PreparedStatement ps = con.prepareStatement("SELECT s.user_id, s.Name, s.Age, s.Branch, s.Address, s.Mobile FROM student s JOIN login l ON s.user_id = l.user_id WHERE l.user_id = ? AND l.Password = ?");

			
			ps.setString(1,user_id);
			ps.setString(2, Password);
			
    		rs=ps.executeQuery();
    		
    		if(rs.next()) {
    			std=new Student();
    			
    			std.setUser_id(rs.getString("user_id"));
                std.setName(rs.getString("Name"));
                std.setAge(rs.getInt("Age"));
                std.setBranch(rs.getString("Branch"));
                std.setAddress(rs.getString("Address"));
                std.setMobile(rs.getString("Mobile"));
    			
    		}else {
    			std=null;
    		}

			
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			con.close();
		}
		return std ;
	}

}
