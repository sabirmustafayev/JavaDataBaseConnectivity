package JDBC_Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PrintingResult {
	
	public static void main(String[] args) throws SQLException {
		
		String userName = "hr";
		String passWord = "hr";
		String url = "jdbc:oracle:thin:@52.91.60.120:1521:xe";
		
		Connection connection = DriverManager.getConnection(url, userName, passWord);
	    
        Statement statement =  connection.createStatement();
    
        ResultSet resultSet = statement.executeQuery( "Select * From employees" );
        
       // System.out.println("*EMPLOYEE ID*  *FIRSTNAME*  *LASTNAME*  *EMAIL*  *PHONE NUMBER*  *HIRE DATE*  *JOB ID*  "
    	//		+ "*SALARY*  *COMMISION PCT*  *MANAGER ID*  *DEPARTMENT ID*");
        while (resultSet.next()) {
			//String fisrtname = resultset.getString("first_name");
        	//String lastname = resultset.getString("last_name");
        	
        	
        	int employeeid = resultSet.getInt(1);
        	String firstname = resultSet.getString(2);
        	String lastname = resultSet.getString(3);
        	String email = resultSet.getString(4);
        	String phonenumber = resultSet.getString(5);
        	String hiredate = resultSet.getString(6);
        	String jobid = resultSet.getString(7);
        	int salary = resultSet.getInt(8);
        	int commissionpct = resultSet.getInt(9);
        	int managerid = resultSet.getInt(10);
        	int departmentid = resultSet.getInt(11);
        	
        	
        	//whole info in employess table
        	System.out.println(employeeid +"||"+firstname+"||"+lastname+"||"+email +"||"+phonenumber +"||"+hiredate +"||"+
        						jobid +"||"+salary +"||"+commissionpct +"||"+managerid +"||"+departmentid);
		}
	}

}
