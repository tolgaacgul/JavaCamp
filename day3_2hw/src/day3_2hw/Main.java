package day3_2hw;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Instructor instructor1 = new Instructor();
		instructor1.setName("Engin");
		instructor1.setInstructorIdr(0);
		
		
		Student student1 = new Student();
		student1.setName("Tolga");
		student1.setStudentId(0);
		
		Student student2 = new Student();
		student2.setName("Ayse");
		student2.setStudentId(1);
		
		
		UserManager userManager = new UserManager();
		
//		userManager.add(student1);
//		userManager.add(instructor1);	
			
		//eklemeyi toplu yapalım
		User[] users = {instructor1, student1,student2};
		userManager.addMultiple(users);
		
	}

}
