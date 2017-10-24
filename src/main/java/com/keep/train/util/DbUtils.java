package com.keep.train.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbUtils {

	private static String jdbcName="com.mysql.jdbc.Driver";
	private static String url="jdbc:mysql://127.0.0.1:3306/db_train?useUnicode=true&characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull";
	private static String user="root";
	private static String password="";
	
	public Connection getCon() throws Exception{
		Class.forName(jdbcName);
		Connection con = DriverManager.getConnection(url, user, password);
		return con;
	}
	
	public void closeCon(Connection con) throws Exception{
		if(con != null){
			con.close();
		}
	}
	
	public static void main(String[] args) {
		DbUtils dbUtils = new DbUtils();
		Connection con = null;
		try {
			con = dbUtils.getCon();
			System.out.println("成功");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				dbUtils.closeCon(con);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
