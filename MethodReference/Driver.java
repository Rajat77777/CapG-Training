package MethodReference;

public class Driver {

	public static void main(String[] args) {
		Operation o = Calci::add;
		int res = o.operate(10, 20);
		System.out.println(res);
	}
}
