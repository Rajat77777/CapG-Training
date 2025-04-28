package variables;

public class CalciDriver {

	public static void main(String[] args) {
		Calculator c = new Calculator(10,20);
		
		c = Calculator.add(c).multiply(c);
		
		System.out.println(c.getResult());
	}
}
