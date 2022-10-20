package jdbc.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class InsertDataIntoDBTest {
	
	@Test
	public void insertDataIntoDBTest() throws Throwable
	{
		//step2 connect to database
		Connection con=null;
		try {
			//step1 register the driver
			Driver dri=new Driver();
			DriverManager.registerDriver(dri);
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root", "root");
			//step3 create statement
			Statement stmt=con.createStatement();
			int result=stmt.executeUpdate("insert into students_info (regno, firstname, middlename, lastname) values(12, 'ramesh', 'patlegar', 'h');");
			 if(result==1)
			 {
				 System.out.println("data is stored");
			 }
			 else
			 {
				 System.out.println("data is not stored");
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
         con.close();
         System.out.println("connection closed");
		}
	}

}
