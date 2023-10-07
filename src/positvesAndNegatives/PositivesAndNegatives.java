package positvesAndNegatives;

/**
 * Positives and Negatives
 * 
 * Create a function which validates whether a given array alternates between
 * positive and negative numbers. Examples
 * 
 * alternateSign([3, -2, 5, -5, 2, -8]) ➞ true
 * 
 * alternateSign([-6, 1, -1, 4, -3]) ➞ true
 * 
 * alternateSign([4, 4, -2, 3, -6, 10]) ➞ false
 * 
 * Notes
 * 
 * Lists can be of any length. It doesn't matter if an array begins/ends with a
 * positive or negative, as long as it alternates. If a list contains 0, return
 * false (as it is neither positive nor negative).
 */
public class PositivesAndNegatives {

	public static void main(String[] args) {
		int[] array1 = { 3, -2, 5, -5, 2, -8 };
		System.out.println(alternateSign(array1)); // true
		int[] array2 = { -6, 1, -1, 4, -3 };
		System.out.println(alternateSign(array2)); // true
		int[] array3 = { 4, 4, -2, 3, -6, 19 };
		System.out.println(alternateSign(array3)); // false
		int[] array4 = { 4, -4, 2, -3, 6, 19 };
		System.out.println(alternateSign(array4)); // false
	}

	public static boolean alternateSign(int[] array) {
		boolean ergebnis = false;
		// Array durchgehen
		for (int i = 0; i < array.length - 1; i++) {
			// negative und positive Zahlen muessen sich abwechseln, dann true, sons false
			if (array[i + 1] > 0 && array[i] < 0 || array[i + 1] < 0 && array[i] > 0) {
				ergebnis = true;
			} else {
				ergebnis = false;
				break;
			}
		}
		return ergebnis;
	}

}
