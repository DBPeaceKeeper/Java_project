package src.ppt4;

import java.util.Arrays;

public class MainClass {
	
	public static void main(String[] args) {
		
			int[] arrInt = {1,2,3,4,5};
			int[] arrInt2 = new int[] {10,20,30,40,50};
			
			int[] arrInt3 = new int[5];
			int[] arrInt4 = new int[6];
			
			System.arraycopy(arrInt, 0, arrInt3, 0,3);
			arrInt4 = Arrays.copyOf(arrInt2, arrInt2.length);
			
			for(int value : arrInt3) {
				System.out.print(value + " ");
			}
			System.out.println();
			
			for(int value : arrInt4) {
				System.out.print(value + " ");
			}
			System.out.println();
	}
	 
}
 