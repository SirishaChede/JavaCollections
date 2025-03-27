package jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class UsingPrepareStatementInsertValues {

	public static void main(String[] args) throws SQLException, ClassNotFoundException  {
		// TODO Auto-generated method stub
        Class.forName("org.postgresql.Driver");
        Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","Root@123");
        PreparedStatement s=con.prepareStatement("insert into Dept values(?,?,?)");
        	
        
        s.setInt(1,2);//1 specifies the first parameter in the query  
        s.setString(2,"cse");
        s.setInt(3, 70);

        int k=s.executeUpdate();
        System.out.print(k);
        s.close();
        con.close();
	}

}
