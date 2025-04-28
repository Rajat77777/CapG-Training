package variables;
import java.util.Arrays;
public class Sample23 {
	public static void main(String[] args) {
		int [] arr= {3,4,5,6,7,8};
		System.out.println(Arrays.toString(arr));
		int[] arr2=changeValue(arr);
		System.out.println(Arrays.toString(arr2));
	}
	public static int[] changeValue(int[] array) {
		array=new int[2];
		array[0]=100;
		return array;
	}

}
