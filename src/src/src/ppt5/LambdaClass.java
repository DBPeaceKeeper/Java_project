package src.ppt5;

import java.util.Scanner;
import java.util.function.Predicate;

@FunctionalInterface
interface MathOperation {
	int operate(int a, int b);
}

public class LambdaClass {

	public static void main(String[] args) {
	
		Predicate<Integer> odd = ((Integer NUM) -> {
			if(NUM%2 == 0) {
				return false;
			}
			else {
				return true;
			}
		});
		
		Integer num;
		System.out.println("정수를 입력하세요");
		
		try(Scanner sc = new Scanner(System.in)) {
			num = sc.nextInt();
		}
		
		System.out.println(odd.test(num));
		
	}

}
