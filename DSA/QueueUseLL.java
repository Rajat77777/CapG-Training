package DSA;

public class QueueUseLL {
	private LinkedList data;
	private int pointer =-1;
	public  QueueUseLL() {
		data=new LinkedList();
	}
	
	public boolean insert(int value) {
		pointer++;
		return data.append(value);
		
	}
	
	public int delete(int value) {
		int temp=data.get(0);
		data.deleteFirst();
		return temp;
	}
	
	public boolean size() {
		return pointer==-1;
	}
	public boolean isEmpty() {
		return pointer==-1;
		
	}
	
	public void display() {
		data.display();
	}

}
