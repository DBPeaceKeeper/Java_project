package src.ppt5;

import java.util.Map;
import java.util.Scanner;

public class CountChar {

	private Map<String, Integer> countStr;
	private String str;
	private Integer count;
	
	public void inputString() {
		System.out.println("문자열을 입력해주세요");
		try(Scanner sc = new Scanner(System.in)){
			str = sc.next();
		}
		
		for(int i = 0; i < str.length();i++) {
		}
		
	}
	
}
