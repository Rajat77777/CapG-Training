package variables;
import java.util.Scanner;

public class Sample18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  
        int rev = 0;
        int original = n;  
        int rem;
        
        
        while (n > 0) {
            rem = n % 10;  
            rev = (rev * 10) + rem;  
            n = n / 10;  
        }

        
        if (fallin(rev, original)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }

    
    public static boolean fallin(int rev, int original) {
        return rev == original;
    }
}
