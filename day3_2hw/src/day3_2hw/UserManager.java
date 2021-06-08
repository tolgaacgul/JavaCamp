package day3_2hw;

public class UserManager {
	public void add(User user) {
		System.out.println(user.name + " adlı kullanıcı sisteme eklendi");
	}
	
	public void addMultiple(User[] users) {
		for(User user : users) {
			add(user);
		}
	}
}
