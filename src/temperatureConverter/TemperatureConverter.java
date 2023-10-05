package temperatureConverter;

import java.util.Arrays;

/**
 * Temperature Converter
 * 
 * Create a function that converts Celsius to Fahrenheit and vice versa.
 * Examples
 * 
 * convert("35*C") ➞ "95*F"
 * 
 * convert("19*F") ➞ "-7*C"
 * 
 * convert("33") ➞ "Error"
 * 
 * Notes
 * 
 * Round to the nearest integer. If the input is incorrect, return "Error". For
 * the formulae to convert back and forth, check the Resources tab.
 */

public class TemperatureConverter {

	public static void main(String[] args) {
		System.out.println(convert("35*C"));//"95*F"
		//System.out.println(convert("19*F"));//"-7*C"
		//System.out.println(convert("33"));//"Error"
	}
	public static String convert(String temp) {
		int number = 0;
		String[] tempAr= null;
		tempAr = new String [temp.length()];
		for (int i = 0; i < temp.length(); i++) {
			tempAr[i] = ""+temp.charAt(i);
		}
		System.out.println(Arrays.toString(tempAr));
		
		
		return "";
	}

}
