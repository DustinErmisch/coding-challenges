package sevenBoom;

/**
 * Create a function that takes an array of numbers and return "Boom" if the
 * digit 7 appears in the Array. Otherwise return "There is no 7 in the array".
 * Examples: sevenBoom([1,2,3,4,5,6,7]) = Boom sevenBoom([8,6,33,100]) = There
 * is no 7 in the array sevenBoom([2,55,60,97,86]) = Boom -> because 97 contains
 * the 7
 * 
 * @param args
 */

public class SevenBoom {

	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3, 4, 5, 6, 7 };
		int[] array2 = { 8, 6, 33, 100 };
		int[] array3 = { 2, 55, 60, 97, 86 };
		int[] array4 = { 13713 };

		// Methode1 wandelt in String um, daher nicht so performant
		System.out.println("Methode1:");
		System.out.println(sevenBoom(array1));
		System.out.println(sevenBoom(array2));
		System.out.println(sevenBoom(array3));
		System.out.println(sevenBoom(array4));
		System.out.println("-------------------------------------------------");

		// Methode2 rechnet nur mit zahlen, daher performanter
		System.out.println("Methode2:");
		System.out.println(sevenBoom2(array1));
		System.out.println(sevenBoom2(array2));
		System.out.println(sevenBoom2(array3));
		System.out.println(sevenBoom2(array4));

	}

	public static String sevenBoom(int[] array) {
		String sevenBoom = "";
		// for Schleife um jedes Element zu ueberpruefen
		for (int i = 0; i < array.length; i++) {

			int zahl = array[i];
			// Ergebnis String ob die Funktion findSevenInString die 7 gefunden hat oder
			// nicht, diese gibt boolean zurueck
			if (findSevenInString(zahl)) {
				sevenBoom = "Boom";
				break;
			} else {
				sevenBoom = "There is no 7 in the array";
			}
		}
		return sevenBoom;
	}

	public static boolean findSevenInString(int zahl) {
		// zuerst ist die 7 nicht gefunden also false
		boolean seven = false;
		// Jedes Element des Arrays wird als String gespeichert
		String zahlAsString = Integer.toString(zahl);
		// jeder char des Strings (also eines Array-Element) wird ueberprueft
		for (int j = 0; j < zahlAsString.length(); j++) {
			// wenn die 7 vorkommt dann wird die Schleife verlassen (break) und true
			// zurueckgegeben
			if (zahlAsString.charAt(j) == '7') {
				seven = true;
				break;
			}
		}
		return seven;
	}

	public static String sevenBoom2(int[] array) {
		String sevenBoom = "";
		double zahlDouble = 0;
		long zahlLong = 1;
		int zahlModulo = 0;

		// for Schleife um jedes Element zu ueberpruefen
		for (int i = 0; i < array.length; i++) {
			zahlDouble = array[i];
			// muss fuer jedes Element wieder auf 0 gesetzt werden, da die Schleifen
			// bewirken, dass die zahlLong irgendwann 0 ist
			zahlLong = 1;

			// While-Schleife laeuft solange die 7 nicht gefunden ist, und die zahlLong
			// nicht 0 ist
			while (zahlLong != 7 && zahlLong != 0 && zahlModulo != 7) {
				zahlLong = (long) zahlDouble / 10;
				zahlModulo = (int) zahlDouble % 10;
				zahlDouble = zahlDouble / 10;

				// Um zu verstehen einfach diese Ausgaben auskommentieren ;)
//				System.out.println("double " + zahlDouble);
//				System.out.println("Moudulo " + zahlModulo);
//				System.out.println("Long " + zahlLong);

			}
			// Ergebnis String ob die 7 gefunden oder nicht
			if (zahlLong == 7 || zahlDouble == 7 || zahlModulo == 7) {
				sevenBoom = "Boom";
			} else {
				sevenBoom = "There is no 7 in the array";
			}
		}
		return sevenBoom;
	}
}
