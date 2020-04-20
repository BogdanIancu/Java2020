package ro.ase.acs.main;

import ro.ase.acs.classes.Car;
import ro.ase.acs.classes.Vehicle;
import ro.ase.acs.interfaces.Taxable;

public class Main {

	public static void main(String[] args) {
		Car car = new Car("Dacia", 90, "black", 1400);
		System.out.println(car.getName());
		
		Taxable t = car;
		double tax = t.computeTax();
		System.out.println(tax);
		
		Vehicle v = new Car();
		v.move();
		
		if(car instanceof Cloneable) {
			Car c2;
			try {
				c2 = (Car)car.clone();
				c2.setCapacity(1900);
				System.out.println(car.getCapacity());
			} catch (CloneNotSupportedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
