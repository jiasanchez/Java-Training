package M4_Activity6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BankAccount {

    private static final Logger log = LoggerFactory.getLogger(M4Activity6.class);

    // Initial balance: ₱10,000
    private double balance = 10_000.0;

    public double getBalance() {
        return balance;
    }


    public void withdraw(double amount) throws InvalidAmountException, InsufficientFundsException {
        log.info("Withdrawal requested: ₱{}", amount);

        if (amount < 0) {
            log.error("Invalid withdrawal amount: ₱{}", amount);
            throw new InvalidAmountException("Withdrawal amount must be non-negative.");
        }

        if (amount > balance) {
            log.warn("Insufficient funds for withdrawal. Requested: ₱{}, Available: ₱{}", amount, balance);
            throw new InsufficientFundsException(
                "Insufficient funds for withdrawal.",
                balance,
                amount
            );
        }

        balance -= amount;
        log.info("Withdrawal completed: ₱{}, New balance: ₱{}", amount, balance);
    }


    public void deposit(double amount) throws InvalidAmountException {
        log.info("Deposit requested: ₱{}", amount);

        if (amount <= 0) {
            log.error("Invalid deposit amount: ₱{}", amount);
            throw new InvalidAmountException("Deposit amount must be greater than 0.");
        }

        if (amount > 50_000) {
            log.warn("Large deposit detected: ₱{} (exceeds ₱50,000 threshold). Proceeding.", amount);
        }

        balance += amount;
        log.info("Deposit completed: ₱{}, New balance: ₱{}", amount, balance);
    }

}
