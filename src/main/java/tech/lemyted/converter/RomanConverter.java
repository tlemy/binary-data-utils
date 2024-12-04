package tech.lemyted.converter;

import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class RomanConverter 
{
	private static final LinkedHashMap<String, Integer> ROMAN_LETTERS = new LinkedHashMap<>() 
	{
		private static final long serialVersionUID = -4229103615756914943L;
		{
		    put("M", 1000);
		    put("D", 500);
		    put("C", 100);
		    put("L", 50);
		    put("X", 10);
		    put("V", 5);
		    put("I", 1);
		}
	};
	
	private static final ArrayList<String> NON_REPEATABLE_LETTERS = new ArrayList<>(Arrays.asList("D", "L", "V"));
	
	private static final ArrayList<String> SUBSTRACTIVE_LETTERS = new ArrayList<>(Arrays.asList("C", "X", "I"));
	
	/**
	 * Converts integer from decimal to roman numeral.
	 * @param target is the integer to convert
	 * @return String as a result
	 * */
	public static String toRoman(int target) 
	{	
		if (target <= 0)
		{
			throw new IllegalArgumentException("The number cannot be smaller or equall to 0");
		}
		
		if (target >= 4000)
		{
			throw new IllegalArgumentException("The number cannot be bigger or equal to 4000");
		}
		
		int remaining = target % 1000;
		int thousands = target - remaining;
		
		return createRomanString(thousands) + createRomanString(remaining);
	}
	
	/**
	 * Converts string from roman numeral to decimal notation
	 * @param target is string to convert
	 * @return integer as a result
	 * */
	public static int toDecimal(String target) 
	{
		int total = 0;
		
		for (int i = 0; i < target.length(); i++)
		{
			String letter = String.format("%c", target.charAt(i));
			int num = ROMAN_LETTERS.get(letter);
			
			if (i < target.length() - 1) 
			{
				String nextLetter = String.format("%c", target.charAt(i + 1));
				int nextNum = ROMAN_LETTERS.get(nextLetter);
				
				if (num < nextNum) 
				{
					total += nextNum - num;
					i++;
				}
				else 
				{
					total += num;
				}
			}
			else 
			{
				total += num;
			}
		}
		
		return total;
	}
	
	private static String createRomanString(int target) 
	{
		String result = "";
		
		if (target == 0) 
		{
			return result;
		}
		
		for (Entry<String, Integer> entry : ROMAN_LETTERS.entrySet())
		{
			String letter = entry.getKey();
			int number = entry.getValue();
			int n = target / number;
			
			if (n != 0 && n <= 3) 
			{
				Entry<String, Integer> output = rule123(letter, number, n);
				result += output.getKey();
				target -= output.getValue();
			}
			else 
			{
				Entry<String, Integer> output = rule4(letter, number, target);
				result += output.getKey();
				target -= output.getValue();
			}
		}
		
		return result;
	}
	
	private static Entry<String, Integer> rule123(String letter, int number, int n) 
	{
		String key = "";
		int value = 0;
		
		if (!NON_REPEATABLE_LETTERS.contains(letter)) 
		{
			key = letter.repeat(n); // add multiple letters
			value = n * number; // decrement target n times
		}
		else 
		{
			key = letter; // add 1 letters
			value = number; // decrement target 1 time
		}
		
		return Map.entry(key, value);
	}
	
	private static Entry<String, Integer> rule4(String letter, int number, int target) 
	{
		String key = "";
		int value = 0;
		
		for (String subLetter : SUBSTRACTIVE_LETTERS)
		{
			int subNumber = ROMAN_LETTERS.get(subLetter);
			int diff = number - subNumber;
			
			if (subNumber < target && diff <= target && diff > 0)
			{
				key = subLetter + letter; // add the letter combo
				value = number - subNumber; // substract the difference
				break; // can only do one combo at a time
			}
		}
		
		return Map.entry(key, value);
	}
}
