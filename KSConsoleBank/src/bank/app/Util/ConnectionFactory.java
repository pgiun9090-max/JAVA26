package bank.app.Util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	
	public Connection getConnection() {
		
		Connection conn = null;
		try {
			
			// 1단계 : 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2단계 : DB 접속 후 Connection 객체 얻기
			String url = "jdbc:oracle:thin:@//localhost:1521/free";
			String user 	= "hr";
			String password = "hr";
			
			conn = DriverManager.getConnection(url, user, password);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
}

