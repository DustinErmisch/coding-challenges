package aCapitalChallenge;

public class ACapitalChallenge {

	public static void main(String[] args) {
		//ASCI 65 bis 90 Grossbuchstaben
		
		System.out.println(selectLetters("heLLO","GUlp"));//"help"
		System.out.println(selectLetters("1234567","XxXxX"));//"135"
		System.out.println(selectLetters("EVERYTHING","SomeThings"));//EYSomeThings"
		 
	}
	public static String selectLetters(String stringA, String stringB) {
		String word = "";
		int k = 0;
		//der groessere String bestimmt mit seiner Laenge das k
		if(stringA.length()>stringB.length()) {
			k = stringB.length();
		}else {
			k = stringA.length();
		}
		//fuer die leange von k leauft die Schleife
		for (int i = 0; i < k; i++) {
			//wenn der Buchstabe in stringB an Position i gross ist, dann wird der Buchstabe
			//an der Position i von StringA in word eingefuegt
			if(stringB.charAt(i)>=65&&stringB.charAt(i)<=90) {
				word = word+stringA.charAt(i);
			}
		}
		for (int i = 0; i < k; i++) {
			//wenn der Buchstabe in stringA an Position i gross ist, dann wird der Buchstabe
			//an der Position i von StringB in word eingefuegt
			if(stringA.charAt(i)>=65&&stringA.charAt(i)<=90) {
				word = word+stringB.charAt(i);
			}
		}
		return word;
	}

}
