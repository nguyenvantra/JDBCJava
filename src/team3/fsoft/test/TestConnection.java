package team3.fsoft.test;

import java.sql.SQLException;

import team3.fsoft.connection.GetConnection;

public class TestConnection {
	public static void main(String[] args) {
		System.out.println("Get connection...");
		try {
			System.out.println(GetConnection.connectDb());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Done!");
	}
}
