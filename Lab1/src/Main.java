
public class Main {

	public static void main(String[] args) {
		System.out.println("Hello, World!");
		
		Student s = new Student();
		System.out.println(s.getGrade());
		
		Student s2 = new Student("Ionel", 9.5f);
		System.out.println(s2.getName());
		
		Student s3 = s2.myClone();
		s3.setName("Gigel");
		System.out.println(s2.getName());
	}

}
