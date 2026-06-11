package staticPrograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateValuesTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/connectivity", "root", "root");
		Statement statement = connection.createStatement();
//		statement.execute("update batch set name='Prasad', phone = 8088236319 where id = 1");
//		statement.executeUpdate("update batch set name='Ford', phone = 6545343453 where id = 3");//it returns how many records are updated. that's why the return type as int.
		statement.executeUpdate("update batch set loc = 'New York' where id in (2,3,4)");
		System.out.println("The values are updated in the batch table");
		connection.close();

	}

}
