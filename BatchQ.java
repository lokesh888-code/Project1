package com.adv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchQ {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava","root","bike");
		Statement st=con.createStatement();
		String sql1="update employee set name='loki' where id=1001 ";
		String sql2="update employee set salary=130000 where id=1004";
		st.addBatch(sql1);
		st.addBatch(sql2);
		st.executeBatch();
	}

}
