package jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectUsingpreparedStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("org.postgresql.Driver");
		Connection con =DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","Root@123");
        PreparedStatement s =con.prepareStatement("select * FROM dept ");
        //s.setInt(1, 1); using where condition we can write this and in query we can write where condition:
        ResultSet rs=s.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getInt("did"));
            System.out.println(rs.getString("dname"));
            System.out.println(rs.getString("dstrength"));
            
        }
     
        s.close();
        con.close();
	    

	}

}
