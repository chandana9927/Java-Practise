package dynamicInput;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class DynamicInputCRDUDoperations {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/rajajinagar", "root", "root");
		PreparedStatement preparedStatement1 = connection1.prepareStatement("Insert into 6thblock values(?,?,?)");
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the proper id: ");
		int id = scanner.nextInt();
		preparedStatement1.setInt(1, id);
		
		System.out.println("Enter the proper name: ");
		String name = scanner.next();
		preparedStatement1.setString(2, name);
		
		System.out.println("Enter the proper phone number: ");
		Long phone = scanner.nextLong();
		preparedStatement1.setLong(3, phone);
		
		preparedStatement1.execute();
		
		//update
		PreparedStatement preparedStatement2 = connection1.prepareStatement("Update 6thblock set name=?, phone=? where id = ?");
		
		System.out.println("Enter the name to be updated: ");
		String name1 = scanner.next();
		preparedStatement2.setString(1, name);
		
		System.out.println("Enter the phone number to be updated: ");
		Long phone2 = scanner.nextLong();
		preparedStatement2.setLong(2, phone);
		
		System.out.println("Enter the proper id: ");
		int id1 = scanner.nextInt();
		preparedStatement2.setInt(3, id);
		
		preparedStatement2.executeUpdate();
		
		//Fetch
		PreparedStatement preparedStatement3 = connection1.prepareStatement("select * from 6thblock where id = ?");
		System.out.println("Enter the proper id: ");
		int id2 = scanner.nextInt();
		preparedStatement3.setInt(1, id2);
		ResultSet resultSet = preparedStatement3.executeQuery();
		resultSet.next();
		System.out.println("id:"+resultSet.getInt(1) + " " + "name:" + resultSet.getString(2) + " " +"phone:" + resultSet.getLong(3));
		
		//Delete
		PreparedStatement preparedStatement4 = connection1.prepareStatement("delete from 6thblock where id = ?");
		System.out.println("Enter the proper id to delete: ");
		int id3 = scanner.nextInt();
		preparedStatement4.setInt(1, id3);
		preparedStatement4.execute();
		
		System.out.println("All the CRUD operations are done successfully");
		connection1.close();
		

	}

}
