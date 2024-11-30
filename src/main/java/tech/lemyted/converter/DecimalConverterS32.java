package tech.lemyted.converter;

public class DecimalConverterS32 extends Converter
{
	private static final int N_BITS = 32;
	
	private static final long MAX_VALUE = (long) (Math.pow(2, N_BITS) - 1);
	
	/**
	 * Converts 32-bit signed integers from binary to decimal.
	 * If the string has more than 32 bits, it will be truncated.
	 * @param str is the binary string to be converted
	 * @return int as result
	 * @throws IllegalArgumentException if str is not valid
	 * */
	public static long toDecimal(String str)
	{	
		if (!isValid(str)) 
		{
			throw new IllegalArgumentException("The input is not a valid binary string");
		}
		
		str = padLeft(str, N_BITS);
		str = str.substring(str.length() - N_BITS, str.length());
		
		String negativeWeight = String.valueOf(str.charAt(0));
		String positiveWeight = str.substring(1);
		long neg = DecimalConverterU32.toDecimal(padRight(negativeWeight, N_BITS));
		long pos = DecimalConverterU32.toDecimal(padLeft(positiveWeight, N_BITS));
		
		return pos - neg;
	}
	
	/**
	 * Converts integer from decimal to signed 32-bit binary.
	 * TODO If the integer is bigger than Long.MAX_VALUE, it will be truncated.
	 * @param num is the integer to convert
	 * @return String as a result
	 * */
	public static String toBinary(long num) 
	{
		if (num >= 0) 
		{
			return DecimalConverterU32.toBinary(num);
		}
		
		num += (long) (Math.pow(2, N_BITS - 1));
		String result = DecimalConverterU32.toBinary(num);
		result = result.replaceFirst("0", "1");
		
		return result;
	}
}

