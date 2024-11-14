package tech.lemyted.converter;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ConverterTest
{
	@Test
	public void whenStrIsValidBinary_isValid_returnsTrue_case1() 
	{
		assertTrue(Converter.isValid("0000"));
		
	}
	
	@Test
	public void whenStrIsValidBinary_isValid_returnsTrue_case2() 
	{
		assertTrue(Converter.isValid("1111"));
		
	}
	
	@Test
	public void whenStrIsValidBinary_isValid_returnsTrue_case3() 
	{
		assertTrue(Converter.isValid("1010"));
		
	}
	
	@Test
	public void whenStrIsValidBinary_isValid_returnsTrue_case4() 
	{
		assertTrue(Converter.isValid("101011110000"));
		
	}
	
	@Test
	public void whenStrIsValidBinary_isValid_returnsTrue_case5() 
	{
		assertTrue(Converter.isValid("0011111110000"));
		
	}
	
	@Test
	public void whenStrIsInvalidBinary_isValid_returnsFalse_caseWithLetters() 
	{
		assertFalse(Converter.isValid("aaaa"));
		
	}
	
	@Test
	public void whenStrIsInvalidBinary_isValid_returnsFalse_caseWithHyphen() 
	{
		assertFalse(Converter.isValid("1111-1111"));
		
	}
	
	@Test
	public void whenStrIsInvalidBinary_isValid_returnsFalse_caseWithOtherDigits() 
	{
		assertFalse(Converter.isValid("2222"));
		
	}
	
	@Test
	public void whenStrIsInvalidBinary_isValid_returnsFalse_caseWithNewLine() 
	{
		assertFalse(Converter.isValid("1111/n"));
		
	}
	
	@Test
	public void whenStrIsInvalidBinary_isValid_returnsFalse_caseWithEmpty() 
	{
		assertFalse(Converter.isValid(""));
		
	}
	
	@Test
	public void whenStrIsInvalidBinary_isValid_returnsFalse_caseWithNul() 
	{
		assertFalse(Converter.isValid(null));
		
	}
	
	@Test
	public void whenStrHasNoSpaces_removeSpaces_strIsTheSame() 
	{
		
	}
}
