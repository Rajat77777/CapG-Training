package Demo;


public class PaindromeCheecker{


public String reverse(String s) {
	StringBuilder sb = new StringBuilder(s);
	return sb.reverse().toString();
}

public boolean palindrome(String s) {
	String reverse = reverse(s);
	return s.equals(reverse);
}
}
