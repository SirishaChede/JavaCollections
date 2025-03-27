package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateTakingUserInput {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the set value");
		String s=sc.nextLine();
		System.out.println("enter the existing value");
		int n=sc.nextInt();
		sc.nextLine();
		Class.forName("org.postgresql.Driver");
		Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","Root@123");
        Statement st=con.createStatement();
        int k=st.executeUpdate("update dept SET dname='"+s+"'where dstrength="+n);
	    System.out.println(k);
	    st.close();
	    con.close();
	}
	
	 //"UPDATE users SET name = '" + newName + "', email = '" + newEmail + "' WHERE id = " + userId;

}

