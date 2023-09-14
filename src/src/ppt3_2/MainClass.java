package src.ppt3_2;

public class MainClass {

	public static void main(String[] args) {
		double[] arr = {10,10,10};
		Circle circle = new Circle(10);
		Triangle triangle = new Triangle(arr);
		Squar squar = new Squar(10,10);
		
		System.out.println("원의 둘레 : " + circle.calculateRound());
		System.out.println("원의 넓이 : " + circle.calculateArea());
		System.out.println("삼각형의 둘레 : " + triangle.calculateRound());
		System.out.println("삼각형의 넓이 : " + triangle.calculateArea());
		System.out.println("사각형의 둘레 : " + squar.calculateRound());
		System.out.println("사각형의 넓이 : " + squar.calculateArea());
	}

}
