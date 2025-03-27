package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertqueryTakingUserInputsInPreparedStatements {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the id");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("enter the deptname:");
		String name=sc.nextLine();
		System.out.println("enter the Strength:");
		int n=sc.nextInt();
		sc.nextLine();
		Class.forName("org.postgresql.Driver");
		Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","Root@123");
		PreparedStatement ps=con.prepareStatement("insert into dept values(?,?,? )");
		ps.setInt(1, id);
		ps.setString(2,name);
		ps.setInt(3, n);
		int k=ps.executeUpdate();
		System.out.println(k);
		
	
		

	}

}
