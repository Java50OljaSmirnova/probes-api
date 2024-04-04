package telran.probes.messages;

public interface ValidationErrorMessages {
	String MISSING_SENSOR_ID =  "missing sensor id value";
	String MISSING_EMAILS =  "missing email adresses for sensor";
	String MISSING_RANGE =  "missing range values for sensor";
	String MISSING_MIN_VALUE =  "missing min value in range";
	String MISSING_MAX_VALUE =  "missing max value in range";
	String MISSING_PASSWORD = "missing account password";
	int MIN_CHARACTERS_SIZE_PASSWORD = 8;
	String ACCOUNT_PASSWORD_WRONG_LENGTH = "Length of account password cannot be less than " + MIN_CHARACTERS_SIZE_PASSWORD + " characters";

}
