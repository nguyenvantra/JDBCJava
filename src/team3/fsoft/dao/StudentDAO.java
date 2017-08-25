package team3.fsoft.dao;

import java.util.List;

import team3.fsoft.model.Student;

public interface StudentDAO {
	List<Student> findAll();

	Student findById(int id);

	int count();

	void create(Student student);

	void update(Student student);

	void delete(Student student);
}
