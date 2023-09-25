package src.ppt5;

import java.util.HashMap;
import java.util.Scanner;

public class CountChar {

	private HashMap<Character, Integer> countStr;
	private String str;
	
	public CountChar() {
		this.countStr = new HashMap<>();
	}
	
	public void inputString() {
		System.out.println("문자열을 입력해주세요");
		try(Scanner sc = new Scanner(System.in)){
			str = sc.nextLine();
			str = str.replaceAll(" ", "");
		}
	}
	
	public void countChar() {
		
		Integer count = 0;
		int i = 0;
		int j = 0;
		
		for(i = 0; i < str.length(); i++) {
			count = 0;
			for(j = i; j < str.length(); j++) {
				if(str.charAt(j) == str.charAt(i)) {
					count++;
				}
			}
			if(!countStr.containsKey(str.charAt(i))) {
				countStr.put(str.charAt(i), count);
			}
			else {
				continue;
			}
		}
	}
	
	public void inputCountStr() {
		for(var elem : countStr.entrySet()) {
			System.out.print(elem.getKey() + " : " + elem.getValue() + ", ");
		}
	}
	
}
