package src.ppt3_2;

public class Squar implements Perimeter, ShapeInterface {

	double width;
	double length;
	
	public Squar(double width, double length) {
		this.width = width;
		this.length = length;
	}
	
	@Override
	public double calculateArea() {
		return width * length;
	}

	@Override
	public double calculateRound() {
		return 2*width + 2*length;
	}

}
