package Map;

import java.util.Objects;

public class Student {

	private String name;
	private int id;
	
	public Student(String name, int id) {
		this.setName(name);
		this.setId(id);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	 @Override
	    public boolean equals(Object obj) {
	        if (this == obj) {
	            return true;
	        }
	        if (obj == null || getClass() != obj.getClass()) {
	            return false;
	        }
	        Student other = (Student) obj;
	        return id == other.id && Objects.equals(name, other.name);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(name, id);
	    }
}
