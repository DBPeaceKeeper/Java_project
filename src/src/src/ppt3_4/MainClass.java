package src.ppt3_4;

public class MainClass {

	public static void main(String[] args) {
		Department sales = new Department("Sales", 10);
	
		sales.addEmployee("choi"); // staff
		sales.showEmployees();
		
		sales.addEmployee("kim","manager");
		sales.showEmployees();
		
		sales.addEmployee("lee", "part leader");
		sales.showEmployees();
		
		sales.changeTitle("lee", "president");
		sales.showEmployees();
	} 

}
