/**
 * 
 */
package M4_Activity1;

/**
 * 
 */
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("=== Bank Account Name Display ===");
       BankAccount.testCase("ACC-001"); // valid
        BankAccount.testCase("ACC-999"); // invalid → triggers NullPointerException
        System.out.println("=== Program completed successfully! ===");

	}

}
