package isTheInputFactorialOfAnInteger;

/**
 * Is the Input Factorial of an Integer?
 * 
 * Create a function that checks if a given integer is exactly the factorial of
 * an integer or not. true if it is, false otherwise. Examples
 * 
 * isFactorial(2) ➞ true // 2 = 2 * 1 = 2!
 * 
 * isFactorial(27) ➞ false
 * 
 * isFactorial(24) ➞ true // 24 = 4 * 3 * 2 * 1 = 4!
 * 
 * Notes
 * 
 * No error handling is necessary. Inputs are all positive integers.
 * Alternatively, you can solve this with a recursive approach.
 */

public class IsTheInputFactorialOfAnInteger {

	public static void main(String[] args) {
		System.out.println(isFactorial(120)); // true
		// mit Rekursion
		System.out.println(isFactorialRecursion(120)); // true

	}

	public static boolean isFactorial(int zahl) {

		boolean ergebnis = false;
		// Array mit der laenge des Parameters zahl
		int[] array = null;
		array = new int[zahl];
		// j und zahl1 bei 1 starten
		int j = zahl / zahl;
		int zahl1 = zahl / zahl;

		// array befuellen mit Parameter zahl jeweils -1 im Element
		for (int i = 0; i < array.length; i++) {
			array[i] = j;
			j++;
			// System.out.println("j: "+j);
		}

		// System.out.println("array laenge: " +array.length);

		// zahl1 wird mit dem Element i multipliziert bis zahl1 gleich dem Parameter
		// zahl ist
		for (int i = 0; i < zahl; i++) {
			// System.out.println("i: "+i);
			zahl1 = zahl1 * array[i];
			if (zahl1 == zahl) {
				ergebnis = true;
				break;
			}

		}

		// System.out.println(Arrays.toString(array));
		// System.out.println(zahl1);
		return ergebnis;
	}

	public static boolean isFactorialRecursion(int zahl) {
		boolean ergebnis = false;
		// Array mit der laenge des Parameters zahl
		int[] array = null;
		array = new int[zahl];
		// i und j bei 1 starten
		int i = 0;
		int j = 1;
		int zahl1 = zahl / zahl;

		// array befuellen mit Parameter zahl jeweils -1 im Element
		array = fillArray(zahl, array, i, j);

		// zahl1 wird mit dem Element i multipliziert solange zahl1 kleiner dem
		// Parameter
		// zahl ist
		zahl1 = multiplyElements(zahl, zahl1, array, i);
		if (zahl1 == zahl) {
			ergebnis = true;

		}
		return ergebnis;
	}

	public static int[] fillArray(int zahl, int[] array, int i, int j) {

		if (j <= zahl) {
			array[i] = j;
			i++;
			j++;
			fillArray(zahl, array, i, j);
		}
		return array;
	}

	public static int multiplyElements(int zahl, int zahl1, int[] array, int i) {
		// zahl1 wird mit dem Element i multipliziert solange zahl1 kleiner dem
		// Parameter
		// zahl ist
		if (zahl1 < zahl) {
			zahl1 = zahl1 * array[i];
			i++;
			zahl1 = multiplyElements(zahl, zahl1, array, i);
		}
		return zahl1;
	}
}
