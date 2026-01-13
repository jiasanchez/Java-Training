/**
 * 
 */
package M4_Activity2;

/**
 * 
 */
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub


System.out.println("=== ATM Withdrawal System ===");

        // Valid Withdrawal
        System.out.println("--- Test 1: Valid Withdrawal ---");
        System.out.println("Account=1, Amount=5000");
        ATMSystem.processWithdrawal("1", "5000");

        // Invalid Account Index
        System.out.println("--- Test 2: Invalid Account Index ---");
        System.out.println("Account=abc, Amount=5000");
        ATMSystem.processWithdrawal("abc", "5000");

        //  Account Not Found
        System.out.println("--- Test 3: Account Not Found ---");
        System.out.println("Account=10, Amount=5000");
        ATMSystem.processWithdrawal("10", "5000");

        // Insufficient Funds
        System.out.println("--- Test 4: Insufficient Funds ---");
        System.out.println("Account=1, Amount=20000");
        ATMSystem.processWithdrawal("1", "20000");

        System.out.println("=== All tests completed! ===");
    }

	}


