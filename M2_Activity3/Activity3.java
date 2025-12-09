/**1
 * 
 */
package M2_Activity3;

/**
 * 
 */
public class Activity3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		car1.setBrand("Porsche");
		car1.setModel("Cayenne");
		car1.setColor("Matte Black");
		car1.setYear(2025);
		
		Car car2 = new Car("Lamborghini","Aventador","Red",2018);
		car1.displayInfo();
		car2.displayInfo();
		
	}

}
