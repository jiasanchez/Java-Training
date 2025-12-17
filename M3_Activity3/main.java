/**
 * 
 */
package M3_Activity3;

/**
 * 
 */
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Map<String, Integer> products = new HashMap<>();
			products.put("Monitor", 12000);
			products.put("Laptop", 50000);
			products.put("Iphone 17", 45000);
			products.put("Mouse", 1000);
			products.put("Keyboard", 1000);
			
			Scanner scanner = new Scanner(System.in);
			int choice;
			
			do {
				System.out.println("==== PRODUCT MENU ====");
				System.out.println("1. Search Product");
				System.out.println("2. Add Product");
				System.out.println("3. Print all Products and Prices");
				System.out.println("4. Find the cheapest Product");
				System.out.println("5. Exit");
				System.out.println("Select Option: ");
				
				choice = scanner.nextInt();
				scanner.nextLine();
				
				switch (choice) {
				
				case 1:					
					System.out.println("Enter product name to search: ");
					String searchProduct = scanner.nextLine();
					if (products.containsKey(searchProduct)) {
						System.out.println("Product found: " + searchProduct + " - Price: " + products.get(searchProduct));
					} else {
						System.out.println("Product not found.");
					}
					break;
				case 2:
					System.out.println("Enter Product name: ");
					String name = scanner.nextLine();
					System.out.println("Enter Product price: ");
					int price = scanner.nextInt();
					
					products.put(name, price);
					System.out.println("Product addedd successfully");
					break;
				case 3:
					System.out.println("Product List:");
					for(Map.Entry<String, Integer> entry : products.entrySet()) {
						System.out.println(entry.getKey() + " : " + entry.getValue());
					}
					break;
				case 4:
					String cheapestProduct = null;
					int cheapestPrice = Integer.MAX_VALUE;
					for(Map.Entry<String, Integer> entry : products.entrySet()) {
						if(entry.getValue() < cheapestPrice) {
							cheapestPrice = entry.getValue();
							cheapestProduct = entry.getKey();
						}
					}
					System.out.println("Cheapest Product: " + cheapestProduct + " - Price: " + cheapestPrice);
					break;
				case 5:
					System.out.println("Exiting program. Thank you!");
					break;
				default:
					System.out.println("Invalid option. Please try again.");
				}
			} while(choice!=5);
			scanner.close();
	}

}
