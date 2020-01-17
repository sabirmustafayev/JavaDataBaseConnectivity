package JDBC_Practice;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.Map;

import Utility.DBUtility;

public class ResultSet_Map {
	
	public static void main(String[] args) throws SQLException {
		
		ResultSet resultSet = DBUtility.getResult("Select * from Employees");
		Map<String, Integer> EmployeeInfo = new LinkedHashMap<>();
		
		while(resultSet.next()) {
			String firstname = resultSet.getString("first_name");
			String lastname = resultSet.getString("last_name");
			
			String fullname = firstname+" "+lastname;
			Integer salary = resultSet.getInt("salary");
			
			//System.out.println(fullname+" "+salary);
			EmployeeInfo.put(fullname, salary);
			/*
            if(salary == 9000) {
                System.out.println(fullName+" is making 9000");
            }
            */
		}
		
		System.out.println( EmployeeInfo);
		System.out.println(EmployeeInfo.get("Steven King"));
		
		String sql = "Update developers set names = 'Madina' Wehere names = 'Erhan'";
		
	}

}
