package jdbc.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

//import com.mysql.jdbc.Driver;

public class ReaddatafromDB {
	@Test
	public void readDataTest() throws Throwable
	{
		//step2 connect to Database
		Connection con=null;
		try {
			//step1 Register the Driver
Driver dri=	new Driver();
			
			DriverManager.registerDriver(dri);
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","root");
			//step3 Create statement
			Statement stmt=con.createStatement();
			//step4 Execute Query
			ResultSet resultset=stmt.executeQuery("select * from students;");
			while(resultset.next())
			{
				System.out.println(resultset.getString(1)+" "+resultset.getString(2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
		con.close();
		System.out.println("connection closed");
		}
	}

}
