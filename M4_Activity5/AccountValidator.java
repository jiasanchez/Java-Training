package M4_Activity5;

public class AccountValidator {

public void validateAccountNumber(String accountNumber) throws InvalidAccountNumberException {
        // 1) Null check
        if (accountNumber == null) {
            throw new NullPointerException("Account number cannot be null");
        }

        // 2) Format check (only digits)
        for (char c : accountNumber.toCharArray()) {
            if (!Character.isDigit(c)) {
                throw new InvalidAccountFormatException("Account number must contain only digits");
            }
        }

        // 3) Length check (must be exactly 10 digits)
        if (accountNumber.length() != 10) {
            throw new InvalidAccountNumberException("Account number must be exactly 10 digits");
        }

        // 4) If valid
        System.out.println("Valid account number: " + accountNumber);
    }

  
    public void testValidation(String testName, String accountNumber) {
        System.out.println("=== Test: " + testName + " ===");
        try {
            validateAccountNumber(accountNumber);
        } catch (InvalidAccountNumberException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InvalidAccountFormatException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println(); 
    }

}
