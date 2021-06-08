package day3_2hw;

public class InstructorManager extends UserManager {
	@Override
	public void add(User user) {
		System.out.println(user.name + " adlı Eğitmen sisteme eklendi");
	}

}
