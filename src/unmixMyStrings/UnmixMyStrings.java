package unmixMyStrings;

/**
 * Unmix My Strings
 * 
 * lPaeesh le pemu mnxit ehess rtnisg! Oh, sorry, that was supposed to say:
 * Please help me unmix these strings!
 * 
 * Somehow my strings have all become mixed up; every pair of characters has
 * been swapped. Help me undo this so I can understand my strings again.
 * Examples
 * 
 * unmix("123456") ➞ "214365"
 * 
 * unmix("hTsii s aimex dpus rtni.g") ➞ "This is a mixed up string."
 * 
 * unmix("badce") ➞ "abcde"
 * 
 * Notes
 * 
 * The length of a string can be odd — in this case the last character is not
 * altered (as there's nothing to swap it with).
 */
public class UnmixMyStrings {

	public static void main(String[] args) {
		System.out.println(unmix("123456")); // "214365"
		System.out.println();
		System.out.println(unmix("hTsii  s aimex dpus rtni.g")); // "This is a mixed up string."
		System.out.println();
		System.out.println(unmix("badce")); // "abcde"

	}

	public static String unmix(String stringUn) {
		// neuer String in dem die korrekte Reihenfolge gespeichert wird
		String newString = "";

		// String leange-1 durchgehen, weil i bei 0 anfaengt wie immer und i+2 weil
		// jeder zweite Character getauscht weden muss
		for (int i = 0; i < stringUn.length() - 1; i = i + 2) {

			// zuerst wird i+1 also zweiter Character in den String eingefuegt
			newString = newString + stringUn.charAt(i + 1);
			// dann wird i also erster Character in den String eingefuegt. Beides dann mit
			// allen Character Paaren
			newString = newString + stringUn.charAt(i);
			;
			// System.out.println(stringUn.charAt(i));
		}
		// neuen String zurueckgeben
		return newString;
	}

}
