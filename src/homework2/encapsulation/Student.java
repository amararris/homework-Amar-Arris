package homework2.encapsulation;

public class Student {
	private String name="Amar";
	private String rating;
	
	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		if(rating=="Question1" ||rating=="Question2"||rating=="Question"||rating=="Question4" ) {
		this.rating = rating;}
		else {
	    this.rating = "NR";}
	}
	
		
	

	public void setName(String myName) {
	this.name = myName;
	}
	
	public String getName() {
		return name;

}
}