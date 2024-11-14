package tech.lemyted.converter;

public class Converter 
{
	/* Explanation of the REGEX
	 * ^ asserts the start of the string
	 * $ asserts the end of the string
	 * + asserts that the conditions apply to one or more characters in the string
	 * [] contains the conditions
	 * the chracters can only be 0, 1 or whitespace 
	 * */
	private final static String BINARY_FORMAT = "^[01]+$";
	
	/**
	 * Validates if a string is valid binary
	 * 
	 * @param str to be validated
	 * @return boolean true if valid
	 */
	protected static boolean isValid(String str)
	{
		if (str == null) 
		{
			return false;
		}
		return str.matches(BINARY_FORMAT);
	}
}
