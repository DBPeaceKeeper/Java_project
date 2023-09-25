package src.ppt3_1;

public class MainClass {

	public static void main(String[] args) {
		Circle circle = new Circle(10);
		squar squar = new squar(10,10);
		Triangle triangle = new Triangle(10,10);
		
		System.out.println(circle.calculateArea());
		System.out.println(squar.calculateArea());
		System.out.println(triangle.calculateArea());
	}

}
