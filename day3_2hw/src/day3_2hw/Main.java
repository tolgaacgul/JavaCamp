package day3_2hw;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Instructor instructor1 = new Instructor();
		instructor1.setName("Engin");
		
		Student student1 = new Student();
		student1.setName("Tolga");
		
		
		UserManager userManager = new UserManager();
		
		userManager.add(student1);
		userManager.add(instructor1);
		
		
//		
//		//eklemeyi toplu yapalım
//		User[] users = {instructor1, student1};
//		userManager.addMultiple(users);
//		
	}

}
