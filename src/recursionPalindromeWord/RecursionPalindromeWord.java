package recursionPalindromeWord;

/**
 * Recursion: Palindrome Word
 * 
 * Create a recursive function that determines whether a word is a palindrome or
 * not. Examples
 * 
 * isPalindrome("madam") ➞ true
 * 
 * isPalindrome("adieu") ➞ false
 * 
 * isPalindrome("rotor") ➞ true
 * 
 * Notes
 * 
 * All inputs are in lowercase. You are expected to solve this challenge via
 * recursion. You can check on the Resources tab for more details about
 * recursion in Java. If you think recursion is fun, a collection of those
 * challenges can be found in here.
 */
public class RecursionPalindromeWord {

	public static void main(String[] args) {
		System.out.println("madam " + isPalindrome("madam"));// true
		System.out.println("maidoam " + isPalindrome("maidoam"));// false

	}

	public static boolean isPalindrome(String word) {
		int i = 0;
		int j = word.length() - 1;
		return checkChars(word, i, j);
	}

	public static boolean checkChars(String word, int i, int j) {
		// wenn die Bedingung erfuellt ist, return false, da er sonst bis unten
		// durchlaeuft
		if (word.charAt(i) != word.charAt(j)) {
			return false;

		}
		// wenn die Bedingung erfuellt ist, Methode wieder durchlaufen, bis nicht mehr
		// erfuellt
		// dann gibt er den return unten (true) zurueck
		if (word.charAt(i) == word.charAt(j) && i != j) {
			i++;
			j--;
			return checkChars(word, i, j);
		}

		return true;
	}
}
