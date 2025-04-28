import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Demo3 {
	public static void main(String[] args) throws IOException {
		List<Teacher> list = new ArrayList<Teacher>();
		list.add(new Teacher("Ankan",10));
		list.add(new Teacher("Debangshu",29));
		list.add(new Teacher("Rajat",67));
		
		ObjectMapper objectmapper = new ObjectMapper();
		FileWriter filewriter = new FileWriter("C:\\Users\\User\\eclipse-workspace\\JSONHandling\\List.json");
		
		
	}

}
