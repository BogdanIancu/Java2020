package ro.ase.acs.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import ro.ase.acs.classes.Car;
import ro.ase.acs.classes.Vehicle;
import ro.ase.acs.interfaces.Taxable;

public class Main {

	public static void main(String[] args) {
		Car car = new Car("Dacia", 90, "black", 1400);
		System.out.println(car);
		
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
				e.printStackTrace();
			}
		}
		Integer x = 5;
		int y = x;
		System.out.println(y);
		
		List<Integer> list = new ArrayList<>();
		list.add(4);
		list.add(5);
		list.add(6);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		list.remove(2);
		list.add(1, 3);
		System.out.println();
		for(Integer i : list) {
			System.out.println(i);
		}
		
		list.set(0, 9);
		System.out.println();
		
		for(Iterator<Integer> it = list.iterator(); it.hasNext(); ) {
			System.out.println(it.next());
		}
	}

}
