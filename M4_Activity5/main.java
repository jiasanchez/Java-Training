package M4_Activity5;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountValidator validator = new AccountValidator();

		//Test FIVE cases using testValidation helper
		        validator.testValidation("Valid (10 digits)", "1234567890");
		        validator.testValidation("Too short", "123");
		        validator.testValidation("Contains letters", "12345ABC90");
		        validator.testValidation("Contains space", "1234 567890");
		        validator.testValidation("Null value", null);

	}

}
