package tech.lemyted.converter;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DecimalConverterU32Test 
{
	@Test(expected = IllegalArgumentException.class)
	public void whenStrIsInvalid_convert_throwsIllegalArgumentException() 
	{
		DecimalConverterU32.convert(null);
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
	public void whenStrHasMoreThanBits_convert_returnsValidAnswer() 
	{
		assertEquals(921528955, DecimalConverterU32.convert("000110110111011010110101001111011"));
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
}
