package persistentLittleBugger;
//import java.util.Arrays;
/**
 * Persistent Little Bugger
 * 
 * Create a function that takes a number and returns its multiplicative
 * persistence, which is the number of times you must multiply the digits in num
 * until you reach a single digit. Examples
 * 
 * bugger(39) ➞ 3 // Because 3 * 9 = 27, 2 * 7 = 14, 1 * 4 = 4 and 4 has only
 * one digit.
 * 
 * bugger(999) ➞ 4 // Because 9 * 9 * 9 = 729, 7 * 2 * 9 = 126, 1 * 2 * 6 = 12,
 * and finally 1 * 2 = 2.
 * 
 * bugger(4) ➞ 0 // Because 4 is already a one-digit number.
 * 
 * Notes
 * 
 * N/A
 */
public class PersistenLittleBugger {

	public static void main(String[] args) {
		System.out.println(bugger(39)); // 3
		// Because 3 * 9 = 27, 2 * 7 = 14, 1 * 4 = 4 and 4 has only one digit.

		System.out.println(bugger(999)); // 4
		// Because 9 * 9 * 9 = 729, 7 * 2 * 9 = 126, 1 * 2 * 6 = 12, and finally 1 * 2 =
		// 2.

		System.out.println(bugger(4)); // 0
		// Because 4 is already a one-digit number.

	}

	public static int bugger(int zahl) {
		// bei nur einer Stelle return 0
		if (zahl < 11) {
			zahl = 0;
		} else {
			// zahl wird bekommt anzahl der rekursionsdurchleaufe
			zahl = bugger2(zahl, 0);
		}

		return zahl;
	}

	public static int bugger2(int zahl, int j) {
		int k = 1;
		int zahl2 = zahl;
		int[] array = null;
		// herausbekommen wieviele Stellen die zahl hat
		while (zahl2 / 10 != 0) {
			zahl2 = zahl2 / 10;
			k++;
		}
		// und array mit Stellenanzahl erstellen
		array = new int[k];
		// Array befuellen
		for (int i = array.length - 1; i >= 0; i--) {

			if (zahl % 10 != 0) {
				array[i] = zahl % 10;
				zahl = zahl / 10;
			}
		}
		// Zahl ist im Array, Zahl auf 1 fuer multiplikation aller elemente
		zahl = 1;
		// multiplikation
		for (int i = 0; i < array.length; i++) {
			zahl = zahl * array[i];

		}
		// System.out.println("zahl"+zahl);

		// methode einmal durchgelaufen dann j++
		j++;

		// System.out.println("j"+j);

		// wenn die zahl noch groesser ist als 9, also mehr als eine Stelle dann
		// rekursion
		if (zahl > 9) {
			// j wird dadurch aktualisiert und spiegelt die Anzahl der Rekursionsdurchleaufe
			// wieder
			j = bugger2(zahl, j);

		}
		// anzahl der durchleaufe return
		return j;
	}

}
