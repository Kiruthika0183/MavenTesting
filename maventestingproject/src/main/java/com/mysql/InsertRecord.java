package com.mysql;


		import java.sql.Connection;
		import java.sql.DriverManager;
		import java.sql.Statement;

		public class InsertRecord {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				try {
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection conn=null;
				conn=DriverManager.getConnection("jdbc:mysql://localhost/jdbcop","root","root");
				Statement stmt=conn.createStatement();
				System.out.println("Inserting records into the table...");
				String sql="INSERT INTO EMP2 VALUES(21,'Kirthi','Raj',21)";
				stmt.executeUpdate(sql);
			    sql="INSERT INTO EMP2 VALUES(22,'Sowmi','Raj',24)";
				stmt.executeUpdate(sql);
				sql="INSERT INTO EMP2 VALUES(24,'janu','Naveen',22)";
				stmt.executeUpdate(sql);
				sql="INSERT INTO EMP2 VALUES(25,'kala','Chandran',26)";
				stmt.executeUpdate(sql);
				
				/*String sql="drop table emp2";
				stmt.execute(sql);*/
				
				System.out.println("Inserted records into the table...");
				}
				catch(Exception e){
					e.printStackTrace();
				}
					
				}

		


	}


