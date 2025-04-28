package DSA;


public class CircularLinkedList {
	private Node head;
	private Node tail;
	private int size=0;
	
	public boolean append(int value) {
		Node node = new Node(value);
		if(isEmpty()) {
			head=node;
			tail=node;
			tail.next=head;
		}else {
			tail.next=node;
			tail=tail.next;
			tail.next=head;
		}
		size++;
		return true;
	}
	

	 public boolean addInd(int value, int index) {
	        if (index < 0 || index > size) {
	            return false; 
	        }

	        if (index == 0) {
	            return prepend(value);
	        } else if (index == size) {
	            return append(value);
	        } else {
	            Node newNode = new Node(value);
	            Node temp = head;
	            for (int i = 0; i < index - 1; i++) {
	                temp = temp.next;
	            }
	            newNode.next = temp.next;
	            temp.next = newNode;
	            size++;
	            return true;
	        }
	    }
	 
	 public boolean deleteFirst() {
	        if (head == null) {

	            return false;
	        }

	        if (head.next == head) { 
	            head = null;
	            size--;
	            return true;
	        }

	        Node tail = head;
	        while (tail.next != head) {
	            tail = tail.next;
	        }

	        head = head.next;
	        tail.next = head; 
	        size--;
	        return true;
	    }
	 
	 public boolean deleteLast() {
	        if (head == null) {

	            return false;
	        }

	        if (head.next == head) { 
	            head = null;
	            size--;
	            return true;
	        }

	        Node temp = head;
	        while (temp.next.next != head) { 
	            temp = temp.next;
	        }

	        temp.next = head; 
	        size--;
	        return true;
	    }

	  public boolean deleteAtIndex(int index) {
	        if (isEmpty()) {
	            return false;
	        }

	        if (index < 0 || index >= size) {
	            return false;
	        }

	        if (index == 0) {
	            head=head.next;
	            if(head==null){
	            	tail=null;
	            }
	            return true;
	        }

	        Node temp = head;
	        int i = 0;
	        while (i < index - 1) { 
	            temp = temp.next;
	            i++;
	        }

	        temp.next = temp.next.next; 
	        size--;
	        return true;
	    }


	
	public boolean prepend(int value) {
		Node node = new Node(value);
		if(isEmpty()) {
			head=node;
			tail=node;
			node.next=head;
		}else {
			node.next=head;
			head=node;
			tail.next=head;
		}
		size++;
		return true;
	}
	
	public void display() {
	
		if(isEmpty()) {
			System.out.println("{}");
			return;
		}
		Node temp=head;
		StringBuilder sb = new StringBuilder("{");
		
		do {
			sb.append(temp.value);
			temp=temp.next;
			if(temp !=head) {
				sb.append(",");
			}
				
			
			}while(temp != head);
		sb.append("}");
		System.out.println(sb.toString());
		System.out.println();
			
		
		
		
		
		}
	public boolean isEmpty() {
		return head==null && tail==null;
	}
	
	private class Node{
		int value;
		Node next;
		
		Node(int value){
			this.value=value;
	}

	}

}
