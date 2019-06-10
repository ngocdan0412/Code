package ft.coffee.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectUtil {

	public static Connection getConnect() throws SQLException {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tfcafe", "root", "");
		} catch (SQLException e) {
			throw new SQLException(e.getMessage());
		}

		return connection;
	}

	public static void disconnect(Connection connection) throws SQLException {
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				throw new SQLException(e.getMessage());
			}
		}
	}
}
