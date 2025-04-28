package Demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	@Disabled
	void testAdd() {

		int expected=30;
		Calculator c = new Calculator();
		int actual= c.add(10, 20);
		assertEquals(expected,actual);
	}
	@Test
	void testDiv() {
		
		Calculator c = new Calculator();
		assertThrows(ArithmeticException.class,()->c.div(10,0));
	}
	
	

}
