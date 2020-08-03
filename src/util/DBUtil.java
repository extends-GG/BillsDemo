package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 数据库工具类
 * 
 * @author 于修彦
 *
 */
public class DBUtil {
	static String ip = "localhost";
	static int port = 3306;
	static String database = "smallbill";
	static String encoding = "UTF-8";
	static String loginName = "root";
	static String password = "123456";
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 获取连接
	 * 
	 * @return
	 */
	public static Connection getConn() {

		String url = String.format("jdbc:mysql://%s:%d/%s?characterEncoding=%s", ip, port, database, encoding);
		try {
			return DriverManager.getConnection(url, loginName, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
