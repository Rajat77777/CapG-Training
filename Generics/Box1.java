package Generics;

public class Box1<T> {
	T value;
	
	Box1(T value){

		this.value=value;
	}
	

	
	public static void main(String[] args) {

		Box1<Integer> b1 = new Box1<Integer>(10);
		Box1<Integer> b2= b1;
		Box1<Number> b3= b1;
		Box1<Object> b4=b1;
		
		
		Box1<?>b5=b1;
		Box1<? extends Object>b6= b1;
		Box1<? super Number>b7=b1;
		
	}
	
	

}
