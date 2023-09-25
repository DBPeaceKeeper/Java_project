package src.ppt5;

public class AnonymousClass{

	public static void main(String[] args) {
		Student kim = new Student("kim", "ansan uni.");

		kim.greeting();
		kim.study();
		kim.getScore();

		Student james = new Student() {
			@Override
			public void greeting() {
				System.out.println("Hello, My Name is " + getName());
				System.out.println("I am studing in " + getSchool());
			}
			public void study() {
				play();
			}
			
			public void play() {
				System.out.println("Play");
			}
		};
		
		james.setName("james");
		james.setSchool("ansan uni.");
		james.greeting();
		james.study();
	}

}

class Person{
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person() {}

	public Person(String name) {
		this.name = name;
	}

	public void greeting() {
		System.out.println("안녕하세요. " + name + " 입니다.");
	}
}

class Student extends Person{

	// 추가 필드 
	private String school;
	private int score=0;

	public Student() {}

	public Student(String name, String school) {
		super(name);
		this.school = school;
	}

	// 부모의 메서드 오버로딩
	@Override
	public void greeting() {
		super.greeting();
		System.out.println("저는 " + school + "에 재학중입니다.");
	}

	// 자식에서 새로운 메서드 추가.
	public void study() {
		System.out.println("열공!");
		setScore(getScore() + 1);
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
}