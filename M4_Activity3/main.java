/**
 * 
 */
package M4_Activity3;

/**
 * 
 */
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.out.println("=== ATM Balance Inquiry System ===");

        // Valid Savings account
        System.out.println("--- Test 1: Valid Savings Account ---");
        ATMTransaction.checkBalance("100123456", 15000.00);

        // Valid Checking account
        System.out.println("--- Test 2: Valid Checking Account ---");
        ATMTransaction.checkBalance("200987654", 25000.00);

        // Invalid account format
        System.out.println("--- Test 3: Invalid Account Format ---");
        ATMTransaction.checkBalance("ABC12345", 15000.00);

        // Empty account number
        System.out.println("--- Test 4: Empty Account Number ---");
        ATMTransaction.checkBalance("", 15000.00);

    }

	}


