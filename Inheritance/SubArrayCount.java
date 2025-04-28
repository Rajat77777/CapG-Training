package Inheritance;

public class SubArrayCount {


	    public static int countNegativeSubarrays(int[] arr) {
	        if (arr == null || arr.length == 0) {
	            return 0;
	        }

	        int count = 0;
	        int n = arr.length;

	        for (int i = 0; i < n; i++) {
	            for (int j = i; j < n; j++) {
	                int sum = 0;
	                for (int k = i; k <= j; k++) {
	                    sum += arr[k];
	                }
	                if (sum < 0) {
	                    count++;
	                }
	            }
	        }
	        return count;
	    }

	    public static void main(String[] args) {
	        int[] arr1 = {-1,2,-3,4,-5};
	        

	        System.out.println("Negative subarrays in arr1: " + countNegativeSubarrays(arr1)); 
	      
	    }
	}


