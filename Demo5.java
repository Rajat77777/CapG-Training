package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo5 {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C:\\Users\\User\\eclipse-workspace\\JavaProgramming\\src\\FileHandling\\Firstfile.txt");

		BufferedReader b = new BufferedReader(fr);
		
		String line = b.readLine();
		while(line != null) {
			System.out.println(line);
			line=b.readLine();
		}
	}

}
