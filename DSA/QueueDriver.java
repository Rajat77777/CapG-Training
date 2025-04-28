package DSA;

public class QueueDriver {
	public static void main(String[] args) {
		QueueUseLL q = new QueueUseLL();
		q.insert(10);
		q.insert(20);
		q.insert(30);
		q.display();
		q.delete(10);
		q.display();

		


	}

}
