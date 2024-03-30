package com.adv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDemo {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava","root","bike");
		//System.out.println(con);
		String sql="insert into employee values(1001,'abc',23)";
		Statement st=con.createStatement();
		int i=st.executeUpdate(sql);
		if(i !=0)
			System.out.println(i +" record is inserted");
		else
			System.out.println("No record inserted");
	}

}
