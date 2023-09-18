package src.ppt3_4;

/**
 * 부서를 관리하는 클래스
 * - 부서 이름 설정(생성자, setter)
 * - 부서 이름 반환(getter)
 * - 사원 추가(addEmployee)
 * - 사원 직급 변경(chageTitle)
 * - 사원 리스트 반환(showEmployees)
 * 
 * @author srlee
 * @version 1.0
 */
public class Department{
	
	// 부서 이름
	private String dept_name;
	
	// 사원 리스트
	private Employee[] employees;
	
	private int capacity;
	private int size;
	
	// 생성자
	public Department() {}
	public Department(String name) { setDept_name(name); }
	public Department(String name, int cnt ) {
		this(name);
		capacity = cnt;
		employees = new Employee[capacity];
		size = 0;
	}
	
	public void addEmployee(String name) {
		employees[size++] = new Employee(name);
	}
	
	public void addEmployee(String name, String title) {
		employees[size++] = new Employee(name, title);
	}
	
	public void changeTitle(String name, String newTitle) {
		for(int i = 0 ; i< size ; i++) {
			if(name.equals(employees[i].getName())) {
				employees[i].setTitle(newTitle);
				break;
			}
		}
	}
	
	public void showEmployees() {
		System.out.println(dept_name);
		for(int i = 0 ; i<size; i++) {
			System.out.printf("%15s%10s\n", employees[i].getTitle(), employees[i].getName());
		}
		System.out.println("------------------------------");
	}
	
	public String getDept_name() {
		return dept_name;
	}
	
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}

	/**********************************************************
	 * 사원 클래스(부서의 내부 클래스)
	 * - 사원 이름 설정(생성자, setter)
	 * - 사원 이름 반환(getter)
	 * - 사원 직급 설정(setter)
	 * - 사원 직급 반환(getter)
	 **********************************************************/
	public class Employee{
		
		private String name;
		private String title;
		
		public Employee() {
			System.out.println("Employee()");
		}
		public Employee(String name) { 
			this(name, "staff");
		}
		public Employee(String name, String title) { 
			this.setName(name);
			this.setTitle(title);
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
	}
}