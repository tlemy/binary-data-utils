package tech.lemyted.converter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RomanConverterTest 
{
	@Test
	void whenNum0_toRoman_returnsRomanNum0() 
	{
		assertThrows(IllegalArgumentException.class, () -> RomanConverter.toRoman(0));
	}
	
	@Test
	void whenNum1_toRoman_returnsRomanNum1() 
	{
		assertEquals("I", RomanConverter.toRoman(1));
	}
	
	@Test
	void whenNum3_toRoman_returnsRomanNum3() 
	{
		assertEquals("III", RomanConverter.toRoman(3));
	}
	
	@Test
	void whenNum4_toRoman_returnsRomanNum4()
	{
		assertEquals("IV", RomanConverter.toRoman(4));
	}
	
	@Test
	void whenNum5_toRoman_returnsRomanNum5() 
	{
	    assertEquals("V", RomanConverter.toRoman(5));
	}

	@Test
	void whenNum9_toRoman_returnsRomanNum9() 
	{
	    assertEquals("IX", RomanConverter.toRoman(9));
	}

	@Test
	void whenNum10_toRoman_returnsRomanNum10() 
	{
	    assertEquals("X", RomanConverter.toRoman(10));
	}

	@Test
	void whenNum14_toRoman_returnsRomanNum14() 
	{
	    assertEquals("XIV", RomanConverter.toRoman(14));
	}

	@Test
	void whenNum40_toRoman_returnsRomanNum40() 
	{
	    assertEquals("XL", RomanConverter.toRoman(40));
	}

	@Test
	void whenNum50_toRoman_returnsRomanNum50() 
	{
	    assertEquals("L", RomanConverter.toRoman(50));
	}

	@Test
	void whenNum90_toRoman_returnsRomanNum90() 
	{
	    assertEquals("XC", RomanConverter.toRoman(90));
	}

	@Test
	void whenNum100_toRoman_returnsRomanNum100() 
	{
	    assertEquals("C", RomanConverter.toRoman(100));
	}

	@Test
	void whenNum400_toRoman_returnsRomanNum400() 
	{
	    assertEquals("CD", RomanConverter.toRoman(400));
	}

	@Test
	void whenNum500_toRoman_returnsRomanNum500() 
	{
	    assertEquals("D", RomanConverter.toRoman(500));
	}

	@Test
	void whenNum900_toRoman_returnsRomanNum900() 
	{
	    assertEquals("CM", RomanConverter.toRoman(900));
	}
	
	@Test
	void whenNum999_toRoman_returnsRomanNum999() 
	{
	    assertEquals("CMXCIX", RomanConverter.toRoman(999));
	}

	@Test
	void whenNum1000_toRoman_returnsRomanNum1000() 
	{
	    assertEquals("M", RomanConverter.toRoman(1000));
	}
	
	@Test
	void whenNum2999_toRoman_returnsRomanNum2999() 
	{
	    assertEquals("MMCMXCIX", RomanConverter.toRoman(2999));
	}
	
	@Test
	void whenNum3243_toRoman_returnsRomanNum3243() 
	{
	    assertEquals("MMMCCXLIII", RomanConverter.toRoman(3243));
	}

	@Test
	void whenNum3999_toRoman_returnsRomanNum3999() 
	{
	    assertEquals("MMMCMXCIX", RomanConverter.toRoman(3999));
	}

	@Test
	void whenNum4000_toRoman_throwsIllegalArgumentException() 
	{
	    assertThrows(IllegalArgumentException.class, () -> RomanConverter.toRoman(4000));
	}
	
	@Test
	void whenRomanNum1_toDecimal_returnsNum1() 
	{
		assertEquals(1, RomanConverter.toDecimal("I"));
	}
	
	@Test
	void whenRomanNum3_toDecimal_returnsNum3() 
	{
		assertEquals(3, RomanConverter.toDecimal("III"));
	}
	
	@Test
	void whenRomanNum4_toDecimal_returnsNum4()
	{
		assertEquals(4, RomanConverter.toDecimal("IV"));
	}
	
	@Test
	void whenRomanNum5_toDecimal_returnsNum5() 
	{
	    assertEquals(5, RomanConverter.toDecimal("V"));
	}

	@Test
	void whenRomanNum9_toDecimal_returnsNum9() 
	{
	    assertEquals(9, RomanConverter.toDecimal("IX"));
	}

	@Test
	void whenRomanNum10_toDecimal_returnsNum10() 
	{
	    assertEquals(10, RomanConverter.toDecimal("X"));
	}

	@Test
	void whenRomanNum14_toDecimal_returnsNum14() 
	{
	    assertEquals(14, RomanConverter.toDecimal("XIV"));
	}

	@Test
	void whenRomanNum40_toDecimal_returnsNum40() 
	{
	    assertEquals(40, RomanConverter.toDecimal("XL"));
	}

	@Test
	void whenRomanNum50_toDecimal_returnsNum50() 
	{
	    assertEquals(50, RomanConverter.toDecimal("L"));
	}

	@Test
	void whenRomanNum90_toDecimal_returnsNum90() 
	{
	    assertEquals(90, RomanConverter.toDecimal("XC"));
	}

	@Test
	void whenRomanNum100_toDecimal_returnsNum100() 
	{
	    assertEquals(100, RomanConverter.toDecimal("C"));
	}

	@Test
	void whenRomanNum400_toDecimal_returnsNum400() 
	{
	    assertEquals(400, RomanConverter.toDecimal("CD"));
	}

	@Test
	void whenRomanNum500_toDecimal_returnsNum500() 
	{
	    assertEquals(500, RomanConverter.toDecimal("D"));
	}

	@Test
	void whenRomanNum900_toDecimal_returnsNum900() 
	{
	    assertEquals(900, RomanConverter.toDecimal("CM"));
	}
	
	@Test
	void whenRomanNum999_toDecimal_returnsNum999() 
	{
	    assertEquals(999, RomanConverter.toDecimal("CMXCIX"));
	}

	@Test
	void whenRomanNum1000_toDecimal_returnsNum1000() 
	{
	    assertEquals(1000, RomanConverter.toDecimal("M"));
	}
	
	@Test
	void whenRomanNum2999_toDecimal_returnsNum2999() 
	{
	    assertEquals(2999, RomanConverter.toDecimal("MMCMXCIX"));
	}
	
	@Test
	void whenRomanNum3243_toDecimal_returnsNum3243() 
	{
	    assertEquals(3243, RomanConverter.toDecimal("MMMCCXLIII"));
	}

	@Test
	void whenRomanNum3999_toDecimal_returnsNum3999() 
	{
	    assertEquals(3999, RomanConverter.toDecimal("MMMCMXCIX"));
	}
}
