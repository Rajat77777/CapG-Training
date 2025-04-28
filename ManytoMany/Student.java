package ManytoMany;

public class Student {

	 private String studentName;
	    private String email;
	    private Subject[] subjects;
	    private int subjectCount;

	    public Student(String studentName, String email, int maxSubjects) {
	        this.studentName = studentName;
	        this.email = email;
	        this.subjects = new Subject[maxSubjects];
	        this.subjectCount = 0;
	    }

	    public String getStudentName() {
	        return studentName;
	    }

	    public void setStudentName(String studentName) {
	        this.studentName = studentName;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public Subject[] getSubjects() {
	        Subject[] result = new Subject[subjectCount];
	        System.arraycopy(subjects, 0, result, 0, subjectCount);
	        return result;
	    }

	    public void addSubject(Subject subject) {
	        if (subjectCount < subjects.length ) {
	            subjects[subjectCount++] = subject;
	        }
	    }

	    public void removeSubject(Subject subject) {
	        for (int i = 0; i < subjectCount; i++) {
	            if (subjects[i] == subject) {
	                for (int j = i; j < subjectCount - 1; j++) {
	                    subjects[j] = subjects[j + 1];
	                }
	                subjects[subjectCount - 1] = null;
	                subjectCount--;
	                return;
	            }
	        }
	    }}
