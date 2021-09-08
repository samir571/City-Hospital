package login;
import java.sql.*;
public class LoginDbms {
	public static String uname = "";
	public static String pword ="";
	public static void main(String[] args) {
		
		try {
			// 1. Get a connection to database
			Connection myConn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/login","root","Het@uda123");
			
			// 2. Create a statement
			Statement myState = myConn.createStatement();
			
			// 3. Execute SQL query
			ResultSet myRs = myState.executeQuery("select * from tbl_user where ");
			
			// 4. Process the next result set
			 
			myRs.next();
			uname = myRs.getString(2) + uname;
			
			pword = myRs.getString(3) + pword;
			System.out.println(uname);
			System.out.println(pword);
		
		
		}
		catch(Exception exc) {
			exc.printStackTrace();
		}
		
		
		
	}

}
		

