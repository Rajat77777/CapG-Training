package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class Demo2 {
	public static void main(String[] args) throws IOException {
		FileWriter f = new FileWriter("C:\\Users\\User\\eclipse-workspace\\JavaProgramming\\src\\FileHandling\\Firstfile.txt");
		f.write("hi");
		f.write("\n");

		f.write("a");
		f.write("\n");
		f.write(99);
		f.write("\n");

		f.flush();
		System.out.println("data written");
	}

}
