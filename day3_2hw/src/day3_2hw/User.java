package day3_2hw;


public class User {
	int id;
	String mail;
	String phoneNumber;
	String name;
	
	public User() {
		
	}
	
	public User(int id, String mail, String phoneNumber, String name) {
		this.id = id;
		this.mail = mail;
		this.phoneNumber = phoneNumber;
		this.name = name;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
