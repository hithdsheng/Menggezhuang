package com.sheng.menggezhuang.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * �����������ʵ�ֶ����ݿ��һЩ�������������ӣ���ȡps,�ر����ӣ��ͷ���Դ
 * */
public class ConnDB {

	//���峣���ַ���
	private static final String drivers = "com.mysql.jdbc.Driver";
	private static final String username = "root";
	private static final String password = "";
	private static final String url = "jdbc:mysql://127.0.0.1:3306/mgz_db";
	
	public ConnDB(){
		System.out.println("��ConnDB���޲ι��캯��ִ����.....");
	}
	
	/**
	 * �����������ݿ�Ĺ�������
	 * */
	public static Connection createConn(){
		//System.out.println("createConnection����ִ����...");
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
	 * ���ڻ��PreparedStatement�ķ���
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
	 * �÷������ڹرյ����ݿ������,�ͷ���Դ
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
	 * �÷������ڹر�PreparedStatement��ʵ������ ps���ͷ���Դ
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
	 * �÷������ڹر�ResultSet��ʵ������ rs���ͷ���Դ
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
		//��ľ�̬��������ֱ��ʹ���������ã�û�б�Ҫʹ�����ĳ��ʵ�����á�
		Connection connection = ConnDB.createConn();
		if(connection != null){
			System.out.println("���ݿ����ӳɹ��ˣ�");
			ConnDB.close_conn(connection);
		}else{
			System.out.println("���ݿ�����ʧ�ܣ�");
		}
	}
	
}
