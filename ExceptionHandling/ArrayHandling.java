package ExceptionHandling;

public class ArrayHandling {
    public static void main(String[] args) {

        int[] arr = {5, 7, 4, 6, 9, 1, 8, 2};
        try {
            System.out.println(arr[13]); 
            String str = null;
            System.out.println(str.length()); 

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Null pointer exception: " + e.getMessage());
        } catch (Exception e) { 
            System.out.println("An unexpected exception occurred: " + e.getMessage());
        }

    }
}