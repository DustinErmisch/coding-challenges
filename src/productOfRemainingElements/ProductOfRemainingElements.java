package productOfRemainingElements;

public class ProductOfRemainingElements {

	public static void main(String[] args) {

		int[] array1 = { 2, 8, 4, 1 };
		System.out.println(canPartition(array1));// true
		// 8 = 2 * 4 * 1

		int[] array2 = { -1, -10, 1, -2, 20 };
		System.out.println(canPartition(array2));// false

		int[] array3 = { -1, -20, 5, -1, -2, 2 };
		System.out.println(canPartition(array3));// true
		
		int[] array4 = { -1, -20, 6, -1, -2, 2 };
		System.out.println(canPartition(array4));// false

	}

	public static boolean canPartition(int[] array) {
		int zahlGross = 0;
		int zahlKlein = 0;
		int summe = 1;

		for (int i = 0; i < array.length - 1; i++) {
			// Groesste Zahl rausfinden und speichern
			if (array[i + 1] > array[i] && array[i + 1] > zahlGross) {
				zahlGross = array[i + 1];
			}
			// kleinste Zahl rausfinden und speichern
			if (array[i + 1] < array[i] && array[i + 1] < zahlKlein) {
				zahlKlein = array[i + 1];
			}
		}
		// Wenn die zahlGross kleiner ist als die zahlKlein als positiver Wert
		// dann ist zahlGross = die zahlKlein
		if (zahlGross < zahlKlein * -1) {
			zahlGross = zahlKlein;
		}

		// Wenn die Elemente nicht == zahlGross ist, dann die summer der Elemente bilden
		for (int i = 0; i < array.length; i++) {
			if (array[i] != zahlGross) {
				summe = summe * array[i];
			}
		}
		// wenn die summe == der Zahl gross ist, dann return true, else false
		if (summe == zahlGross) {
			return true;
		}
//		System.out.println("Groß: "+zahlGross);
//		System.out.println("Klein: "+zahlKlein);
		return false;
	}

}
