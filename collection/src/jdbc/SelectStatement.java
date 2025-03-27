package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectStatement {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		// TODO Auto-generated method stub
		Class.forName("org.postgresql.Driver");
		Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","Root@123");
		Statement s=con.createStatement();
		ResultSet k=s.executeQuery("select*from dept");
		while(k.next()) {
			System.out.println(k.getInt(1));
			System.out.println(k.getString(2));
			System.out.println(k.getInt(3));
			System.out.println("************");
		}
		s.close();
		con.close();
	}

}
