package Abstraction;

public class CalciImplementation extends Calculator {

	@Override
	int sub(int a, int b) {
		return a-b;
	}

	@Override
	int add(int a, int b) {
		return a+b;
	}

	@Override
	int div(int a, int b) {
		return a/b;
	}
	

}
