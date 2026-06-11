package staticPrograms;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchValuesFromDB {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/connectivity", "root", "root");
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("Select * from batch where id = 3");
		resultSet.next();
		System.out.println("Id:"+resultSet.getInt(1)+" "+"Name:"+resultSet.getString(2)+" "+"Phone:"+resultSet.getLong(3));
		//System.out.println("Id:"+resultSet.getInt(1));		
		connection.close();

	}

}
