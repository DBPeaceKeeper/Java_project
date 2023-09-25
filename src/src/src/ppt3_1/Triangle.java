package src.ppt3_1;

public class Triangle extends Shape {

	private double width;
	private double length;
	
	public Triangle(double width, double length) {
		this.width = width;
		this.length = length;
	};
	
	@Override
	public double calculateArea() {
		return width * length / 2;
	}

}
