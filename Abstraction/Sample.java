package Abstraction;

interface Sample {
	//public static fina
	int a =10;
	
	static void display() {
		System.out.println("Display");
	}
	
	void task();
	
	private void sample() {
		System.out.println("Private Method");
	}
	default void task2() {
		System.out.println("Default Method");
	}

}
