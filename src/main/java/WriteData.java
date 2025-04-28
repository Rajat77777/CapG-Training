import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Teacher{
	String name;
	int experience;
	
		Teacher(String name,int experience){
			this.name=name;
			this.experience=experience;
			
		}
	}





public class WriteData {
	public static void main(String[] args) throws IOException {
		ObjectMapper objectmapper = new ObjectMapper();
		
		Teacher teacher = new Teacher("Rajat",28);
		
		
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("Id",101);
		map.put("Name", "Dinga");
		map.put("Percentage", 98.98);
		
		List<String> subjects = Arrays.asList("English","Science","Maths");
		map.put("subjects", subjects);
		
		FileWriter fw = new FileWriter("C:\\Users\\User\\eclipse-workspace\\JSONHandling\\Student.json");
		
		objectmapper.writeValue(fw,map);
		System.out.println("data written");
	}

}
