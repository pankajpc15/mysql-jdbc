package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Jdbc {

	public static void main(String[] args) {

		try {
			// step 1 register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// step 2 Establish Conntection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/banking", "root", "1234");

			// here banking is database name, root is username and password is 1234

			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from customer");

			while (rs.next())
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}


//echo "# mysql-jdbc" >> README.md
//git init
//git add README.md
//git commit -m "first commit"
//git branch -M main
//git remote add origin https://github.com/pankajpc15/mysql-jdbc.git
//git push -u origin main
