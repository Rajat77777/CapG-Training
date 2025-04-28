import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteObject {
	public static void main(String[] args) throws IOException {
		Teacher teacher = new Teacher("ankan",49);
		ObjectMapper objectmapper = new ObjectMapper();
		FileWriter filewriter = new FileWriter("C:\\Users\\User\\eclipse-workspace\\JSONHandling\\Teacher.json");
		objectmapper.writeValue(filewriter, teacher);
		System.out.println("data entered");
		
		FileReader fr = new FileReader("C:\\Users\\User\\eclipse-workspace\\JSONHandling\\Teacher.json");
		Teacher t =objectmapper.readValue(fr,Teacher.class);
		System.out.println(t.getName()+"\t"+t.getExperience());
	}

}
