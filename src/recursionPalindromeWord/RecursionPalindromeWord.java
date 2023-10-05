package recursionPalindromeWord;

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
		//wenn die Bedingung erfuellt ist, return false, da er sonst bis unten durchlaeuft
		if(word.charAt(i) != word.charAt(j)) {
			return false;
			
		}
		//wenn die Bedingung erfuellt ist, Methode wieder durchlaufen, bis nicht mehr erfuellt
		//dann gibt er den return unten (true) zurueck
		if (word.charAt(i) == word.charAt(j) && i != j) {
			i++;
			j--;
			return checkChars(word, i, j);
		}

		return true;
	}
}
