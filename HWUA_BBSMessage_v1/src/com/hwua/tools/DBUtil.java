package com.hwua.tools;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import com.mysql.jdbc.PreparedStatement;

public class DBUtil {
	private static String driver = null;
	private static String url = null;
	private static String username = null;
	private static String password = null;
	
	static{
		InputStream is = DBUtil.class.getClassLoader().getResourceAsStream("config.properties");
		Properties props = new Properties();
		try {
			props.load(is);
			driver = props.getProperty("config.driver");
			url = props.getProperty("config.url");
			username = props.getProperty("config.username");
			password = props.getProperty("config.password");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException("读取配置文件出错");
		}
		
	}
	
	/**
	 * 获取一个连接
	 * 
	 * @return
	 */
	public static Connection getConnection() {
		Connection conn = null;
		// 注册驱动
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			throw new RuntimeException("注册驱动失败");// 手动抛出异常
		}
		// 建立数据库连接
		try {
			conn = DriverManager.getConnection(url, username, password);
			System.out.println("success");
		} catch (SQLException e) {
			throw new RuntimeException("数据库连接失败");// 手动抛出异常
		}

		return conn;
	}
	
	
	
	/**
	 * 释放资源
	 * @param rs
	 * @param pstmt
	 * @param conn
	 */
	public static void closeAll(ResultSet rs,PreparedStatement pstmt,Connection conn){
		try {
			if(rs!=null){
				rs.close();
			}
			if(pstmt!=null){
				pstmt.close();
			}
			if(conn!=null){
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
