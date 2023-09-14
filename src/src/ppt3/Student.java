package src.ppt3;

public class Student extends Person{
	private String school;
	private int grade;
	private int s_class;
	
	public Student(String name, int age, String rrn,String school, int grade, int s_class) {
		super(name, age, rrn);
		this.school = school;
		this.grade = grade;
		this.s_class = s_class;
	}
	
	
	public void greeting() {
		super.greeting();
		System.out.println("현재 " + school + "에 재학중이고, " + grade + "학년 " + s_class + "반 입니다.");
	}
	
	void study() {
		System.out.println(name + "이(는)  공부중 입니다.");
	}
	
	void changeName(String name) {
		this.name = name;
	}
	
}
