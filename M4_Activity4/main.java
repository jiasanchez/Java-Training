/**
 * 
 */
package M4_Activity4;

/**
 * 
 */
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub


        // Test 1: Valid account
        AccountValidator.validateAccountNumber("1234567890");

        // Test 2: Too short
        AccountValidator.validateAccountNumber("123");

        // Test 3: Null
        AccountValidator.validateAccountNumber(null);


	}

}
