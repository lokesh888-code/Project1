package com.adv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AddColumn {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava","root","bike");
        Statement st=con.createStatement();
        String sql="alter table employee add column salary int";
        int i=st.executeUpdate(sql);
        if(i != 0)
        	System.out.println(i+" record inserted");
        else
        	System.out.println("No record inserted");
        
	}

}
