package phoneNumberWordDecoder;

/**
 * Phone Number Word Decoder
 * 
 * Create a program that converts a phone number with letters to one with only
 * numbers. Number Letter 0 none 1 none 2 ABC 3 DEF 4 GHI 5 JKL 6 MNO 7 PQRS 8
 * TUV 9 WXYZ Examples
 * 
 * textToNum("123-647-EYES") ➞ "123-647-3937"
 * 
 * textToNum("(325)444-TEST") ➞ "(325)444-8378"
 * 
 * textToNum("653-TRY-THIS") ➞ "653-879-8447"
 * 
 * textToNum("435-224-7613") ➞ "435-224-7613"
 * 
 * Notes
 * 
 * All inputs will be formatted as a string representing a proper phone number
 * in the format XXX-XXX-XXXX or (XXX)XXX-XXXX, using numbers and capital
 * letters. Check the Resources tab for more info on telephone keypads.
 */

public class PhoneNumberWordDecoder {

	public static void main(String[] args) {
		System.out.println(textToNum("123-647-EYES"));// "123-647-3937"
		System.out.println(textToNum("(325)444-TEST"));// "(325)444-8378"
		System.out.println(textToNum("653-TRY-THIS"));// "653-879-8447"
		System.out.println(textToNum("435-224-7613"));// "435-224-7613"

		// A -> ASCI 65
	}

	public static String textToNum(String number) {
		int asci = 0;
		// Neuer String um die Zahlen und die umgewandeltet Buchstaben zu speichern
		String numberNew = "";
		// den String durchgehen
		for (int i = 0; i < number.length(); i++) {
			// ASCI nummer des Buchstaben auslesen
			asci = number.charAt(i);

			// Nach der Aufgabentabelle die Buchstaben in entsprecheden Zahlen zu aendern
			if (asci >= 65 && asci <= 67) {
				numberNew = numberNew + 2;
			} else if (asci >= 68 && asci <= 70) {
				numberNew = numberNew + 3;
			} else if (asci >= 71 && asci <= 73) {
				numberNew = numberNew + 4;
			} else if (asci >= 74 && asci <= 76) {
				numberNew = numberNew + 5;
			} else if (asci >= 77 && asci <= 79) {
				numberNew = numberNew + 6;
			} else if (asci >= 80 && asci <= 83) {
				numberNew = numberNew + 7;
			} else if (asci >= 83 && asci <= 85) {
				numberNew = numberNew + 8;
			} else if (asci >= 86 && asci <= 89) {
				numberNew = numberNew + 9;
			} else {
				numberNew = numberNew + number.charAt(i);
			}
		}
		// neuen String zurueckgeben
		return numberNew;
	}
}
