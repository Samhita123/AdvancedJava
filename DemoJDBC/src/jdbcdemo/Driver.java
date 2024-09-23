package jdbcdemo;
import java.sql.*;

public class Driver {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//get a connection to database
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","Meera18Din");
			
			//create a statement
			Statement myStmt = myConn.createStatement();
			
			//execute the query
			ResultSet myRs = myStmt.executeQuery("select * from emplyees");
			
			//process the result
			while(myRs.next()) {
				System.out.println(myRs.getString("last_name" )+ " " + myRs.getString("first_name"));
			}
			
					
		}catch(Exception exc) {
			exc.printStackTrace();
		}

	}

}
