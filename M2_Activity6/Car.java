package M2_Activity6;

public class Car extends Vehicle implements Refuelable{
	
	public Car() {
		this.setBrand("Mitsubishi");
		this.setNumberOfWheels(4);
			
	}
	
	@Override
	public void startEngine() {
		System.out.println("Engine started " + this.getBrand() + " has " + this.getNumberOfWheels() + " Wheels");
		
	}
	
	@Override
	public void refuel() {
		System.out.println("Refueling: " + this.getBrand());
	}
}
