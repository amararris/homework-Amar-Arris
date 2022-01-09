package homework2.encapsulation;

public class TestStudent {

	public static void main(String[] args) {
		Student first  = new Student();
	       first.setName("Amar");
	       first.getName();
	       System.out.println(first.getName());
	       first.setRating("Question");
	       System.out.println(first.getRating());
	}

}
