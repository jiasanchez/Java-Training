package M2_Activity3;

public class Car {
	String brand;
	String model;
	String color;
	int year;
	
	public Car() {
		this.brand = "Unknown";
		this.model = "Unknown";
		this.color = "Unknown";
		this.year = 0;
	}
	
	public Car(String brand, String model, String color, int year) {
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.year = year;
	}
	
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void displayInfo() {
		System.out.println("Car Info:");
		System.out.println("Brand: " + brand);
		System.out.println("Model: " + model);
		System.out.println("Color: " + color);
		System.out.println("Year: " + year);
	}
}
