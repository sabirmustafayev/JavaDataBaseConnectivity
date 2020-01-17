package JDBC_Practice;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Utility.DBUtility;

public class ResultSet_DataStructures {
	
	public static void main(String[] args) throws SQLException {
		
		ResultSet resultSet = DBUtility.getResult("Select * from employees");
		
		List<String> EmployeeNames = new ArrayList<String>();
		
		while(resultSet.next()){
			String firstname = resultSet.getString("first_name");
			String lastname = resultSet.getString("last_name");
			String fullname = firstname+" "+lastname;
			
			
			EmployeeNames.add(fullname);
		}
		
System.out.println( EmployeeNames.contains("Steven King") );
        
        // Assert.AsserTrue( EmployeeNames.contains("StevenKing") )
        
        
        System.out.println(EmployeeNames);
        
        
        DBUtility.tearDown();
		
	}

}
