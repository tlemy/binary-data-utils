package tech.lemyted.converter;

public class DecimalConverterS32 extends Converter
{
	private static final int N_BITS = 32;
	
	public static long convert(String str)
	{	
		if (!isValid(str)) 
		{
			throw new IllegalArgumentException("The input is not a valid binary string");
		}
		
		str = padLeft(str, N_BITS);
		str = str.substring(str.length() - N_BITS, str.length());
		
		String negativeWeight = String.valueOf(str.charAt(0));
		String positiveWeight = str.substring(1);
		long neg = DecimalConverterU32.convert(padRight(negativeWeight, N_BITS));
		long pos = DecimalConverterU32.convert(padLeft(positiveWeight, N_BITS));
		
		return pos - neg;
	}
	
	public static String toBinary(long num) 
	{
		String result = "";
		
		if (num < 0) 
		{
			result += "1";
			num -= Math.pow(2, N_BITS - 1);
		}
		else 
		{
			return DecimalConverterU32.toBinary(num);
		}
		
		for (int i = N_BITS - 2; i >= 0; i--)
		{
			long toAdd = (long) Math.pow(2, i);
			long rem = num + toAdd;
			
			if (rem <= 0) 
			{
				result += "1";
				num = rem;
			}
			else 
			{
				result += "0";
			}
		}
		
		return result;
	}
}

