package src.ppt3_2;

import java.util.Arrays;

public class Triangle implements Perimeter, ShapeInterface {

	double length1;
	double length2;
	double length3;
	double s;
	double[] arr;
	
	public Triangle(double[] arr) {
		this.length1 = arr[0];
		this.length2 = arr[1];
		this.length3 = arr[2];
		this.s = (length1 + length2 + length3)/2;
		this.arr = arr;
	}
	
	@Override
	public double calculateArea() {
		Arrays.sort(arr);
		if(arr[0] < arr[1] + arr[2]) {
			double Area = (s*(s-length1)*(s-length2)*(s-length3));
			return Math.sqrt(Area);
		}
		System.out.println("올바른 삼각형이 아닙니다.");
		return 0;
	}

	@Override
	public double calculateRound() {
		Arrays.sort(arr);
		if(arr[0] < arr[1] + arr[2]) {
			return length1 + length2 + length3;
		}
		System.out.println("올바른 삼각형이 아닙니다.");
		return 0;
	}
	
}
