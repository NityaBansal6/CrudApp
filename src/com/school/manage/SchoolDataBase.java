package com.school.manage;
import java.sql.*;
public class SchoolDataBase {
	public static boolean insertSchoolToDB(School sl) {
		boolean f=false;
	   try {			
			Connection con=ConnectionProvider.createConnection();
			String q="insert into school(id,school_name,description,establish_date,status) values(?,?,?,?,?)";
			PreparedStatement pstmt=con.prepareStatement(q);			
			pstmt.setInt(1,sl.getId());
			pstmt.setString(2,sl.getSchool_name());
			pstmt.setString(3,sl.getDesciption());
			pstmt.setString(4,sl.getEstablish_date());
			pstmt.setString(5,sl.getStatus());			
			pstmt.executeUpdate();
			f=true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}
	public static boolean deleteSchool(int id)
	{
		
		boolean f=false;
		try {
			Connection con=ConnectionProvider.createConnection();
			String q="delete from school where id=?";
			PreparedStatement pstmt=con.prepareStatement(q);
			pstmt.setInt(1,id);
			pstmt.executeUpdate();
			f=true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return f;
		
	}
	public static void showAllSchools()
	{
		try {
			//jdbc code...
			Connection con=ConnectionProvider.createConnection();
			String q="select * from school";
			
			School sl = new School();
			Statement stmt=con.createStatement();
			ResultSet set = stmt.executeQuery(q);
			
			System.out.print("Below is the list of all Schools:\n");
			System.out.println("----------------------------------");
			System.out.println("Id\tName\tDesc\t\tdate\t\tstatus");
			System.out.println("----------------------------------");
			while(set.next())
		    {
			int id = set.getInt(1);
			String name=set.getString(2);
			String des=set.getString(3);
			String date=set.getString(4);
			String status =  set.getString(5);
			
			System.out.print(id +"\t");
			System.out.print(name +"\t");
			System.out.print(des +"\t");
			System.out.print(date+"\t");
			System.out.print(status+"\t");
			System.out.println();
			}
			System.out.println("\n");
		}catch(Exception e){ 
			e.printStackTrace();
		} 	
	}
	public static boolean updateSchool(int id,String status)
	{
		boolean f=false;
		try {

			Connection con=ConnectionProvider.createConnection();
			String q="update school set status = ? where id = ?";
			
			PreparedStatement pstmt=con.prepareStatement(q);
			
			pstmt.setString(1,status);
			pstmt.setInt(2,id);
			pstmt.executeUpdate();
			f=true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}
}

