package sortByLenght;

/**
 * Sort by Length
 * 
 * Create a function that takes a string and returns a string ordered by the
 * length of the words. From shortest to longest word. If there are words with
 * the same amount of letters, order them alphabetically. Examples
 * 
 * sortByLength("Hello my friend") ➞ "my Hello friend"
 * 
 * sortByLength("Have a wonderful day") ➞ "a day Have wonderful"
 * 
 * sortByLenght("My son loves pineapples") ➞ "My son loves pineapples"
 * 
 * Notes
 * 
 * Punctuation (periods, commas, etc) belongs to the word in front of it.
 */

public class SortByLenght {

	public static void main(String[] args) {
		sortByLenght("Hello my Friend");
		sortByLenght("Have a wonderful day");
		sortByLenght("My son loves pineapples");
		sortByLenght("be an is as he driss");
		sortByLenght("Test as an and or klon me Klaro");

	}

	public static void sortByLenght(String words) {
		System.out.println("Aus: " + words);
		int j = 0;
		// mit ("") initialisieren, da sonst null
		String ergebnis = "";

		// Anzahl der Woerter ermitteln bei Leerzeichen (' ') j++
		for (int i = 0; i < words.length(); i++) {
			if (words.charAt(i) == ' ') {
				j++;
			}
		}
		// Neuen String Array, mit (j+1) da z.b. 3 Leerzeichen = 4 Woerter, mit ("")
		// initialisieren da sonst null
		String[] wordArray = new String[j + 1];
		for (int i = 0; i < wordArray.length; i++) {
			wordArray[i] = "";
		}
		// j wird nicht mehr gebraucht, kann wieder als Zaehler verwendet werden
		j = 0;

		// wenn nicht Leerzeichen, dann wird jeder Buchstabe ins Element geschrieben,
		// wenn Leerzeichen dann neues Element (j++)
		for (int i = 0; i < words.length(); i++) {
			if (words.charAt(i) != ' ') {
				wordArray[j] = wordArray[j] + words.charAt(i);
			} else {
				j++;
			}
		}
		// j wird nicht mehr gebraucht, kann wieder als Zaehler verwendet werden
		j = 0;

		// BubbleSort um die Woerte nach Buchstabenanzahl zu sortieren
		for (int i = 0; i < wordArray.length - 1; i++) {

			for (j = 0; j < wordArray.length - 1; j++) {

				// Wenn groesser dann nach vorne verschieben
				if (wordArray[j].length() > wordArray[j + 1].length()) {
					String placeholder = wordArray[j];
					wordArray[j] = wordArray[j + 1];
					wordArray[j + 1] = placeholder;
				}
				// Wenn gleich gross, dann alphabetisch sortieren, ASCI Werte vergleichen
				if (wordArray[j].length() == wordArray[j + 1].length()) {
					int zahl = wordArray[j].charAt(0);
					int zahl2 = wordArray[j + 1].charAt(0);

					// Sortierung der ASCI Werte
					if (zahl > zahl2) {
						String placeholder = wordArray[j];
						wordArray[j] = wordArray[j + 1];
						wordArray[j + 1] = placeholder;
					}
				}
			}
		}
		// String Array in String einfuegen und mit ("") Leerzeichen trennen
		for (int i = 0; i < wordArray.length; i++) {
			ergebnis = ergebnis + wordArray[i] + " ";
		}

		// Ausgabe Ergebnis
		System.out.println("Wird: " + ergebnis);
	}
}
