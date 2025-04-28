package FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Demo4 {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("C:\\Users\\User\\eclipse-workspace\\JavaProgramming\\src\\FileHandling\\Firstfile.txt");
		BufferedWriter b = new BufferedWriter(fw);
		b.write("hi");
		b.newLine();
		b.write(100);
		b.newLine();
		b.write("z");
		b.newLine();
		b.flush();
		System.out.println("data written");
	}
}
