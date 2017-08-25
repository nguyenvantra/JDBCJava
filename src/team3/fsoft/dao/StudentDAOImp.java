package team3.fsoft.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import team3.fsoft.connection.GetConnection;
import team3.fsoft.constant.Constant;
import team3.fsoft.model.Student;

public class StudentDAOImp implements StudentDAO {
	private Connection con = null;

	@Override
	public List<Student> findAll() {
		Statement statement = null;
		List<Student> list = new ArrayList<>();
		Student student = null;
		try {
			con = GetConnection.connectDb();

			statement = con.createStatement();
			String query = "select * from " + Constant.TABLE_NAME;
			ResultSet resultSet = statement.executeQuery(query);

			if (resultSet.next()) {
				do {
					student = new Student(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3),
							resultSet.getString(4));
					list.add(student);
				} while (resultSet.next());
			} else {
				System.out.println("No data");
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			if (null != con) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (null != statement) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return list;
	}

	@Override
	public Student findById(int id) {
		Student student = null;
		PreparedStatement preparedStatement = null;
		try {
			con = GetConnection.connectDb();

			String query = "select * from " + Constant.TABLE_NAME + " where id = ?";
			preparedStatement = con.prepareStatement(query);
			preparedStatement.setInt(1, id);

			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				do {
					student = new Student(resultSet.getInt(1),
							resultSet.getString(2),
							resultSet.getString(3),
							resultSet.getString(4));
				}while (resultSet.next());
			} else {
				System.out.println("No data");
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			if (null != con) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (null != preparedStatement) {
				try {
					preparedStatement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return student;
	}

	@Override
	public int count() {
		int count = 0;
		Statement statement = null;
		try {
			con = GetConnection.connectDb();

			statement = con.createStatement();
			String query = "SELECT COUNT(*) FROM " + Constant.TABLE_NAME;
			ResultSet resultSet = statement.executeQuery(query);

			while (resultSet.next()) {
				count = resultSet.getInt(1);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			if (null != con) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (null != statement) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return count;
	}

	@Override
	public void create(Student student) {
		PreparedStatement preparedStatement = null;
		try {
			con = GetConnection.connectDb();

			String query = "insert into " + Constant.TABLE_NAME + " (name, address, skill) values (?,?,?)";
			preparedStatement = con.prepareStatement(query);
			preparedStatement.setString(1, student.getName());
			preparedStatement.setString(2, student.getAddress());
			preparedStatement.setString(3, student.getSkill());

			int rowsInserted = preparedStatement.executeUpdate();
			if (rowsInserted > 0) {
				System.out.println("Insert success");
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			if (null != con) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (null != preparedStatement) {
				try {
					preparedStatement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	@Override
	public void update(Student student) {
		PreparedStatement preparedStatement = null;
		try {
			con = GetConnection.connectDb();

			String query = "update " + Constant.TABLE_NAME + "" + " set name=?, address=?, skill=?";
			preparedStatement = con.prepareStatement(query);
			preparedStatement.setString(1, student.getName());
			preparedStatement.setString(2, student.getAddress());
			preparedStatement.setString(3, student.getSkill());

			int rowsUpdated = preparedStatement.executeUpdate();
			if (rowsUpdated > 0) {
				System.out.println("Update success");
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			if (null != con) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (null != preparedStatement) {
				try {
					preparedStatement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	@Override
	public void delete(Student student) {
		PreparedStatement preparedStatement = null;
		try {
			con = GetConnection.connectDb();

			String query = "delete from " + Constant.TABLE_NAME + " where id=?";
			preparedStatement = con.prepareStatement(query);
			preparedStatement.setInt(1, student.getId());

			int rowsDeleted = preparedStatement.executeUpdate();
			if (rowsDeleted > 0) {
				System.out.println("Detele success");
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			if (null != con) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (null != preparedStatement) {
				try {
					preparedStatement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
