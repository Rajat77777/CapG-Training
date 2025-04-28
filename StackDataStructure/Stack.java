package StackDataStructure;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack {

	private int[] data;
	private int pointer=-1;
	private int initial_capacity=10;
	
	Stack(){
		data= new int[initial_capacity];
		
		
	}
	
	public int peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return data[pointer];
	}
	
	
	public boolean push(int value) {
		if(isfull()) {
			data=Arrays.copyOf(data, data.length * 2);
			
		}
		pointer++;
		data[pointer]=value;
		return true;
	}
	
	public int pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}else {
			int temp=data[pointer];
			pointer--;
			return temp;
		}
	
	}
	
	public void display() {
		for(int i=0;i<=pointer;i++) {
			System.out.println(data[i]+" ");
		}
		
	} 
	private boolean isEmpty() {
		return pointer==-1;
	}
	
	public boolean isfull() {
		return pointer == data.length-1;
	}
	
}
