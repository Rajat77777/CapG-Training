package Comparable;

public class CountDigits {


	    public static int countEvenDigits(int[] nums) {
	        int count = 0;
	        for (int num : nums) {
	            int digitCount = 0;
	            while (num > 0) {
	                digitCount++;
	                num /= 10;
	            }
	            if (digitCount % 2 == 0) {
	                count++;
	            }
	        }
	        return count;
	    }

	    public static void main(String[] args) {
	        int[] numbers = {12, 345,2, 26, 7896};
	        int evenCount = countEvenDigits(numbers);
	        System.out.println("Count of numbers with even digits: " + evenCount);
	    }
	}

