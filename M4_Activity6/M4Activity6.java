package M4_Activity6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class M4Activity6 {

private static final Logger log = LoggerFactory.getLogger(M4Activity6.class);

    /**
     * Helper method to run a BankTestOperation and log exceptions.
     */
    public static void runTest(BankTestOperation operation, String operationName) {
       
        try {
            operation.execute();
        } catch (InvalidAmountException e) {
            log.error("InvalidAmountException during {}: {}", operationName, e.getMessage(), e);
        } catch (InsufficientFundsException e) {
            log.error(
                "InsufficientFundsException during {}: {} (requested ₱{}, balance ₱{})",
                operationName, e.getMessage(), e.getRequestedAmount(), e.getBalance(), e
            );
        } 
        }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount account = new BankAccount();

        // Test 1
        runTest(() -> account.deposit(5_000), "Deposit");

        // Test 2
        runTest(() -> account.withdraw(3_000), "Withdrawal");

        // Test 3
        runTest(() -> account.deposit(-500), "Deposit");

        // Test 4
        runTest(() -> account.withdraw(20_000), "Withdrawal");

        // Test 5
        runTest(() -> account.deposit(60_000), "Deposit");

        log.info("Final balance: ₱{}", account.getBalance());

	}

}
