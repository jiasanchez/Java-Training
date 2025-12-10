package M2_Activity6;

public class Truck extends Vehicle implements Refuelable{

	public Truck() {
		this.setBrand("Volvo");
		this.setNumberOfWheels(12);
	}
	
	@Override
	public void startEngine() {
		System.out.println("Engine started " + getBrand() + " has " + getNumberOfWheels() + " Wheels");
	}
	
	@Override
	public void refuel() {
		System.out.println("Refueling: " + getBrand());
	}
}
