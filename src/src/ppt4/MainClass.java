package src.ppt4;

import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {
		char str;
		
		try(Scanner sc = new Scanner(System.in)){
			str = sc.next().charAt(0);
		}
		
		for(int i = str; i - 97 >= 0; i--) {
			for(int j = i; j >= 97; j--) {
				System.out.printf("%c", j);
			}
			System.out.println("");
		}
	}
}