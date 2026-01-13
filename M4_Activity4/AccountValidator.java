package M4_Activity4;

public class AccountValidator {

    public static void validateAccountNumber(String accountNumber) {
        try {
            // Check if accountNumber is null
            if (accountNumber == null) {
                throw new NullPointerException("Cannot be null");
            }

            // Check if length is not 10
            if (accountNumber.length() != 10) {
                throw new Exception("Must be 10 digits");
            }

            // If valid
            System.out.println("Valid account: " + accountNumber);

        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
