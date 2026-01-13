package M4_Activity1;

public class BankAccount {

	public static String getAccountName(String accountNumber) {

		if ("ACC-001".equals(accountNumber)) {
            return "Juan Dela Cruz";
        } else if ("ACC-002".equals(accountNumber)) {
            return "Maria Santos";
        } else {
            return null;
        }
		
	}

	public static void testCase(String accountNumber) {
        System.out.println("Looking up account: " + accountNumber);
        try {
            String name = getAccountName(accountNumber);
            String upper = name.toUpperCase(); 
            System.out.println("Account holder: " + upper);
        } catch (NullPointerException ex) {
            System.out.println("Error: Account not found!");
        }
        System.out.println(); 
    }

}

