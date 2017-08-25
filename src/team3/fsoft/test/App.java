package team3.fsoft.test;

import java.util.ArrayList;

import team3.fsoft.dao.StudentDAOImp;
import team3.fsoft.model.Student;

public class App {
	public static void main(String[] args) {
		StudentDAOImp studentDAOImp = new StudentDAOImp();

		/*
		 * test method create()
		 */
//		 Student student = new Student("NguyenVanTra", "HoChiMinh", "Java");
//		 studentDAOImp.create(student);

		/*
		 * test method findAll()
		 */
//		ArrayList<Student> list = (ArrayList<Student>) studentDAOImp.findAll();
//		for (Student student : list) {
//			System.out.println(student.getId() + 
//					" " + student.getName() +
//					" " + student.getAddress() + 
//					" " + student.getSkill());
//		}
		
		/*
		 * test method findById(int id)
		 */
		
		Student student = studentDAOImp.findById(1);
		System.out.println(student.getId() + 
				" " + student.getName() +
				" " + student.getAddress() + 
				" " + student.getSkill());

	}
}
