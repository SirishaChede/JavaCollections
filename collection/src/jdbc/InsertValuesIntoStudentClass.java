package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertValuesIntoStudentClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("org.postgresql.Driver");
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","Root@123");
			Statement s=con.createStatement();
			int k=s.executeUpdate("insert into student values(1,'siri')");
			System.out.println(k);
			s.close();
			con.close();
		}
         catch(SQLException e) {
        	 e.printStackTrace();
        	 
         }
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
