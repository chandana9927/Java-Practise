package connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionPath {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "root");
		System.out.println("Connection is established");
		Statement statement = connection.createStatement();
		boolean b = statement.execute("Create database abcd");
		System.out.println("Databse Created");
		System.out.println(b);
		connection.close();
	}
}
