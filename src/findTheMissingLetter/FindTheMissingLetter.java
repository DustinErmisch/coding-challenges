package findTheMissingLetter;

/**
 * Find the Missing Letter
 * 
 * Create a function that takes an array of increasing letters and return the
 * missing letter. Examples
 * 
 * missingLetter(["a", "b", "c", "e", "f", "g"]) ➞ "d"
 * 
 * missingLetter(["O", "Q", "R", "S"]) ➞ "P"
 * 
 * missingLetter(["t", "u", "v", "w", "x", "z"]) ➞ "y"
 * 
 * missingLetter(["m", "o"]) ➞ "n"
 * 
 * Notes
 * 
 * Tests will always have exactly one letter missing. The length of the test
 * array will always be at least two. Tests will be in one particular case
 * (upper or lower but never both).
 */

public class FindTheMissingLetter {

	public static void main(String[] args) {
		String[] array1 ={"a", "b", "c", "e", "f", "g"};
		String[] array2 ={"O", "Q", "R", "S"};
		String[] array3 ={"t", "u", "v", "w", "x", "z"};
		String[] array4 ={"m", "o"};
		System.out.println(missingLetter(array1)); // "d"
		System.out.println(missingLetter(array2)); // "P"
		System.out.println(missingLetter(array3)); // "y"
		System.out.println(missingLetter(array4)); // "n"
		//System.out.println(1+array1[0].charAt(0));
		
	}
	public static String missingLetter(String[] array) {
		
		//Elemente durchgehen bis Leange-1 durchgehen, weil in if -> array[i+1]
		for (int i = 0; i < array.length-1; i++) {
			//Wenn der charX im Element i+1 ungleich dem CharX+1 im Element i ist, dann ist die
			//Reihenfolge durchbrochen.
			if(array[i+1].charAt(0) != 1+array[i].charAt(0)) {
				//Wenn das der Fall ist, ist der fehlende Buchstabe, charX+1 im Element i
				//dann wiedergeben sonst, return leer, als char casten, da sonst Zahl
				return ""+ (char)(1+array[i].charAt(0));
				
			}
		}
		
		return "";
	}

}
