package homework2.abstration;

public class Test3 {

	public static void main(String[] args) {
		Pig tamworth = new Pig();
		tamworth.animalShape();
		tamworth.drink();
		tamworth.sleep();
		tamworth.sound();
		tamworth.stop();
		tamworth.walk();
		
		Dog bulldog = new Dog();
		bulldog.animalShape();
		bulldog.drink();
		bulldog.eat();
		bulldog.sleep();
		bulldog.stop();
		bulldog.sound();
		 
	 Animal dobermann = new Dog ();
	 dobermann.stop();
	 dobermann.animalShape();
	 dobermann.walk();

	
	 
	OtherAnimal danish = new Pig();
	 danish.drink();
	 danish.eat();
	
	}


	}


