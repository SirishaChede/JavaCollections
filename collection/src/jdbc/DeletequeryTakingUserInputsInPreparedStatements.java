package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeletequeryTakingUserInputsInPreparedStatements {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the id no");
		int n=sc.nextInt();
		Class.forName("org.postgresql.Driver");
		Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","Root@123");
		PreparedStatement ps=con.prepareStatement("Delete from dept where did=?");
		ps.setInt(1,n);
		int k=ps.executeUpdate();
		System.out.println(k);
		
		
	}

} 
