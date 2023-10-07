package findTheOddInteger;
//import java.util.Arrays;

/**
 * Find the Odd Integer
 * 
 * Create a function that takes an array and finds the integer which appears an
 * odd number of times. Examples
 * 
 * findOdd([1, 1, 2, -2, 5, 2, 4, 4, -1, -2, 5]) ➞ -1
 * 
 * findOdd([20, 1, 1, 2, 2, 3, 3, 5, 5, 4, 20, 4, 5]) ➞ 5
 * 
 * findOdd([10]) ➞ 10
 * 
 * Notes
 * 
 * There will always only be one integer that appears an odd number of times.
 */
public class FindTheOddInteger {

	public static void main(String[] args) {
		int[] array1 = { 1, 1, 2, -2, 5, 2, 4, 4, -1, -2, 5 };// -1
		int[] array2 = { 20, 1, 1, 2, 2, 3, 3, 5, 5, 4, 20, 4, 5 };// 5
		int[] array3 = { 10 };// 10
		int[] array4 = { 1, 5, 6, 1, 6, 5, 6, 3, 3, 6, 6 };// 6

		System.out.println(findOdd(array1));
		System.out.println(findOdd(array2));
		System.out.println(findOdd(array3));
		System.out.println(findOdd(array4));

	}

	public static int findOdd(int[] array) {
		int number = 0;
		for (int i = 0; i < array.length; i++) {
			// System.out.println("i:"+array[i]);
			for (int j = i + 1; j < array.length; j++) {
				// System.out.println("j:"+array[j]);
				if (array[i] == array[j]) {
					array[i] = Integer.MIN_VALUE;
					array[j] = Integer.MIN_VALUE;
				}
			}
			// System.out.println(Arrays.toString(array));
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] != Integer.MIN_VALUE) {
				number = array[i];
			}
		}

		return number;
	}
}