package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdatequeryTakingUserInputsInPreparedStatements {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the set name");
		String s=sc.nextLine();
		System.out.println("enter the new Strength");
		int n=sc.nextInt();
		sc.nextLine();
		System.out.println("enter the did");
		int m=sc.nextInt();
		sc.nextLine();
		Class.forName("org.postgresql.Driver");
		Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","Root@123");
        PreparedStatement ps=con.prepareStatement("update dept set dname=?,dstrength=? where did=?");
        ps.setString(1,s);
        ps.setInt(2,n);
        ps.setInt(3, m);
        int k=ps.executeUpdate();
        System.out.println(k);
        
}
}
