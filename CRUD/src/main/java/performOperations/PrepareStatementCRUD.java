package performOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class PrepareStatementCRUD {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection connection1 = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "root");
//		PreparedStatement preparedStatement1 = connection1.prepareStatement("create database TestYantra");
//		System.out.println("Database is created");
//		preparedStatement1.execute();
//		connection1.close();
//		
		Connection connection2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/TestYantra", "root", "root");
//		PreparedStatement preparedStatement2 = connection2.prepareStatement("create table alpha(id integer primary key, name varchar(25) not null, phone BigInt unique not null) ");
//		System.out.println("Table is created");
//		preparedStatement2.execute();
//		
//		PreparedStatement preparedStatement3 = connection2.prepareStatement("insert into alpha values(1, 'Raju', 863656565)");
//		System.out.println("Values are inserted");
//		preparedStatement3.execute();
//		
//		PreparedStatement preparedStatement4 = connection2.prepareStatement("update alpha set name = 'RajuBhai', phone = 365365625");
//		System.out.println("Values are updated");
//		preparedStatement4.execute();
		
//		PreparedStatement preparedStatement5 = connection2.prepareStatement("select * from alpha where id =1");
//		ResultSet resultSet = preparedStatement5.executeQuery();
//		resultSet.next();
//		System.out.println("id:"+resultSet.getInt(1)+" "+"name:"+resultSet.getString(2)+" "+resultSet.getLong(3));
		
		PreparedStatement preparedStatement6 = connection2.prepareStatement("delete from alpha");
		preparedStatement6.execute();
		System.out.println("Table is deleted");
		
		PreparedStatement preparedStatement7 = connection2.prepareStatement("drop table alpha");
		preparedStatement7.execute();
		System.out.println("Table is dropped");

	}

}
