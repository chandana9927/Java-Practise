package performOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class CRUDOperationsUsingProps {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("userDetails.properties");
		Properties p = new Properties();
		p.load(fis);
		String driver = p.getProperty("driver");
		Class.forName(driver);
		String dbPath = p.getProperty("dbPath");
		Connection conn = DriverManager.getConnection(dbPath, p);
		System.out.println(conn);
		String qry = p.getProperty("qry");
		PreparedStatement ps = conn.prepareStatement(qry);
		int id = Integer.parseInt(p.getProperty("id"));
		ps.setInt(1, id);
		String name = p.getProperty("name");
		ps.setString(2, name);
		Long phone = Long.parseLong(p.getProperty("phone"));
		ps.setLong(3, phone);
//		Statement s = conn.createStatement();
//		s.execute(qry);
		ps.execute();
		conn.close();
	}

}
