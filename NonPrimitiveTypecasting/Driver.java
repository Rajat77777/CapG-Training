package NonPrimitiveTypecasting;




public class Driver {
	

	
	    public static int maxSubarraySum(int[] arr) {
	        if (arr == null || arr.length == 0) {
	            return 0;
	        }

	        int maxSoFar = arr[0];
	        int currentMax = arr[0];

	        for (int i = 1; i < arr.length; i++) {
	            currentMax = Math.max(arr[i], currentMax + arr[i]);
	            maxSoFar = Math.max(maxSoFar, currentMax);
	        }

	        return maxSoFar;
	    }

	    public static void main(String[] args) {
	        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
	        int result = maxSubarraySum(arr);
	        System.out.println(result); 
	    }
	}	
	



