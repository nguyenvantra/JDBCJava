package team3.fsoft.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import team3.fsoft.constant.Constant;

public class GetConnection {
	public static Connection connectDb() throws ClassNotFoundException, SQLException {
		Class.forName(Constant.DRIVER_NAME);
		return DriverManager.getConnection(Constant.URL_CONNECTION,
				Constant.USER_NAME, Constant.PASS_WORD);
	}
}
