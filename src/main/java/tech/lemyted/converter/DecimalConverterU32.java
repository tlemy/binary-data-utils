package tech.lemyted.converter;

public class DecimalConverterU32 extends Converter
{
	private static final int N_BITS = 32;
	
	/**
	 * Converts 32-bit unsigned integers from binary to decimal.
	 * If the string has more than 32 bits, it will be truncated.
	 * @param str is the binary string to be converted
	 * @return int as result
	 * @throws IllegalArgumentException if str is not valid
	 * */
	public static int convert(String str) 
	{
		if (!isValid(str)) 
		{
			throw new IllegalArgumentException("The input is not a valid binary string");
		}
		
		str = pad(str, N_BITS);
		
		int tot = 0;
		int indexLast = str.length() - 1;
		
		for (int i = indexLast; i >= 0; i--) 
		{
			
			if (str.charAt(i) == '1') 
			{
				tot += Math.pow(2, indexLast - i);
			}
		}
		return tot;
	}
	
	/**
	 * Converts integer from decimal to 32-bit binary.
	 * If the integer is bigger than Integer.MAX_VALUE, it will be truncated.
	 * @param num is the integer to convert
	 * @return String as a result
	 * */
	public static String toBinary(int num) 
	{
		String str = "";
		
		for (int i = N_BITS - 1; i >= 0; i--)
		{
			double sub = Math.pow(2, i);
			
			if (num - sub >= 0) 
			{
				num -= sub;
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
