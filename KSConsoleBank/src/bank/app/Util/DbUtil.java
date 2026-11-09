package bank.app.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class DbUtil {
    // 아래 세 값을 본인 Oracle DB 환경에 맞게 변경하세요.
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:free";
	private static final String USER = "hr";
	private static final String PASSWORD = "hr";

    private DbUtil() { }

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
        } catch (ClassNotFoundException e) {
            throw new SQLException("Oracle JDBC 드라이버(ojdbc)가 프로젝트에 없습니다.", e);
        }
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
