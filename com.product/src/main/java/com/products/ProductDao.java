package com.products;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductDao {
	public Connection getCon() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/chocolate", "root", "root");
		return con;
	}
	
	public int save(Product product) throws SQLException, ClassNotFoundException {
		Connection con = getCon();
		PreparedStatement ps = con.prepareStatement("insert into product values (?,?,?,?)");
		ps.setString(1, product.getName());
		ps.setInt(2, product.getPrice());
		ps.setString(3, product.getDescription());
		ps.setString(4, product.getBrand());
		int count = ps.executeUpdate();
		return count;
	}
	
	public int update(String name, int price) throws ClassNotFoundException, SQLException {
		Connection con = getCon();
		PreparedStatement ps = con.prepareStatement("update product set price = ? where name = ?");
		ps.setInt(1, price);
		ps.setString(2, name);
		int count = ps.executeUpdate();
		return count;
	}
	public int delete(String name) throws ClassNotFoundException, SQLException {
		Connection con = getCon();
		PreparedStatement ps = con.prepareStatement("delete from product where name = ?");
		ps.setString(1, name);
		int count = ps.executeUpdate();
		return count;
	}
	public Product fetch(String name) throws ClassNotFoundException, SQLException {
		Connection con = getCon();
		PreparedStatement ps = con.prepareStatement("select * from product where name =?");
		ps.setString(1, name);
		ResultSet rs = ps.executeQuery();
		Product p = new Product();
		if (rs.next()) {
			p.setName(rs.getString(1));
			p.setPrice(rs.getInt(2));
			p.setDescription(rs.getString(3));
			p.setBrand(rs.getString(4));
			
		}
		return p;
	}
}
