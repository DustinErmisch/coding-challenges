package almostPalindrome;

public class AlmostPalindrome {

	public static void main(String[] args) {
		System.out.println(almostPalindrome("abcdcbg"));// true
		// transformed to "abcdcba" by changing "g" to "a"
		System.out.println(almostPalindrome("abccia"));// true
		// transformed to "abccba" by changing "i" to "b"
		System.out.println(almostPalindrome("abcdaaa"));// false
		// can't be transformed in one turn
		System.out.println(almostPalindrome("1234321"));// false
		// is allready a Palindrome#
		System.out.println(almostPalindrome("122233221"));// true

	}

	public static boolean almostPalindrome(String word) {
		
		int a = 0;
		//Schleife bis zu Haelfte des Wortes durchgehen
		for (int i = 0; i != (word.length() - 1) / 2; i++) {
			//Wenn der Buchstabe i und der letzte Buchstabe minus i nicht gleich sind a++
			if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
				//System.out.println(word.charAt(i));
				//System.out.println(word.charAt(word.length() - 1 - i));
				a++;
			}
		}
		//wenn a == 1 dann war nur ein Buchstabe nicht gleich return true sonst false
		if (a == 1) {
			return true;
		}
		return false;
	}

}
