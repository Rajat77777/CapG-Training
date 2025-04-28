package Comparable;

public class DataS {
	
	public class SimpleLinearSearch {

	    public static int linearSearch(int[] arr, int target) {
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == target) {
	                return i; 
	            }
	        }
	        return -1; 
	    }

	    public static void main(String[] args) {
	        int[] numbers = {5, 10, 15, 20, 25};
	        int target = 15;

	        int index = linearSearch(numbers, target);

	        if (index != -1) {
	            System.out.println("Target " + target + " found at index: " + index);
	        } else {
	            System.out.println("Target " + target + " not found.");
	        }
	    }
	}

}



