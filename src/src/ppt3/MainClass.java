package src.ppt3;

public class MainClass {

	public static void main(String[] args) {
		Person lee = new Person("lee", 20, "810000-2000000");
		Student cho = new Student("cho", 21, "910000-1000000","한직교",1,3);
		
		lee.greeting();
		System.out.println("--------------------------------------------");
		
		cho.greeting();
		System.out.println("--------------------------------------------");
		
		cho.changeName("Cho Yong Ja");

		cho.greeting();
		System.out.println("--------------------------------------------");

	}
}