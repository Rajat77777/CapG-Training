package Objects;

import java.util.Objects;
public class Student {
    private int id;
    private String name;
    private double percentage;

    public Student(int id, String name, double percentage) {
        this.id = id;
        this.name = name;
        this.percentage = percentage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", percentage=" + percentage +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
       
        Student student = (Student) obj;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,name,percentage);
    }

  
}
