package src.ppt5;

import java.util.ArrayList;

public class Stack<T> {
	
	private int top = 0;
	private int size = 0;
	private ArrayList<T> arr;
	
	public Stack(int size) {
		arr = new ArrayList<T>();
		this.size = size;
	}
	
	public void push(T value) {
		if(top == size) {
			System.out.println("Stack이 만땅입니다.");
		}
		else {
			arr.add(top++, value);
		}
	}
	
	public void pop() {
		if(!IsMyEmpty()) {
			arr.remove(--top);
		}
		else{
			System.out.println("[Error] Stack이 비어있습니다.");
		}
	}
	
	public void peek() {
		if(IsMyEmpty()) {
			System.out.println("Stack이 비어있습니다.");
		}
		else {
			System.out.println(arr.get(--top));
			top++;
		}
	}
	
	public boolean IsMyEmpty() {
		if(this.top == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int size() {
		return top;
	}
	
	public void printStack() {
		for(var value : arr) {
			System.out.print(value+ " ");
		}
	}
	
}
