package com.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class CreateTableMdvn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection conn=null;
					conn=DriverManager.getConnection("jdbc:mysql://localhost/db1","root","root");
					Statement stmt=conn.createStatement();
					
					String sql="CREATE TABLE Studata "+"(sid INTEGER not NULL," +"sname VARCHAR(255),"+"scity VARCHAR(255))";
					stmt.executeUpdate(sql);
					
					System.out.println("Created table in given database...");
					
					/*String sql="drop table Studata";
					stmt.executeUpdate(sql);
					System.out.println("table deleted in given database...");*/
					
					conn.close();
				}catch(Exception e){
					e.printStackTrace();
					
				}
			}
	}


