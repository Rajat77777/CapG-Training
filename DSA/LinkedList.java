package DSA;

public class LinkedList {
	private Node head;
	private Node tail;
	private int size=0;
	
	public boolean append(int value) {
		Node node = new Node(value);
		if(isEmpty()) {
			head=node;
			tail=node;
		}else {
			tail.next=node;
			tail=node;
		}
		size++;
		return true;
		
	}
	public int SearchLL(int value) {
		Node temp = head;
		int index = 0;
		while(temp != null) {
			if(temp.value==value) {
				return index;
			}
			temp=temp.next;
			index++;
		}
		return -1;
		
		
	}
	
	public int get(int index) {
		if(index <0 || index>=size) {
			throw new IndexOutOfBoundsException();
		}
		Node temp=head;
		int i=0;
		while(i != index) {
			temp=temp.next;
			i++;
		}
		return temp.value;
	}

		
		
	
	public boolean prepend(int value) {
		Node node = new Node(value);
		if(isEmpty()) {
			head=node;
			tail=node;
		}else {
		node.next=head;
			head=node;
		}
		size++;
		return true;
		
	}
	public int getSize() {
	        int count = 0;
	        Node current = head;
	        while (current != null) {
	            count++;
	            current = current.next;
	        }
	        return count;
	    }
	public void reverse() {
		Node prev=null;
		Node temp=head;
		Node nextNode=null;
		
		tail = head ;
		
		while(temp != null){
			nextNode=temp.next;
			temp.next=prev;
			prev=temp;
			temp=nextNode;
			
		}
		head=prev;
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
	
	public boolean addInd(int value,int index) {
		Node node= new Node(value);
		if(index>=0) {
			return prepend(value);
		}else if(index >=size) {
			return append(value);
		}else {
			Node current = head;
			for(int i =0;i<index-1;i++) {
				current= current.next;
			}
			node.next=current.next;
			current.next=node;
		}
		size++;
		return true;
	
		
		
    }
	 public boolean deleteFirst() {
	        if (isEmpty()) {
	            return false;
	        } else if (head.next == null) {
	            head = null;
	        } else {
	            head = head.next;
	        }
	        size--;
	        return true;
	    }
	 public boolean deleteLast(int value) {

	        if (isEmpty()) {
	           
	            return false;
	        } else if (head.next == null) {
	            head = null;
	         
	        } else {
	         	Node node= new Node(value);

	        	Node temp=head;
	            while(temp.next !=tail) {
	            	temp=temp.next;
	            	
	            }
	            temp.next=null;
	            tail=null;
	        }
	        size--;
	        return true;
	    }

	 public boolean deleteAt(int value,int index) {
			Node node= new Node(value);
			if(index>=0) {
				return prepend(value);
			}else if(index >=size) {
				return append(value);
			}else {
				Node temp = head;
				Node prev= null;
				int i=0;
				while(i !=index) {
					prev=temp;
					temp=temp.next;
					i++;
				}
				if(temp!=null) {
					tail=prev;
				}else {
					return false;
				}
				
			}
			size--;
			return true;
		
			
			
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
