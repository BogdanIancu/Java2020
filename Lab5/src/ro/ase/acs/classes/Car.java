package ro.ase.acs.classes;

import ro.ase.acs.interfaces.Taxable;

public final class Car extends Vehicle implements Taxable, Comparable<Car> {
	private String color;
	private int capacity;
	
	public Car() {
		super();
		color = "black";
		capacity = 50;
	}
	
	public Car(String name, int speed, String color, int capacity) {
		super(name, speed);
		this.color = color;
		this.capacity = capacity;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Car copy = (Car)super.clone();
		copy.color = color;
		copy.capacity = capacity;
		return copy;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Car [color=");
		builder.append(color);
		builder.append(", capacity=");
		builder.append(capacity);
		builder.append(", name=");
		builder.append(getName());
		builder.append(", speed=");
		builder.append(getSpeed());
		builder.append("]");
		return builder.toString();
	}

	@Override
	public float computeTax() {
		float tax = 0;
		if(capacity < 2000) {
			tax = (float)capacity / 1000 * 50;
		}
		else {
			tax = (float)capacity / 1000 * 100;
		}
		return (tax > MIN_TAX) ? tax : MIN_TAX;
	}

	@Override
	public final void move() {
		System.out.println("The car is moving with " + getSpeed() + 
				" km/h");
	}

	@Override
	public int compareTo(Car o) {
		if(capacity < o.capacity) {
			return -1;
		}
		else if(capacity == o.capacity) {
			return 0;
		}
		else {
			return 1;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Car) {
			Car o = (Car)obj;
			return getName().equals(o.getName()) && getSpeed() == o.getSpeed() &&
				color.equals(o.color) && capacity == o.capacity;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return 31* (getName().hashCode() + getSpeed()) * color.hashCode() + capacity;
	}
}
