package team3.fsoft.model;

public class Student {
	private int id;
	private String name;
	private String address;
	private String skill;

	public Student() {

	}
	
	public Student(String name, String address, String skill) {
		this.name = name;
		this.address = address;
		this.skill = skill;
	}

	public Student(int id, String name, String address, String skill) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.skill = skill;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

}
