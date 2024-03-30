package com.adv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectDemo {

	public static void main(String[] args) throws SQLException {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava","root","bike");
         Statement st=con.createStatement();
        String sql="select * from employee";
        ResultSet rs=st.executeQuery(sql);
        while(rs.next()) {
        	System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
        }
        
	}

}
