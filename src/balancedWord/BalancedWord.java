package balancedWord;



public class BalancedWord {

	public static void main(String[] args) {

		System.out.println(balanced("zips"));// true
		System.out.println(balanced("brake"));// false
		System.out.println(balanced("asdTdsa")); //true
		System.out.println(balanced("as")); //false
		System.out.println(balanced("aa")); //true

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
		
		//Wenn Buchstabenanzahl ungerade, dann den mittleren Buchstaben auslassen also +1
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
