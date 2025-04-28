package Exception;

public class Demo2 {

	public static void printNumber() throws InterruptedException{
		for(int i=0;i<=10;i++) {
			System.out.println(i);
			Thread.sleep(1000);
		}
	}
	public static void demo2() throws InterruptedException{
		printNumber();
	}
	public static void main(String[] args) {
		try {
			demo2();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
