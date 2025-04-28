import java.io.FileReader;
import java.util.List;

public class Demo4 {
	public static void main(String[] args) {
		ObjectMapper objectmapper = new ObjectMapper();
		
		FileReader filereader = new FileReader("C:\\Users\\User\\eclipse-workspace\\JSONHandling\\Teacher.json");
		List<Teacher> list = objectmapper.readValue(filereader,List.class);
		System.out.println(list);
	}

}
