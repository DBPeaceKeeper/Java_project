package src.ppt3;

public class MainClass {

	public static void main(String[] args) {
		MyImplement A = new MyImplement();
		
		A.method1();
		A.method2();
		
		System.out.println(A.Value1);
		System.out.println(A instanceof MyImplement);
		System.out.println(A instanceof MyInterface);
	}
}