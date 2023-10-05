package reverseTheOddLengthWords;



public class ReverseTheOddLengthWords {

	public static void main(String[] args) {
		System.out.println(reverseOdd("Bananas"));// "sananaB"
		System.out.println();
		System.out.println(reverseOdd("One two three four"));// "enO owt eerht four"
		System.out.println();
		System.out.println(reverseOdd("Make sure uoy only esrever sdrow of ddo length"));
		// "Make sure you only reverse words of odd lenght"
	}

	public static String reverseOdd(String stringRe) {
		int charInt = 32;
		int wordInt = 1;
		int j = 0;
		String wordString;
		String wordString2 = "";
	
		String[] words = null;
		// Anzahl der woerter auslesen
		for (int i = 0; i < stringRe.length() - 1; i++) {
			charInt = stringRe.charAt(i);
			// leerzeichen = Asci 32
			if (charInt == 32) {
				wordInt++;
			}

		}
		// Array String mit der Anzahl der woerter
		words = new String[wordInt];
		// Array String null entfernen
		for (int i = 0; i < wordInt; i++) {
			words[i] = "";
		}
		// Array String die Woerter einfuegen
		for (int i = 0; i < stringRe.length(); i++) {
			charInt = stringRe.charAt(i);
			if (charInt != 32) {
				words[j] = words[j] + stringRe.charAt(i);
			} else {
				j++;
			}
		}
		
		for (int i = 0; i < words.length ; i++) {
			//einzelne Woerte aus dem String array words lesen
			wordString = words[i];
			
			//Wenn das Wort ungerade ist, das Wort Rueckwerts schreiben in wordSrting2
			if (wordString.length() % 2 != 0) {
				for (int k = wordString.length() - 1; k >= 0; k--) {
					wordString2 = wordString2 + wordString.charAt(k);
					//System.out.println(wordString2);
					
					//das Rueckwerts geschriebene Wort in words[i] schreiben
					words[i] = wordString2;

				}
			} else {
				//Wenn gerade ist kann das Wort so bleiben
				words[i] = wordString;

			}
			//die Rueckwerts geschriebenen Woerter wieder leer machen, damit beim naechsten Durchlauf wieder verwendbar
			wordString2 = "";

		}
		//urspruenglichen ParameterString auf leer setzen
		stringRe = "";
		//urspruenglichen ParameterString mit den neuen Woerten fuellen
		for (int i = 0; i < words.length; i++) {
			stringRe = stringRe + words[i] +" "; 
		}

		//System.out.println(Arrays.toString(words));

		return stringRe;
	}

}
