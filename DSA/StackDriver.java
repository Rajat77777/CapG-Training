package DSA;

public class StackDriver {
	public static void main(String[] args) {
		StackUsingLL stack =new StackUsingLL();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.pop();
		System.out.println(stack.peek());
		stack.display();

		
	}

}
