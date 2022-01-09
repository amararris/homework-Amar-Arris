package homework2.polymorphism;

public class Population {
	 
	public void average(double a, double b) {
		double avg =(a+b)/2;
		System.out.println(avg);
	}
	//overloading
	public void average (double a, double b, double c) {
		double avg = (a+b+c)/3;
		System.out.println(avg);
		
	}
}
