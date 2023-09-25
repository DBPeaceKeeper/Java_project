package src.ppt5;

import java.util.Vector;

public class Driver {
	private Vector<Integer> inforProcess;
	private Vector<Integer> security;	
	private Vector<Integer> allTest;
	
	public Driver() {
		inforProcess = new Vector<Integer>();
		security = new Vector<Integer>();
		allTest = new Vector<Integer>();
	}
	
	public void setInforProcess(int num) {

		if(num < 0 || num > 30) {
			System.out.println("학생의 번호는 1번부터 30번까지 있습니다.");				
		}
		else if(inforProcess.contains((Integer)num)) {
			System.out.println("이미 존재하는 학생 번호입니다.");
		}
		else {
			inforProcess.add((Integer)num);
		}
				
	}

	public void setsecurity(int num) {
		
		if(num < 0 || num > 30) {
			System.out.println("학생의 번호는 1번부터 30번까지 있습니다.");				
		}
		else if(security.contains((Integer)num)) {
			System.out.println("이미 존재하는 학생 번호입니다.");
		}

		else {
			security.add((Integer)num);
		}
	}


	public void allTestStudent() {

		for(int i = 1; i <= 30; i++) {
			if(security.contains((Integer)i) && inforProcess.contains((Integer)i)) {
				allTest.add(i);
			}
		}
		System.out.println("두 시험 모두 응시한 학생");
		allTest.forEach(elem -> System.out.print(elem + " "));
		
		}
	}
		
