package tech.lemyted.converter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RomanConverterTest 
{
	@Test
	void whenNum0_convert_returnsRomanNum0() 
	{
		assertThrows(IllegalArgumentException.class, () -> RomanConverter.toRoman(0));
	}
	
	@Test
	void whenNum1_convert_returnsRomanNum1() 
	{
		assertEquals("I", RomanConverter.toRoman(1));
	}
	
	@Test
	void whenNum3_convert_returnsRomanNum3() 
	{
		assertEquals("III", RomanConverter.toRoman(3));
	}
	
	@Test
	void whenNum4_convert_returnsRomanNum4()
	{
		assertEquals("IV", RomanConverter.toRoman(4));
	}
	
	@Test
	void whenNum5_convert_returnsRomanNum5() 
	{
	    assertEquals("V", RomanConverter.toRoman(5));
	}

	@Test
	void whenNum9_convert_returnsRomanNum9() 
	{
	    assertEquals("IX", RomanConverter.toRoman(9));
	}

	@Test
	void whenNum10_convert_returnsRomanNum10() 
	{
	    assertEquals("X", RomanConverter.toRoman(10));
	}

	@Test
	void whenNum14_convert_returnsRomanNum14() 
	{
	    assertEquals("XIV", RomanConverter.toRoman(14));
	}

	@Test
	void whenNum40_convert_returnsRomanNum40() 
	{
	    assertEquals("XL", RomanConverter.toRoman(40));
	}

	@Test
	void whenNum50_convert_returnsRomanNum50() 
	{
	    assertEquals("L", RomanConverter.toRoman(50));
	}

	@Test
	void whenNum90_convert_returnsRomanNum90() 
	{
	    assertEquals("XC", RomanConverter.toRoman(90));
	}

	@Test
	void whenNum100_convert_returnsRomanNum100() 
	{
	    assertEquals("C", RomanConverter.toRoman(100));
	}

	@Test
	void whenNum400_convert_returnsRomanNum400() 
	{
	    assertEquals("CD", RomanConverter.toRoman(400));
	}

	@Test
	void whenNum500_convert_returnsRomanNum500() 
	{
	    assertEquals("D", RomanConverter.toRoman(500));
	}

	@Test
	void whenNum900_convert_returnsRomanNum900() 
	{
	    assertEquals("CM", RomanConverter.toRoman(900));
	}
	
	@Test
	void whenNum999_convert_returnsRomanNum999() 
	{
	    assertEquals("CMXCIX", RomanConverter.toRoman(999));
	}

	@Test
	void whenNum1000_convert_returnsRomanNum1000() 
	{
	    assertEquals("M", RomanConverter.toRoman(1000));
	}
	
	@Test
	void whenNum2999_convert_returnsRomanNum2999() 
	{
	    assertEquals("MMCMXCIX", RomanConverter.toRoman(2999));
	}
	
	@Test
	void whenNum3243_convert_returnsRomanNum3243() 
	{
	    assertEquals("MMMCCXLIII", RomanConverter.toRoman(3243));
	}

	@Test
	void whenNum3999_convert_returnsRomanNum3999() 
	{
	    assertEquals("MMMCMXCIX", RomanConverter.toRoman(3999));
	}

	@Test
	void whenNum4000_convert_throwsIllegalArgumentException() 
	{
	    assertThrows(IllegalArgumentException.class, () -> RomanConverter.toRoman(4000));
	}
}
