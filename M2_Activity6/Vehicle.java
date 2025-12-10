package M2_Activity6;

public abstract class Vehicle {

		private String brand;
		private Integer numberOfWheels;
		
		public Vehicle() {
			
		}

		
		abstract void startEngine();
		
		public void Destroy() {
			System.out.println("Destroying " + this.getBrand());
		}


		public String getBrand() {
			return brand;
		}


		public void setBrand(String brand) {
			this.brand = brand;
		}


		public Integer getNumberOfWheels() {
			return numberOfWheels;
		}


		public void setNumberOfWheels(Integer numberOfWheels) {
			this.numberOfWheels = numberOfWheels;
		}
}
