package homework2.inheritance;

public class Test1 {

	public static void main(String[] args) {
		// PassengerVehicle to Car single inheritance.
				//Vehicle to PassengerVehicle to Car is multi level inheritance
				//
				
				 
				PassengerVehicle toyota = new PassengerVehicle();
				    toyota.passengerseats();
				    toyota.doors();
				    
				Car bmw = new Car();
				    bmw.passengerseats();
				    bmw.doors();
		            bmw.start();
		            
		       Vehicle hyundai = new Vehicle();
		            hyundai.start();
		            hyundai.brake();
		            hyundai.wheels();
		            
		       Van gmc = new Van();
		           gmc.brake();
		           gmc.brake();
		          
		            
			}
			

		
	}


