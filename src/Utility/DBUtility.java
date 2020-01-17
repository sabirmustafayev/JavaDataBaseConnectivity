package Utility;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtility {
	
	private final static String username = ConfigurationReader.getProperty("JDBC_UserName"),
				 password = ConfigurationReader.getProperty("JDBC_PassWord"),
				 url = ConfigurationReader.getProperty("JDBC_URL");
	
	public static Connection connection;
	public static Statement statement;
	
	public static DatabaseMetaData metadata;
	
	//****static block is used to make connection with Database***
	static {
		try {
		connection = DriverManager.getConnection(url, username, password);
		statement = connection.createStatement();
		metadata = connection.getMetaData();
		}catch (Exception e) {
			
		}
		
	}
	
	//*****this method is used to get query(data) from database****
	public static ResultSet getResult(String sql) {
		ResultSet result = null;
	try {
		result = statement.executeQuery(sql);
	}catch (Exception e) {
		
	}
	return result;
	
	}
	
	//*****This method is used to cut off the connection with database****
	public static void tearDown() {
		try {
			connection.close();
		} catch (Exception e) {
			
		}
	}
	
	public static void UpdateQuery(String sql) {
		// INSERT, UPDATE, , DELETE, ALTER, TRUNCATE, DROP 
		try {
			statement.executeUpdate(sql);
		} catch (Exception e) {
			
		}
	}
	
}
