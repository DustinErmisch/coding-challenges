package largestGap;

/**
 * Largest Gap
 * 
 * Given an array of integers, return the largest gap between the sorted
 * elements of the array.
 * 
 * For example, consider the array:
 * 
 * [9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5]
 * 
 * ... in which, after sorting, the array becomes:
 * 
 * [0, 0, 4, 5, 5, 6, 9, 20, 25, 26, 26]
 * 
 * ... so that we now see that the largest gap in the array is between 9 and 20
 * which is 11. Examples
 * 
 * largestGap([9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5]) ➞ 11 // After sorting: [0,
 * 0, 4, 5, 5, 6, 9, 20, 25, 26, 26] // Largest gap between 9 and 20 is 11
 * 
 * largestGap([14, 13, 7, 1, 4, 12, 3, 7, 7, 12, 11, 5, 7]) ➞ 4 // After
 * sorting: [1, 3, 4, 5, 7, 7, 7, 7, 11, 12, 12, 13, 14] // Largest gap between
 * 7 and 11 is 4
 * 
 * largestGap([13, 3, 8, 5, 5, 2, 13, 6, 14, 2, 11, 4, 10, 8, 1, 9]) ➞ 2 //
 * After sorting: [1, 2, 2, 3, 4, 5, 5, 6, 8, 8, 9, 10, 11, 13, 13, 14] //
 * Largest gap between 6 and 8 is 2
 */
public class LargestGap {

	public static void main(String[] args) {
		int[] array1 = { 9, 4, 26, 26, 0, 0, 5, 20, 6 };
		int[] array2 = { 14, 13, 7, 1, 4, 12, 3, 7, 7, 12, 11, 5, 7 };
		int[] array3 = { 13, 3, 8, 5, 5, 2, 13, 6, 14, 2, 11, 4, 10, 8, 1, 9 };
		int[] array4 = { -3, -2, 10, 11, 14 };
		System.out.println(largestGap(array1));
		System.out.println(largestGap(array2));
		System.out.println(largestGap(array3));
		System.out.println(largestGap(array4));

	}

	public static int largestGap(int[] array) {
		// BubbleSort zum Sortieren Gross nach klein
		array = bubbleSort(array);
		// zuerst den largest Gap auf den kleinsten int Wert speichern, bei 0 wuerden
		// -Zahlen nicht funtionieren
		int largestGap = Integer.MIN_VALUE;

		// System.out.println(Arrays.toString(array));

		// wenn der array i+1 - dem array i >ist als der kleinst int Wert, dann ist das
		// der groesste Abstand
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i + 1] - array[i] > largestGap)
				largestGap = array[i + 1] - array[i];
		}
		// System.out.println(Arrays.toString(ergebnisArray));

		return largestGap;
	}

	// bubbleSort ausgelagert
	public static int[] bubbleSort(int[] array) {

		for (int i = 0; i < array.length - 1; i++) {

			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) {
					int speicher = array[j];
					array[j] = array[j + 1];
					array[j + 1] = speicher;
				}
			}

		}
		return array;
	}
}
