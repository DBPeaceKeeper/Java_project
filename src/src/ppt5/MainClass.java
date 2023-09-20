package src.ppt5;

public class MainClass {

	public static void main(String[] args) {
		Stack<Integer> myIntegerStack = new Stack<Integer>(10);
		Stack<String> myStringStack = new Stack<String>(10);
		
		myIntegerStack.push(1);
		myIntegerStack.pop();
		myIntegerStack.push(2);
		myIntegerStack.peek();
		
		myIntegerStack.printStack();
		
	}
}