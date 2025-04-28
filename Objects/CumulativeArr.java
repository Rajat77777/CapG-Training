package Objects;
import java.util.Arrays;


public class CumulativeArr {


	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 5};
	        if (arr == null || arr.length == 0) {
	            System.out.println(Arrays.toString(new int[0]));
	            return;
	        }

	        int[] cumulativeSumArr = new int[arr.length];
	        cumulativeSumArr[0] = arr[0];

	        for (int i = 1; i < arr.length; i++) {
	            cumulativeSumArr[i] = cumulativeSumArr[i - 1] + arr[i];
	        }

	        System.out.println(Arrays.toString(cumulativeSumArr));
	    }
	}


