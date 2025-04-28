package Exception;
import java.util.Arrays;

public class MissingNumber {

	

	

	    public static int findMissingNumber(int[] nums) {
	     

	        Arrays.sort(nums);
	        int min = nums[0];
	        int max = nums[nums.length - 1];

	        if (nums.length ==1){
	            if(nums[0] == 0){
	                return 1;
	            }
	            else{
	                return nums[0] + 1;
	            }
	        }

	        for (int i = 0; i < nums.length - 1; i++) {
	            if (nums[i + 1] - nums[i] > 1) {
	                return nums[i] + 1;
	            }
	        }

	        return max + 1;
	    }

	    public static void main(String[] args) {
	        int[] nums1 = {3, 1};
	        System.out.println("Missing number in nums1: " + findMissingNumber(nums1)); 

	        int[] nums2 = {9, 6, 4, 2, 3, 5, 7, 1};
	        System.out.println("Missing number in nums2: " + findMissingNumber(nums2)); 
	       
	    }
	}

