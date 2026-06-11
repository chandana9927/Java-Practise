package staticPrograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertIntoTable {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/connectivity", "root", "root");
		Statement statement = connection.createStatement();
//		statement.execute("insert into batch values(1,'Preetham', 8217418630)");
//		statement.execute("insert into batch values(2,'Darshan', 8217418640)");
//		statement.execute("insert into batch values(3,'Abhi', 8217418650)");
//		statement.execute("insert into batch values(4,'Lucky', 8217418660)");
		statement.execute("insert into batch values(4,'Lucky', 8217418660)");
		
		System.out.println("The values or the record is created by insert the data into the batch table");
		connection.close();
	}
}
