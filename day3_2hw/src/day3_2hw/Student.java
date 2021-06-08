package day3_2hw;

public class Student extends User{
	int studentId;
	String[] lessonsLearned;
	
	public Student() {
		
	}
	
	public Student(int studentId, String[] lessonsLearned) {
		super();
		this.studentId = studentId;
		this.lessonsLearned = lessonsLearned;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String[] getLessonsLearned() {
		return lessonsLearned;
	}

	public void setLessonsLearned(String[] lessonsLearned) {
		this.lessonsLearned = lessonsLearned;
	}
}
