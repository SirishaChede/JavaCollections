package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentTableCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       try {
    	   Class.forName("org.postgresql.Driver");
    	   Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","Root@123");
           Statement s=con.createStatement();
           int k=s.executeUpdate("create table Student(sid int,sname varchar(20))");
           System.out.println(k);
           s.close();
           con.close();
       }catch(SQLException e) {
    	   e.printStackTrace();
       }
       catch(ClassNotFoundException e){
    	   e.printStackTrace();
    	   
       }
	}

}
