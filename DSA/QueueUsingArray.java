package DSA;

import java.util.Arrays;

public class QueueUsingArray {
	int[] data;
	int pointer = -1;
	int initial_capacity=10;
	QueueUsingArray(){
		data= new int[initial_capacity];
		
	}
	QueueUsingArray(int size) {
		data = new int[size];
	}
	public boolean insert(int value) {
		if(isfull()) {
			data=Arrays.copyOf(data, data.length*2);
		}
		pointer++;
		data[pointer]=value;
		return true;
	}
	
	public void display() {
	
		for(int i=0;i<=pointer;i++) {
			System.out.println(data[i]);
		}
	
	}
	public boolean delete(int value) {
		if(isEmpty()) {
			return false;
		}
		else {
			for(int i=1;i<=pointer;i++) {
				data[i-1]=data[i];
			}
			pointer--;
			return true;
		}
	}
	
	
	private boolean isfull() {
		return pointer ==data.length-1;
	}
	private boolean isEmpty() {
		return pointer ==-1;
	}

}
