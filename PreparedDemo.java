package com.adv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedDemo {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava","root","bike");
		String sql="insert into employee values(?,?,?)";
		PreparedStatement pst=con.prepareStatement(sql);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sid");
		int id=sc.nextInt();
		System.out.println("Enter the name");
		String name=sc.next();
		System.out.println("Enter the age");
		int age=sc.nextInt();
		pst.setInt(1,id);
		pst.setString(2,name);
		pst.setInt(3,age);
		int i=pst.executeUpdate();
		if(i !=0)
			System.out.println(i+" record is iserted");
		else
			System.out.println("No record inserted");
	}

}
