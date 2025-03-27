package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertableValuesTakingUserInput {

	public static void main(String[] args)throws ClassNotFoundException,SQLException {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the college id");
        int cid=sc.nextInt();
        System.out.println("enter the college name");
        String cname=sc.next();
        Class.forName("org.postgresql.Driver");
        Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","Root@123");
        Statement s=con.createStatement();
        int k=s.executeUpdate("insert into college values("+cid+",'"+cname+"')");
        System.out.println(k);
        s.close();
        con.close();
	}
	}


