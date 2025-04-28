package FileHandling;

import java.io.File;
import java.util.Arrays;

public class Demo1 {
	public static void main(String[] args) {
		File f = new File("C:\\Users\\User\\eclipse-workspace\\JavaProgramming\\src\\FileHandling\\Firstfile.txt");

		String[] list_of_files=f.list();
		System.out.println(Arrays.toString(list_of_files));
	}
	

}
