package connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DelRecAndTab {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/connectivity", "root", "root");
		Statement statement = connection.createStatement();
		statement.execute("Delete from batch where id = 3");
		System.out.println("The values are deleted from the batch table");
		statement.execute("Delete from batch");
		statement.execute("Alter table batch drop column phone");
		statement.execute("Drop table batch");
		System.out.println("No object is there to perform");
		connection.close();

	}

}
