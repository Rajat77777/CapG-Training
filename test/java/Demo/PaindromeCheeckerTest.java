package Demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PaindromeCheeckerTest {

	@Test
	void testReverse() {

		String expected="olleh";
		String actual= new PaindromeCheecker().reverse("hello");
		assertEquals(expected,actual);
	}

	
	@Test
	void testPalindrome() {
		boolean expected =true;
		boolean actual = new PaindromeCheecker().palindrome("wow");
		assertEquals(expected,actual);
	}
	
	@BeforeAll
	public static void m1() {
		System.out.println("before-all");
	}
	@AfterAll
	public static void m2() {
		System.out.println("after-all");
	}
	@BeforeEach
	public static void m3() {
		System.out.println("before-each");
	}
	@AfterEach
	public static void m4() {
		System.out.println("after-each");
	}
}
