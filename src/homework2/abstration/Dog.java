package homework2.abstration;

public class Dog extends ParkAnimal implements Animal, OtherAnimal{

	public void walk() {
		System.out.println("dog walk");	
	}

	public void stop() {
		System.out.println("stop tired");
		
	}

	public void animalShape() {
	
		System.out.println("small shape");
	}

		
	public void eat() {
		System.out.println("this animal can eat");	
		
	}
	public void sound() {
		System.out.println("this animal can sound");
	}

	public void drink() {
		System.out.println("this animal can drink");	
		
		
	}

}