package countTheNumberOfDuplicateCharacters;

/**
 * Count the Number of Duplicate Characters
 * 
 * Create a function that takes a string and returns the number of alphanumeric
 * characters that occur more than once. Examples
 * 
 * duplicateCount("abcde") ➞ 0
 * 
 * duplicateCount("aabbcde") ➞ 2
 * 
 * duplicateCount("Indivisibilities") ➞ 2
 * 
 * duplicateCount("Aa") ➞ 0 // Case sensitive
 * 
 * Notes
 * 
 * Duplicate characters are case sensitive. The input string will contain only
 * alphanumeric characters.
 */
public class CountTheNumberOfDuplicateCharacters {

	public static void main(String[] args) {
		System.out.println(duplicateCount("abcde"));// 0

		System.out.println(duplicateCount("aabbcde"));// 2

		System.out.println(duplicateCount("Indivisibilities"));// 2

		System.out.println(duplicateCount("Aa"));// 0
		// Case sensitive
		System.out.println(duplicateCount("IdnewwIopqyo"));// 3

	}

	public static int duplicateCount(String word) {
		String word2 = "";
		// jeden Char im word durchgehen
		for (int i = 0; i < word.length(); i++) {

			// den char(i) mit allen anderen chars vergleichen
			for (int j = i + 1; j < word.length(); j++) {
				// Wenn die Chars gleich sind, und noch nicht in word2 vorkommen, dann char in
				// word2 speichern und innere Schleife abrechen
				if (word.charAt(i) == word.charAt(j) && !word2.contains(("" + word.charAt(j)))) {

					word2 = word2 + word.charAt(j);
					break;

				}
			}
		}
		// die Leange des neuen word2 mit den doppelt vorkommenden Buchstaben ist dann
		// deren Anzahl
		return word2.length();
	}

}
