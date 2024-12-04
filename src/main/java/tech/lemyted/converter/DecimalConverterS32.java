package tech.lemyted.converter;

public class DecimalConverterS32 extends Converter
{
	private static final int N_BITS = 32;
	
	static final long MAX_VALUE = (long) (Math.pow(2, N_BITS) - 1);
	
	/**
	 * Converts 32-bit signed integers from binary to decimal.
	 * If the string has more than 32 bits, it will be truncated.
	 * @param target is the binary string to be converted
	 * @return int as result
	 * @throws IllegalArgumentException if str is not valid
	 * */
	public static long toDecimal(String target)
	{	
		if (!isValid(target)) 
		{
			throw new IllegalArgumentException("The input is not a valid binary string");
		}
		
		target = padLeft(target, N_BITS);
		target = target.substring(target.length() - N_BITS, target.length());
		
		String negativeWeight = String.valueOf(target.charAt(0));
		String positiveWeight = target.substring(1);
		long neg = DecimalConverterU32.toDecimal(padRight(negativeWeight, N_BITS));
		long pos = DecimalConverterU32.toDecimal(padLeft(positiveWeight, N_BITS));
		
		return pos - neg;
	}
	
	/**
	 * Converts integer from decimal to signed 32-bit binary.
	 * If the integer is bigger than Long.MAX_VALUE, it will be truncated.
	 * @param target is the integer to convert
	 * @return String as a result
	 * */
	public static String toBinary(long target) 
	{
		if (target > MAX_VALUE) 
		{
			String msg = String.format("The number provided is bigger than %d", MAX_VALUE);
			throw new IllegalArgumentException(msg);
		}
		
		if (target >= 0) 
		{
			return DecimalConverterU32.toBinary(target);
		}
		
		target += (long) (Math.pow(2, N_BITS - 1));
		String result = DecimalConverterU32.toBinary(target);
		result = result.replaceFirst("0", "1");
		
		return result;
	}
}

