package src.ppt1;

public class PublicClassExam {

	public int publicInt;
	protected int protectedInt;
	int defaultInt;
	private int privateInt;
	
	public PublicClassExam() {}
	protected PublicClassExam(int value) {}
	PublicClassExam(String value){}
	private PublicClassExam(int value, int value2) {}

	public void publicFn() {}
	protected void protectedFn() {}
	void defaultFn() {}
	private void privateFn() {}
}

class DefaultClassExam{
	
}
