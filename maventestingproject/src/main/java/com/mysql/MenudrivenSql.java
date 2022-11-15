package com.mysql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;


public class MenudrivenSql {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			int sid=0,age,Ch,k;
			String sname=null,scity=null;
			Scanner sc=new Scanner(System.in);
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection conn=null;
					conn=DriverManager.getConnection("jdbc:mysql://localhost/db1","root","root");
					//Statement stmt=conn.createStatement();
					
					do {
						System.out.println("1.Insert \n 2.Update \n 3.Delete \n 4.Search \n 5.Display");
						System.out.println("\nSelect your option");
						Ch=Integer.parseInt(sc.nextLine());
						
						
				
				switch(Ch) {
				case 1:
					String str="insert  into Studata(sid,sname,scity) values(?,?,?)";
					java.sql.PreparedStatement ps=conn.prepareStatement(str);
					System.out.println(" How many records do you want to insert? ");
			        Integer n=Integer.parseInt(sc.nextLine());
			        for(int i=0;i<n;i++) {
			        	
			        	if(i==1) {
			        		ps.setInt(1,1);
			        	
			        	ps.setString(2, "kiruthi");
			        	ps.setString(3, "erode");
			        	}
			        	if(i==2) {
			        	
			        	ps.setInt(1,2);
			        	ps.setString(2, "priya");
			        	ps.setString(3, "erode");
			        	}
			        	
			        	ps.execute();
			        	System.out.println("Inserted Sucessfully..");
			        	
			        	
			        }
					break;
				/*case 2:
					
					System.out.println("\n Enter the Lid");
		        	lid=Integer.parseInt(sc.nextLine());
		        	System.out.println("\n Enter the Lcity");
		        	lcity=(sc.nextLine());
		        	
		        	k=stmt.executeUpdate("Update learner set lcity='"+lcity+"' where lid=13");
		        	
		        	System.out.println("Record is updated....");
		        	System.out.println("--------------");
		        	
					break;	
				case 3:
					
					System.out.println("\n Enter the Lid");
		        	lid=Integer.parseInt(sc.nextLine());
		        	
		        	k=stmt.executeUpdate("delete from learner where lid='"+lid+"' ");
		        	
		        	System.out.println("Record is deleted....");
		        	System.out.println("--------------");
				 
					break;	
				case 4:
					
					System.out.println("\n Enter the Lid to search data: ");
		        	lid=Integer.parseInt(sc.nextLine());
		        	ResultSet rs=stmt.executeQuery("select * from learner where lid= " +lid);
		        	while(rs.next()) {
		        		System.out.println(rs.getInt(1));
		        		System.out.println(rs.getString(2));
		        		System.out.println(rs.getString(3));
		        	}
		        	System.out.println("--------------");
		       
					break;
				case 5:
					
					ResultSet rs1=stmt.executeQuery("select * from learner");
		        	while(rs1.next()) {
		        		System.out.println(rs1.getInt(1));
		        		System.out.println(rs1.getString(2));
		        		System.out.println(rs1.getString(3));
		        	}
		        	System.out.println("--------------");
				  
					break;	*/
				
			
		
				}
				
					}while(true);
						}
		          catch(Exception e) {
						e.printStackTrace();
					}
				}
		

				

	}


