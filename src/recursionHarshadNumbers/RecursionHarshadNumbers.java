package recursionHarshadNumbers;

/**
 * Recursion: Harshad Number
 * 
 * A number is said to be Harshad if it's exactly divisible by the sum of its
 * digits. Create a function that determines whether a number is a Harshad or
 * not. Examples
 * 
 * isHarshad(75) ➞ false // 7 + 5 = 12 // 75 is not exactly divisible by 12
 * 
 * isHarshad(171) ➞ true // 1 + 7 + 1 = 9 // 9 exactly divides 171
 * 
 * isHarshad(481) ➞ true
 * 
 * isHarshad(89) ➞ false
 * 
 * isHarshad(516) ➞ true
 * 
 * isHarshad(200) ➞ true
 * 
 * Notes
 * 
 * You are expected to solve this challenge via recursion. You can check on the
 * Resources tab for more details about recursion in Java. An iterative version
 * of this challenge can be found via this link. A collection of challenges can
 * be found via this link.
 */
public class RecursionHarshadNumbers {

	public static void main(String[] args) {
		System.out.println(isHarshad(75)); // false
		// 7 + 5 = 12
		// 75 is not exactly divisible by 12

		System.out.println(isHarshad(171)); // true
		// 1 + 7 + 1 = 9
		// 9 exactly divides 171

		System.out.println(isHarshad(481)); // true
		System.out.println(isHarshad(89)); // false
		System.out.println(isHarshad(516)); // true
		System.out.println(isHarshad(200)); // true

	}

	public static boolean isHarshad(int zahl) {
		// Wenn die (Parameterzahl/Quersumme der Zahl) % 10 == 0 -> dann keine
		// Nachkommastelle, also teilbar -> return true else false
		if ((zahl / querSumme(zahl, 0)) % 10 == 0) {

			return true;
		}
		return false;
	}

	public static int querSumme(int zahl, int summe) {
		// mod zahl um die erste Stelle zu bekommen
		int zahlMod = zahl % 10;
//		System.out.println("mod" +zahlMod);

		// summe ist die erste Stelle + summe
		summe = summe + zahlMod;
//		System.out.println("sum"+summe);
		// zahl/10 weil erste Stelle wird nicht mehr gebraucht, ist in summe gespeichert
		zahl = zahl / 10;
//		System.out.println("zahl"+zahl);

		// Wenn die zahl/10 == 0, dann besteht die Zahl nur noch aus einer Stelle, dann
		// nur noch
		// die zahl mit der summe addieren und summe return, sonst nochmal durchlaufen
		// um alle Stellen
		// der zahl zu durchlaufen und in summe zu speichern
		if (zahl / 10 == 0) {
			summe = summe + zahl;
			// System.out.println("Ergebnis"+summe);

			return summe;
		} else {

			querSumme(zahl, summe);
		}

		// wenn die zahl noch Stellen hat, dann else Bedingung mit dem return zahl
		return zahl;
	}

}
