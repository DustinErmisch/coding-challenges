package numberedCards;

import java.util.Arrays;
import java.util.Random;

/**
 * Numbered Cards
 *
 * You have a pack of 5 randomly numbered cards, which can range from 0-9. You
 * can win if you can produce a higher two-digit number from your cards than
 * your opponent. Return true if your cards win that round. Examples
 *
 * winRound([2, 5, 2, 6, 9], [3, 7, 3, 1, 2]) ➞ true Your cards can make the
 * number 96 Your opponent can make the number 73 You win the round since 96 >
 * 73
 *
 * winRound([2, 5, 2, 6, 9], [3, 7, 3, 1, 2]) ➞ true
 *
 * winRound([1, 2, 3, 4, 5], [9, 8, 7, 6, 5]) ➞ false
 *
 * winRound([4, 3, 4, 4, 5], [3, 2, 5, 4, 1]) ➞ false
 * 
 * Notes
 *
 * Return false if you and your opponent reach the same maximum number (see
 * example #4).
 */

public class NumberedCardsGame {

	public static void main(String[] args) {
		int[] array1 = { 5, 3, 2, 1, 8 };
		int[] array2 = { 9, 7, 9, 1, 8 };

		// mit Zufallswerten
		int[] arrayR1 = null;
		arrayR1 = new int[5];

		int[] arrayR2 = null;
		arrayR2 = new int[5];
		Random zufall = new Random();

// Obtain a number between [0 - 49].

		for (int i = 0; i < arrayR1.length; i++) {
			int randomNumber = zufall.nextInt(9);
			arrayR1[i] = randomNumber;
		}
		for (int i = 0; i < arrayR2.length; i++) {
			int randomNumber = zufall.nextInt(9);
			arrayR2[i] = randomNumber;
		}

		System.out.println(Arrays.toString(array1) + " vs " + Arrays.toString(array2));
		winRound(array1, array2); // one: Number 96, two: Number 73 -> true one wins because 96>73
		// mit Zufallswerten
		System.out.println("\nZufallszahlen:");
		System.out.println(Arrays.toString(arrayR1) + " vs " + Arrays.toString(arrayR2));
		winRound(arrayR1, arrayR2);

	}

	public static void winRound(int[] array1, int[] array2) {
		int zahl1 = 0;
		int zahl12 = 0;
		int zahl2 = 0;
		int zahl22 = 0;
		int stelle = 0;

		String winner = "";
		String zahl = " mit den Zahlen ";
		String winner1 = "Spieler1 gewinnt vor Spieler2";
		String winner2 = "Spieler2 gewinnt vor Spieler1";
		// Spieler1
		// als erstes herausfinden welches die groesste Zahl im Array ist, und speichern
		// in zahl1
		for (int i = 0; i <= array1.length - 1; i++) {
			if (array1[i] > zahl1) {
				zahl1 = array1[i];
				stelle = i;
			}
		}
		// Die groesste Zahl mit 0 ueberschreiben, damit im naechsten Schritt die
		// zweitgroesste Zahl ermittelt werden kann
		array1[stelle] = 0;

		// jetzt da die erstgroesste Zahl 0 ist wieder die groesste Zahl suchen und in
		// zahl12 speichern, was dann die zweitgroesste ist
		for (int i = 0; i <= array1.length - 1; i++) {
			if (array1[i] > zahl12) {
				zahl12 = array1[i];
			}
		}

		// Fuer Spieler2, im Prinzip das gleiche wie fuer Spieler1
		for (int i = 0; i <= array2.length - 1; i++) {
			if (array2[i] > zahl2) {
				zahl2 = array2[i];
				stelle = i;
			}
		}

		array2[stelle] = 0;

		for (int i = 0; i <= array2.length - 1; i++) {
			if (array2[i] > zahl22) {
				zahl22 = array2[i];
			}
		}
		// System.out.println(zahl1+" "+zahl12+"\n"+zahl2+" "+zahl22);

		// Gewinner Abfrage
		// erst groesste Zahl vergleichen
		if (zahl1 > zahl2) {
			winner = winner1 + zahl + zahl1 + zahl12 + " vs " + zahl2 + zahl22;
		} else if (zahl1 < zahl2) {
			winner = winner2 + zahl + zahl2 + zahl22 + " vs " + zahl1 + zahl12;
		}
		// zweitgroesste Zahl vergleichen, wenn erstgroesste Zahl gleich ist
		if (zahl1 == zahl2 && zahl12 > zahl22) {
			winner = winner1 + zahl + zahl1 + zahl12 + " vs " + zahl2 + zahl22;
		} else if (zahl1 == zahl2 && zahl12 < zahl22) {
			winner = winner2 + zahl + zahl2 + zahl22 + " vs " + zahl1 + zahl12;
		}
		// Wenn sowohl erstgroesste Zahl als auch zweitgroesste Zahl gleich
		// sind->unentschieden
		if (zahl1 == zahl2 && zahl12 == zahl22) {
			winner = "unentschieden";
		}
		System.out.println(winner);
	}

}
