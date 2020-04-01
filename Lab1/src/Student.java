
public class Student {
	private String name;
	private float grade;
	
	public Student() {
		name = "";
		grade = 0;
	}
	
	public Student(String name, float grade) {
		this.name = name;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getGrade() {
		return grade;
	}

	public void setGrade(float grade) {
		this.grade = grade;
	}
	
	public Student myClone() {
		Student copy = new Student();
		copy.name = name;
		copy.grade = grade;
		return copy;
	}
}
