package src.ppt5;

import java.util.ArrayList;
import java.util.Scanner;

public class Object {
	private ArrayList<String> object;

	public Object() {
		object = new ArrayList<>();
	}
	
	public void addObject() {
		String name;
		System.out.println("물건의 이름을 입력해주세요. 종료하려면 q나 exit를 입력해주세요");
		try(Scanner sc = new Scanner(System.in)) {
			while(true) {
				name = sc.next();
				System.out.println(name);
				if(name.equals("q") || name.equals("exit")) {
					break;
				}
				else {
					object.add(name);
				}
			}
		}
	}
	
	public void printObject() {
		object.sort(null);
		
		for(int i = 0; i < object.size(); i++) {
			if(i == object.size() - 1) {
				System.out.println(object.get(i));
			} 
			else if(object.get(i).equals(object.get(i + 1))) {
				continue;
			}
			else {
				System.out.print(object.get(i) + " ");
			}
		}
		
	}
}
