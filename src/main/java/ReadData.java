import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Map;

public class ReadData {
	public static void main(String[] args) throws FileNotFoundException {
		ObjectMapper objectmapper = new ObjectMapper();
		
		FileReader filereader = new FileReader("C:\\Users\\User\\eclipse-workspace\\JSONHandling\\Student.json");
		Map<String,Object> map = objectmapper.readValue(filereader,Map.class);
		
		for(String string : map.keySet()) {
			System.out.println(string+"\t"+map.get(string));
		}
	}

}
