package src.ppt3_ckh;
import java.util.ArrayList;

public class Department {
	private String name;
	private ArrayList<Employee> employeesInfo;
	
	public Department(String name) {
		this.setName(name);
		this.employeesInfo = new ArrayList<>();
	}
	
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public void addEmployees(Employee employee) { employeesInfo.add(employee); }
	public void getEmployeesList() {
		if (employeesInfo.isEmpty()) {
			System.out.println("해당 부서는 사원이 없습니다.");
		} else {
			System.out.println("\n부서명 : " + name);
			System.out.println("부서 인원 : " + employeesInfo.size());
	    	System.out.println("=====================");
	    	for (Employee employee : employeesInfo) {
	    		System.out.println("이름 : " + employee.getName());
	    		System.out.println("직급 : " + employee.getTitle());
	    		System.out.println("=====================");
	    	} 
		}
		
	}

	public class Employee {
		
		private String name;
		private String title;
		
		public Employee(String name, String title) {
			this.setName(name);
			this.setTitle(title);
		}
		
		public String getName() { return name; }
		public void setName(String name) { this.name = name; }
		public String getTitle() { return title; }
		public void setTitle(String title) { this.title = title; }
		
	}
}
