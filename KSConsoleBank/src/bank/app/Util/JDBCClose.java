package bank.app.Util;

import java.sql.Connection;
import java.sql.Statement;

public class JDBCClose {

	public static void close(Connection conn, Statement stmt) {
		// 5단계 : DB연결 종료
		if(stmt != null) {
			try {
				stmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		if(conn != null) {
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

