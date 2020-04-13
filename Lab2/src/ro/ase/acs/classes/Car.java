package ro.ase.acs.classes;

public class Car {
	private String producer;
	private float price;
	private FuelType fuelType;
	private int[] distances;
	
	public Car() {
		producer = "";
		price = 4000;
		fuelType = FuelType.gas;
		distances = new int[1];
		distances[0] = 100;
	}
	
	public Car(String producer, float price) {
		this.producer = producer;
		this.price = price;
		fuelType = FuelType.gas;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public FuelType getFuelType() {
		return fuelType;
	}

	public void setFuelType(FuelType fuelType) {
		this.fuelType = fuelType;
	}

	public String getProducer() {
		return producer;
	}
	
	public void setProducer(String producer) {
		this.producer = producer;
	}

	public int[] getDistances() {
		if(distances != null) {
			int[] copy = new int[distances.length];
			System.arraycopy(distances, 0, copy, 0, distances.length);
			return copy;
		}
		else {
			return null;
		}
	}

	public void setDistances(int[] distances) {
		if(distances != null) {
			this.distances = new int[distances.length];
			for(int i = 0; i < distances.length; i++) {
				this.distances[i] = distances[i];
			}
		}
	}

	@Override
	public Object clone() {
		Car copy = new Car();
		copy.producer = producer;
		copy.price = price;
		copy.fuelType = fuelType;
		copy.distances = getDistances();
		return copy;
	}
}
