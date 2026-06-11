package performOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class WriteAndExecuteAndGetConnection {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection1 = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "root");
		Statement statement1 = connection1.createStatement();
		statement1.execute("create database jdbc_m9");
		connection1.close();
		Connection connection2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_m9", "root", "root");
		Statement statement2 = connection1.createStatement();
		statement1.execute("create table jspiders ");

	}

}
