package M4_Activity3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ATMTransaction {
    public static void checkBalance(String accountNumber, double balance) {
        try {
            System.out.println("Processing balance inquiry...");

            // Validate account number format
            Integer.parseInt(accountNumber);

            // Get account type from first character
            char accountType = accountNumber.charAt(0);

            // Determine account type name
            if (accountType == '1') {
                System.out.println("Account Type: Savings");
            } else if (accountType == '2') {
                System.out.println("Account Type: Checking");
            } else {
                System.out.println("Account Type: Unknown");
            }

            // Print account details
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Current Balance: " + balance);
            System.out.println("Balance inquiry successful!");

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid account number format!");
            System.out.println("Account numbers must be numeric.");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: Account number is empty or invalid!");
        } finally {
            System.out.println("\n========== RECEIPT ==========");
            System.out.println("Transaction Date: December 3, 2025");
            System.out.println("Transaction Type: Balance Inquiry");
            System.out.println("ATM Location: Main Branch");
            System.out.println("Thank you for banking with us!");
            System.out.println("==============================\n");
        }
    }
}
