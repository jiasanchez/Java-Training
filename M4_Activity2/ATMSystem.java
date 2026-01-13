package M4_Activity2;

public class ATMSystem {


	// Array of account balances
    private static double[] accounts = {10000, 15000, 20000};

    public static void processWithdrawal(String accountIndex, String amountInput) {
        try {
            // Parse inputs
            int index = Integer.parseInt(accountIndex);
            double balance = accounts[index];
            double amount = Double.parseDouble(amountInput);

            // Valid withdrawal scenario
            if (amount > balance) {
                System.out.println("Current balance: " + "P" + balance);
                System.out.println("Withdrawal: " + "P" + amount);
                System.out.println("Insufficient funds! Cannot withdraw");
                System.out.println("P" + amount);
            } else if (amount < 0) {
                System.out.println("Error: Invalid input!");
                System.out.println("Please enter valid numbers.");
            } else {
                double newBalance = balance - amount;
                accounts[index] = newBalance;

                System.out.println("Current balance: " + "P" + balance);
                System.out.println("Withdrawal: " + "P" + amount);
                System.out.println("New balance: " + "P" + newBalance);
                System.out.println("Withdrawal successful!");
            }

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input!");
            System.out.println("Please enter valid numbers.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Account not found!");
            System.out.println("Invalid account index.");
        } catch (Exception e) {
            System.out.println("Transaction failed");
        }
    }


}
