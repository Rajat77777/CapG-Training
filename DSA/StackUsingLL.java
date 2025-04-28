package DSA;

import java.util.EmptyStackException;

public class StackUsingLL {
	private LinkedList list;
	private int pointer=-1;
	
	public StackUsingLL() {
		list = new LinkedList();
	}
	
	public boolean push(int value) {
		pointer++;
		return list.append(value); 
	}
	public int pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		int data = list.get(pointer);
		list.deleteLast(data);
		pointer--;
		return data;
		
	}
	
	
	public int peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return list.get(pointer);

	}
	public boolean isEmpty() {
		return pointer == -1;
	}
	
	public void display() {
		list.display();
	}

}
