package com.cg.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.cg.entity.Product;

public class MavenDemoApp {
	public static void main(String args[]) throws SQLException {
		Product p=new Product(100,"TV",50,50000);
		System.out.println("Hii");
		System.out.println(p);
		Connection con=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","deepika","deepika");
			System.out.println("Connection established");
	}catch(SQLException e) {
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}finally {
		con.close();
	}
}
}
