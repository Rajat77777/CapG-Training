package Comparable;

public class BinaryQues {


	    public static int[] findOccurrences(int[] arr, int target) {
	        int first = find(arr, target, true);
	        int last = find(arr, target, false);
	        return new int[] {first, last};
	    }

	    private static int find(int[] arr, int target, boolean findFirst) {
	        int left = 0;
	        int right = arr.length - 1;
	        int result = -1;

	        while (left <= right) {
	            int mid = left + (right - left) / 2;
	            if (arr[mid] == target) {
	                result = mid;
	                if (findFirst) {
	                    right = mid - 1; 
	                } else {
	                    left = mid + 1; 
	                }
	            } else if (arr[mid] < target) {
	                left = mid + 1;
	            } else {
	                right = mid - 1;
	            }
	        }
	        return result;
	    }

	    public static void main(String[] args) {
	        int[] arr = {2, 5, 5, 5, 6, 6, 8, 9, 9, 9};
	        int target = 5;

	        int[] occurrences = findOccurrences(arr, target);
	        System.out.println("First: " + occurrences[0] + ", Last: " + occurrences[1]);

	        target = 9;
	        occurrences = findOccurrences(arr, target);
	        System.out.println("First: " + occurrences[0] + ", Last: " + occurrences[1]);

	      
	    }
	}


