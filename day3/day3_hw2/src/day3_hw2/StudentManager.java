package day3_hw2;

public class StudentManager extends UserManager{
	@Override
	public void add(User user) {
		System.out.println(user.name + " adlı öğrenci sisteme eklendi");
	}
}
