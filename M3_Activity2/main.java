/**
 * 
 */
package M3_Activity2;

import java.util.HashSet;
import java.util.Scanner;

/**
 * 
 */
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> products = new HashSet<>();
		products.add("Laptop");
		products.add("Mouse");
		products.add("Keyboard");
		products.add("Monitor");
		products.add("Charger");
		
		Scanner scanner = new Scanner(System.in);
		int choice;
		
		do { 
				System.out.println("\n---- Product Menu ----");
				System.out.println("1. Search a product");
				System.out.println("2. Add a product");
				System.out.println("3. Print all products and count");
				System.out.println("4. Exit");
				
				choice = scanner.nextInt();
				scanner.nextLine();
				switch (choice) {
				case 1:
						System.out.println("Enter Product name to search: ");
						String searchProduct = scanner.nextLine();
						boolean found = false;
					
						for (String product : products) {
							if(product.equalsIgnoreCase(searchProduct)) {
								found = true;
								break;
								}
				
							}
						if (found) {
							System.out.println("Product Found: " + searchProduct);					
						} else {
							System.out.println("Product not found");
						}
					break;
				case 2:
						System.out.println("Enter product name to add: ");
						String newProduct = scanner.nextLine();
						boolean exists = false;
						
						for (String product : products) {
							if(product.equalsIgnoreCase(newProduct)) {
								exists = true;
								break;
							}
						}
						if (!exists) {
							products.add(newProduct);
							System.out.println("Product added successfully.");
						} else {
							System.out.println("Product already exists.");
						}
					break;
				case 3:
						System.out.println("\n Product List: ");
						for (String product : products) {
						System.out.println(product);
						}
						System.out.println("Total number of Products: " + products.size());
					break;
				case 4:
						System.out.println("Exiting program...");
					break;
				default:
						System.out.println("Invalid Choice. Please try again.");
					}
				} while(choice !=4);
		
		scanner.close();
		} 
	}

