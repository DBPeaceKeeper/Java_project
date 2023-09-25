package src.ppt3_ckh;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			
			System.out.print("부서명을 입력하세요 : ");
			String deptName = input.nextLine();
			Department department = new Department(deptName);
			
			while (true) {
                System.out.print("사원의 이름과 직급을 입력하세요(q를 입력하여 종료) : ");
                String userInput = input.next();
                if ("q".equalsIgnoreCase(userInput)) {
                    break;
                }
                String employeeName = userInput;
                String employeeTitle = input.next();
                department.addEmployees(department.new Employee(employeeName, employeeTitle));
            }
			
			department.getEmployeesList();
			 
		}
		
	}

}
