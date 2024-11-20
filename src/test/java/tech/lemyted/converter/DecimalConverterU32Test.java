package tech.lemyted.converter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class DecimalConverterU32Test 
{
	@Test
	public void whenStrIsInvalid_convert_throwsIllegalArgumentException_case1() 
	{
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
			DecimalConverterU32.convert(null);
		});
		assertEquals("The input is not a valid binary string", exception.getMessage());
	}
	
	@Test
	public void whenStrIsInvalid_convert_throwsIllegalArgumentException_case2()
	{
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
			DecimalConverterU32.convert("");
		});
		assertEquals("The input is not a valid binary string", exception.getMessage());
	}
	
	@Test
	public void whenStrIsValid_convert_returnsValidAnswer_case1() 
	{
		assertEquals(0, DecimalConverterU32.convert("0"));
	}
	
	@Test
	public void whenStrIsValid_convert_returnsValidAnswer_case2() 
	{
		assertEquals(1, DecimalConverterU32.convert("1"));
	}
	
	@Test
	public void whenStrIsValid_convert_returnsValidAnswer_case3() 
	{
		assertEquals(0, DecimalConverterU32.convert("000"));
	}
	
	@Test
	public void whenStrIsValid_convert_returnsValidAnswer_case4() 
	{
		assertEquals(15, DecimalConverterU32.convert("1111"));
	}
	
	@Test
	public void whenStrIsValid_convert_returnsValidAnswer_case5() 
	{
		assertEquals(7861, DecimalConverterU32.convert("1111010110101"));
	}
	
	@Test
	public void whenStrHasMoreThan32Bits_convert_returnsValidAnswer() 
	{
		assertEquals(921528955, DecimalConverterU32.convert("000110110111011010110101001111011"));
	}
	
	@Test
	public void whenStrHasMostSignificantBitOn_convert_returnsValidAnswer() 
	{
		assertEquals(Integer.MAX_VALUE, DecimalConverterU32.convert("10000000000000000000000000000001"));
	}
	
	@Test
	public void whenIntIsValid_toBinary_returnsCorrectString_case1()
	{
		assertEquals("00000000000000000000000000000000", DecimalConverterU32.toBinary(0));
	}
	
	@Test
	public void whenIntIsValid_toBinary_returnsCorrectString_case2()
	{
		assertEquals("00000000000000000000000000000001", DecimalConverterU32.toBinary(1));
	}
	
	@Test
	public void whenIntIsValid_toBinary_returnsCorrectString_case3()
	{
		assertEquals("00000000000000000000000000001111", DecimalConverterU32.toBinary(15));
	}
	
	@Test
	public void whenIntIsValid_toBinary_returnsCorrectString_case4()
	{
		assertEquals("00000000000000000001111010110101", DecimalConverterU32.toBinary(7861));
	}
	
	@Test
	public void whenIntIsValid_toBinary_returnsCorrectString_case5()
	{
		assertEquals("00110110111011010110101001111011", DecimalConverterU32.toBinary(921528955));
	}
	
	@Test
	public void whenIntIsMax_toBinary_returnsCorrectString()
	{
		assertEquals("01111111111111111111111111111111", DecimalConverterU32.toBinary(Integer.MAX_VALUE));
	}
	
	@Test
	public void whenIntIsTooBig_toBinary_returnsTruncatedAnswer()
	{
		assertEquals("00000000000000000000000000000000", DecimalConverterU32.toBinary(Integer.MAX_VALUE + 1));
	}
}
