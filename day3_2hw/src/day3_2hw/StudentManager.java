package day3_2hw;

public class StudentManager extends UserManager{
	@Override
	public void add(User user) {
		System.out.println(user.name + " adlı öğrenci sisteme eklendi");
	}
}
