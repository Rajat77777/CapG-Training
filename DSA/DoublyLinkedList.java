package DSA;


public class DoublyLinkedList {
	private Node head;
	private Node tail;
	private int size;
	
	private class Node{
		int value;
		Node next;
		Node prev;
		
		Node(int value){
			this.value=value;
		}
	}
	public boolean isEmpty() {
		return head==null && tail==null;
	}
	public boolean insertInd(int index,int value) {
		if(index<=0) {
			return prepend(value);
			
		}
	else if(index>=size) {
		return append(value);
	}
	Node node = new Node(value);
	Node temp=head;
	Node prev=null;
	int i=0;
	
	while(i != index) {
		prev=temp;
		temp=temp.next;
		i++;
	}
	prev.next=node;
	node.prev=prev;
	node.next=temp;
	temp.prev=node;
	
	size++;
	return true;
	
}
	public boolean deleteFirst() {
		if(isEmpty()) {
			return false;
		}
		if(head==tail) {
			head=null;
			tail=null;
			return false;
		}
		
			head=head.next;
			head.prev=null;
			size--;
			return true;
		}
		
	
	
	public boolean deleteLast() {
		if(isEmpty()) {
			return false;
		}
		if(head==tail) {
			head=null;
			tail=null;
			return false;
		}
			tail=tail.prev;
			tail.next=null;
			
			size--;
			return true;
		}
	
	public boolean deleteInt(int index) {
		if(isEmpty()|| index < 0|| index >=size) {
			return false;
		}
		else if(index ==0) {
			return deleteFirst();
		}else if(index == size -1) {
			return deleteLast();
			
			Node temp=head;
			Node prev=null;
			int i=0;
			while(i != 0) {
				prev=temp;
				temp=temp.next;
				i++;
			}
			temp=temp.next;
			prev.next=temp;
			temp.prev=prev;
			
			size--;
			return true;
		}
		return false;
	}
	
	 public boolean updateNodeAtPosition(int index, int newValue) {
	        if (head == null || index < 0) {
	            return false; 
	        }

	        Node temp = head;
	        int count = 0;

	        while (temp != null && count < index) {
	            temp = temp.next;
	            count++;
	        }

	        if (temp != null && count == index) {
	            temp.value = newValue;
	            return true; 
	        }

	        return false; 
	    }
	 public int search(int key) {
	        Node temp = head;
	        int index = 0;

	        while (temp != null) {
	            if (temp.value == key) {
	                return index; 
	            }
	            temp = temp.next;
	            index++;
	        }

	        return -1; 
	    }

	
	
	 public boolean prepend(int value) {
	        Node node = new Node(value);
	        if (isEmpty()) {
	            head = node;
	            tail=node;
	        } else {
	            node.next = head;
	            head.prev = node;
	            head = node;
	        }
	        size++;
	        return true;
	    }
	public void display() {
		StringBuffer sb = new StringBuffer("{");

		Node temp=head;
		while(temp !=null) {
			sb.append(temp==tail ? temp.value:temp.value+",");
			temp=temp.next;
			
		}
		sb.append("}");
		System.out.println(sb);
		
		}
	public void displayRev() {
		StringBuffer sb = new StringBuffer("{");

		Node temp=tail;
		while(temp.prev !=null) {
			System.out.println(temp.value);
			temp=temp.prev;
			
		}
		System.out.println();
		
		}
	 public boolean append(int value) {
	        Node node = new Node(value);
	        if (isEmpty()) {
	            head = node;
	        } else {
	            Node temp = head;
	            while (temp.next != null) {
	                temp = temp.next;
	            }
	            node.prev = temp;
	            temp.next = node;
	        }
	        size++;
	        return true;
	    }
}
