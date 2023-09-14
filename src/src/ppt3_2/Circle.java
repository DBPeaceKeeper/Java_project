package src.ppt3_2;

public class Circle implements ShapeInterface, Perimeter {
	
	double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double calculateArea() {
		return radius * radius * Math.PI;
	}
	
	@Override
	public double calculateRound() {
		return 2 * radius * Math.PI;
	}

}
