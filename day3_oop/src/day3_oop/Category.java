package day3_oop;

public class Category {

	 private int id;
	 private String name;
	 
	 //----------Constructor--------------
	 public Category() {
		 
	 }
	 
	 public Category(int id, String name) {
		 super();
	     this.id = id;
		 this.name = name;
	 }
	 
	 //----------Getter & Setter ---------------
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		//get ve setin olayı bu. tek yerden hızlı kontrol
		return name + " kategorisi";
	}

	public void setName(String name) {
		this.name = name;
	}
}
