package mysns.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

/**
 * File : DBManager.java
 * Desc : �����ͺ��̽� ���� ó�� Ŭ����
 * @author Ȳ����(dinfree@dinfree.com)
 * 
 */
public class DBManager {
	// �����ͺ��̽� ���� ��ü ����
	Statement stmt = null;
	PreparedStatement pstmt = null;
	
	/**
	 * JNDI �� �̿��� Connection ��ü ����
	 * @return
	 */
	public static Connection getConnection() {
		Connection conn;
		try {
			Context initContext = new InitialContext();
			Context envContext = (Context) initContext.lookup("java:/comp/env");
			DataSource ds = (DataSource) envContext.lookup("jdbc/mysql");
			conn = ds.getConnection();
		}
		catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
			return null;
		}
		return conn;
	}
}