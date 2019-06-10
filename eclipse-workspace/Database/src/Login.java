import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Login {
	public boolean isLogin(String username, String password) {
		String sql = "SELECT * FROM users WHERE username = ? and password = ?";

		ConnectUtil connectUtil = new ConnectUtil();
		Connection conn = connectUtil.connect();

		try {
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, username);
			statement.setString(2, password);
			ResultSet result = statement.executeQuery();
			if (result.next()) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			connectUtil.disconnect(conn);
		}
		return false;
	}

	// public void country(String sex) {
	// String sql = "SELECT * FROM lms_students WHERE sex = ? ";
	// ConnectUtil connectUtil = new ConnectUtil();
	// Connection conn = connectUtil.connect();
	// PreparedStatement state;
	// try {
	//
	// state = conn.prepareStatement(sql);
	// state.setString(1, sex);
	//
	// ResultSet rs = state.executeQuery();
	//
	// while (rs.next()) {
	// System.out.println(rs.getString(1) + " " + rs.getString(2) + " " +
	// rs.getString(3) + " "
	// + rs.getString(4) + " " + rs.getString(5) + " " + rs.getString(6));
	// }
	// } catch (SQLException e) {
	// e.printStackTrace();
	// } finally {
	// connectUtil.disconnect(conn);
	// }
	//
	// }

	public void show() {
		String sql = "SELECT * FROM users";
		while (rs.next()) {
			System.out.println(rs.getString(1) + "    " + rs.getString(2) + "   " + rs.getString(3) + "    "
					+ rs.getString(4) + "   " + rs.getString(5) + "   " + rs.getString(6));
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Username: ");
		String un = sc.nextLine();
		System.out.print("Password: ");
		String pa = sc.nextLine();

		Login test = new Login();
		if (test.isLogin(un, pa)) {
			System.out.println("Login sucess!!");
		} else {
			System.out.println("Login unsucess!!");
		}
		// test.country(sex);
	}
}
