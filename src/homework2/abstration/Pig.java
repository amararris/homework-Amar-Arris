package homework2.abstration;

public class Pig extends ParkAnimal implements Animal ,OtherAnimal{
	
	public void walk() {
		System.out.println("the pig walk");	
	}
	public void stop() {
		System.out.println("stop");
	}
	public void animalShape() {
		System.out.println("big shape");	
	}

	public void sound() {
		System.out.println("this animal can sound");	
		
	}
	
	public void eat() {
		System.out.println("this animal can eat");
		
	}
	
	public void drink() {
		System.out.println("this animal can drink");	
		
	}


}
