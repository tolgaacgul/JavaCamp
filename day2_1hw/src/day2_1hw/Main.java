package day2_1hw;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person1 = new Person();
		person1.name = "tolgaacgul";
		
		Comment comment1 = new Comment();
		comment1.comment ="Beni GitHubdan Takip etmeyi unutmayın: @tolgaacgul şimdiden teşekkürler";
		
		
		CommentManager commentManager = new CommentManager();
		commentManager.addComment(person1, comment1);
	}

}
