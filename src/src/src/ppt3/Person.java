package src.ppt3;

public class Person {
	
	protected String name;
	private int age;
	private String rrn;
	
	public Person() {}
	
	public Person(String name, int age, String rrn) {
		this.name = name;
		this.age = age;
		this.rrn = rrn;
	}
	
	public void greeting() {
		System.out.println("안녕하세요. 저는 " + name + "입니다.");
	}
	
}
