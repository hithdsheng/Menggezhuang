package com.sheng.menggezhuang.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 该类的作用是实现对数据库的一些操作，建立连接，获取ps,关闭连接，释放资源
 * */
public class ConnDB {

	//定义常量字符串
	private static final String drivers = "com.mysql.jdbc.Driver";
	private static final String username = "root";
	private static final String password = "";
	private static final String url = "jdbc:mysql://127.0.0.1:3306/mgz_db";
	
	public ConnDB(){
		System.out.println("类ConnDB的无参构造函数执行了.....");
	}
	
	/**
	 * 用于连接数据库的公共方法
	 * */
	public static Connection createConn(){
		//System.out.println("createConnection方法执行了...");
		Connection conn = null;
		try {
			Class.forName(drivers);
			conn = DriverManager.getConnection(url,username,password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	/**
	 * 用于获得PreparedStatement的方法
	 * */
	public static PreparedStatement prepare(Connection connection, String sql){
		PreparedStatement ps = null;
		try {
			ps = connection.prepareStatement(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ps;
	}
	
	/**
	 * 该方法用于关闭到数据库的连接,释放资源
	 * */
	public static void close_conn(Connection connection){
		try {
			connection.close();
			connection = null;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 该方法用于关闭PreparedStatement的实例对象 ps，释放资源
	 * */
	public static void close_ps(PreparedStatement ps){
		try {
			ps.close();
			ps = null;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 该方法用于关闭ResultSet的实例对象 rs。释放资源
	 * */
	public static void close_rs(ResultSet rs){
		try {
			rs.close();
			rs = null;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args){
		//ConnDB connDB = new ConnDB();
		//Connection connection = connDB.createConn();
		//类的静态方法尽量直接使用类名引用，没有必要使用类的某个实例引用。
		Connection connection = ConnDB.createConn();
		if(connection != null){
			System.out.println("数据库连接成功了！");
			ConnDB.close_conn(connection);
		}else{
			System.out.println("数据库连接失败！");
		}
	}
	
}
