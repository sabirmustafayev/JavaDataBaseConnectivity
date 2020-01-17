package JDBC_Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Statement_ResultSet {
	
		public static void main(String[] args) throws SQLException {
			
			String userName = "hr";
			String passWord = "hr";
			
			//url: jdbc:DataBaseType:thin:@Host:port:SID	
			String url = "jdbc:oracle:thin:@52.91.60.120:1521:xe";
			
			//Connection Step
			Connection connection = DriverManager.getConnection(url, userName, passWord);
			
			//Statement Step
			Statement statement = connection.createStatement();
			
			System.out.println("statement is created");
			
			//ResultSet Step
			ResultSet resultSet = statement.executeQuery("Select * from employees");
			System.out.println("result Set is Created");
			
			String sql = "Update developers set name = 'MAdina' Wehere name = 'Erhan'";
			
			statement.executeUpdate(sql);
	}

}
