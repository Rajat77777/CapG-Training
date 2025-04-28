package Abstraction;

public class Driver {
	public static void main(String[] args) {
		Calculator c = new CalciImplementation();
		System.out.println(	c.add(8, 5));
		System.out.println(	c.div(10, 2));

		System.out.println(	c.sub(20, 10));
	}

}
