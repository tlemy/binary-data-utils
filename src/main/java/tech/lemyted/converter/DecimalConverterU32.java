package tech.lemyted.converter;

public class DecimalConverterU32 extends Converter
{
	private static final int N_BITS = 32;
	
	/**
	 * Converts 32-bit unsigned integers from binary to decimal.
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
		
		long tot = 0;
		int indexFirst = target.length() - N_BITS;
		int indexLast = target.length() - 1;
		
		for (int i = indexLast; i >= indexFirst; i--) 
		{
			if (target.charAt(i) == '1') 
			{
				tot += Math.pow(2, indexLast - i);
			}
		}
		return tot;
	}
	
	/**
	 * Converts integer from decimal to unsigned 32-bit binary.
	 * If the integer is bigger than Long.MAX_VALUE, it will be truncated.
	 * @param target is the integer to convert
	 * @return String as a result
	 * */
	public static String toBinary(long target) 
	{
		String str = "";
		
		for (int i = N_BITS - 1; i >= 0; i--)
		{
			double sub = Math.pow(2, i);
			
			if (target - sub >= 0) 
			{
				target -= sub;
				str += "1";
			}
			else 
			{
				str += "0";
			}
		}
		return str;
	}
}
