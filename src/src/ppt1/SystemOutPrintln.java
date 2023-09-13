package src.ppt1;

public class SystemOutPrintln {
	public void test1() {
		System.out.println("test1");
	}

	protected void test2() {
		System.out.println("test2");
	}

	void test3() {
		System.out.println("test3");
		test4();
	}

	private void test4() {
		System.out.println("test4");
	}

}