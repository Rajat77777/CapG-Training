package FileHandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Demo6 {

	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter("C:\\Users\\User\\eclipse-workspace\\JavaProgramming\\src\\FileHandling\\Firstfile.txt");
		pw.println(true);
		pw.println(10.8);
		pw.println("hi");
		pw.println('a');
		pw.flush();
		System.out.println("Data is written");
	}
}
