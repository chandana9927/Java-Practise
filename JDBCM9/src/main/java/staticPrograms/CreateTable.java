package staticPrograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/connectivity", "root", "root");
		Statement statement = connection.createStatement();
		statement.execute("Create table batch(id int primary key, name varchar(30) not null, phone bigint not null unique)");
		System.out.println("Table is created in the database connectivity");
		connection.close();
	}
}
