package src.ppt4;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		upAndDown uad = new upAndDown();
		int input;
		int chance = 10;
		
		try(Scanner sc = new Scanner(System.in)){
			uad.getRandomNum();
			do {
				System.out.println("정수를 입력하세요");
				input = sc.nextInt();
				uad.setNum(input);
				System.out.println("기회가 " + --chance + "번 남았습니다.");
				if(chance == 0) { 
					System.out.println("기회 박탈");
					break; 
				};
			} while(!uad.end(uad.isUp()));
		}

	}


}