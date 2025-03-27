package jdbc;
import java.util.*;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class TableCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("org.postgresql.Driver");
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","Root@123");
		    Statement s=con.createStatement();
		   int k= s.executeUpdate("insert into employee values(2,'java')");
		   System.out.print(k);
			 s.close(); 
			 con.close();
			 
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}

	}

}
