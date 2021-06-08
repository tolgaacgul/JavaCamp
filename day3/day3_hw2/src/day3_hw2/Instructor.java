package day3_hw2;

public class Instructor extends User{
	int instructorId;
	String[] publishedLectures;
	
	public Instructor() {
		
	}
	
	public Instructor(int instructorId, String[] publishedLectures) {
		super();
		this.instructorId = instructorId;
		this.publishedLectures = publishedLectures;
	}

	public int getInstructorId() {
		return instructorId;
	}

	public void setInstructorIdr(int instructorId) {
		this.instructorId = instructorId;
	}

	public String[] getPublishedLectures() {
		return publishedLectures;
	}

	public void setPublishedLectures(String[] publishedLectures) {
		this.publishedLectures = publishedLectures;
	}
	
}
