package tech.lemyted.converter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class DecimalConverterS32Test 
{
	@Test
	public void whenStrIsInvalid_convert_throwsIllegalArgumentException()
	{
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
			DecimalConverterS32.convert(null);
		});
		assertEquals("The input is not a valid binary string", exception.getMessage());
	}
	
	@Test
	public void whenStrIsValid_convert_returnsValidAnswer_case1() 
	{
		assertEquals(0, DecimalConverterS32.convert("0"));
	}
	
	@Test
	public void whenStrIsValid_convert_returnsValidAnswer_case2() 
	{
		assertEquals(1, DecimalConverterS32.convert("1"));
	}
	
	@Test
	public void whenStrIsValid_convert_returnsValidAnswer_case3() 
	{
		assertEquals(0, DecimalConverterS32.convert("000"));
	}
	
	@Test
	public void whenStrIsValid_convert_returnsValidAnswer_case4() 
	{
		assertEquals(15, DecimalConverterS32.convert("1111"));
	}
	
	@Test
	public void whenStrIsValid_convert_returnsValidAnswer_case5() 
	{
		assertEquals(7861, DecimalConverterS32.convert("1111010110101"));
	}
	
	@Test
	public void whenStrHasMoreThanBits_convert_returnsValidAnswer() 
	{
		assertEquals(921528955, DecimalConverterS32.convert("000110110111011010110101001111011"));
	}
	
	@Test
	public void whenWhenStrHasNegativeWithtFlag_convert_returnsValidAnswer()
	{
		assertEquals(-1, DecimalConverterS32.convert("11111111111111111111111111111111"));
	}
	
	@Test
	public void whenWhenStrHas33BitsOn_convert_returnsTruncatedAnswer()
	{
		assertEquals(-1, DecimalConverterS32.convert("111111111111111111111111111111111"));
	}
	
	@Test
	public void whenNumIsValid_toBinary_returnsValidAnswer_case1() 
	{
		assertEquals("00000000000000000000000000000000", DecimalConverterS32.toBinary(0));
	}
	
	@Test
	public void whenNumIsValid_toBinary_returnsValidAnswer_case2() 
	{
		assertEquals("00000000000000000000000000000001", DecimalConverterS32.toBinary(1));
	}
	
	@Test
	public void whenNumIsValid_toBinary_returnsValidAnswer_case3() 
	{
		assertEquals("00000000000000000000000000001111", DecimalConverterS32.toBinary(15));
	}
	
	@Test
	public void whenNumIsValid_toBinary_returnsValidAnswer_case5() 
	{
		assertEquals("00000000000000000001111010110101", DecimalConverterS32.toBinary(7861));
	}
	
	@Test
	public void whenNumHasMoreThanBits_toBinary_returnsValidAnswer() 
	{
		assertEquals("00110110111011010110101001111011", DecimalConverterS32.toBinary(921528955));
	}
	
	@Test
	public void whenWhenNumHasNegativeWithtFlag_toBinary_returnsValidAnswer()
	{
		assertEquals("11111111111111111111111111111111", DecimalConverterS32.toBinary(-1));
	}
}
