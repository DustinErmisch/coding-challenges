package balancedWord;

/**
 * Balanced Words
 * 
 * We can assign a value to each character in a word, based on their position in
 * the alphabet (a = 1, b = 2, ... , z = 26). A balanced word is one where the
 * sum of values on the left-hand side of the word equals the sum of values on
 * the right-hand side. For odd length words, the middle character (balance
 * point) is ignored.
 * 
 * Write a function that returns true if the word is balanced, and false if it's
 * not. Examples
 * 
 * balanced("zips") ➞ true // "zips" = "zi|ps" = 26+9|16+19 = 35|35 = true
 * 
 * balanced("brake") ➞ false // "brake" = "br|ke" = 2+18|11+5 = 20|16 = false
 * 
 * Notes
 * 
 * All words will be lowercase, and have a minimum of 2 characters. Palindromic
 * words will always be balanced.
 */
public class BalancedWord {

	public static void main(String[] args) {

		System.out.println(balanced("zips"));// true
		System.out.println(balanced("brake"));// false
		System.out.println(balanced("asdTdsa")); // true
		System.out.println(balanced("as")); // false
		System.out.println(balanced("aa")); // true

		// System.out.println(balanced("brakend"));//false
	}

	public static boolean balanced(String word) {
		int a = 0;
		int j = word.length() / 2;
		int summe1 = 0;
		int summe2 = 0;
		word = word.toLowerCase();

		// erste Haelfte des Wortes
		for (int i = 0; i < word.length() / 2; i++) {
			// -96 weil A in Acsi 97 ist
			a = word.charAt(i) - 96;
			summe1 = summe1 + a;
		}
		// System.out.println(summe1);

		// Wenn Buchstabenanzahl ungerade, dann den mittleren Buchstaben auslassen also
		// +1
		if (word.length() % 2 == 1) {
			j = (word.length() / 2) + 1;
		}

		// zweiter Haelfte des Wortes ohne den ungeraden mittleren Buchstaben
		for (int i = j; i < word.length(); i++) {

			// -96 weil A in Acsi 97 ist
			a = word.charAt(i) - 96;

			summe2 = summe2 + a;
		}
		// System.out.println(summe2);
		if (summe1 == summe2) {
			return true;
		}
		return false;

	}

}
