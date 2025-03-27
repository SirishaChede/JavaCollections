package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteUsingPreparedStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Class.forName("org.postgresql.Driver");
		Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","Root@123");
        PreparedStatement s=con.prepareStatement("Delete from Dept where did=?");
	    
	    s.setInt(1, 1);
	    int k=s.executeUpdate();
	    System.out.println(k);
	    s.close();
	    con.close();
	    
	}

}
