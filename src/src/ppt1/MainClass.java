package src.ppt1;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		boolean younyear = isYounYear();
		
		if(younyear == true) {
			System.out.println("윤년입니다.");
		}
		else {
			System.out.println("윤년이 아닙니다.");
		}
	}


	public static boolean isYounYear() {
	
		try(Scanner scan = new Scanner(System.in)){
			System.out.println("년도를 입력하세요");
			int c = scan.nextInt();
			
			boolean year;
			
			if(c % 4 == 0) {
				if(c % 100 != 0 || c % 400 == 0) {
					year = true;
					return year;
				}
			}
			year = false;
			return year;
		}
	}
}