package arrayOfMultibles;

import java.util.Arrays;
import java.util.Scanner;

public class arrayOfMultiblesTest {

	public static void main(String[] args) {
		
		int zahl;
		int anzahl;
		//Eingabe welche Zahl
		Scanner eingabeFenster = new Scanner(System.in);
		System.out.println("Fuer welche Zahl soll das Vielfache ausgegeben werden?");
		zahl = eingabeFenster.nextInt();
		
		//Eingabe wie oft das Vielfache rechnen
		System.out.println("Wieviele Zahlen sollen errechnet werden)");
		anzahl = eingabeFenster.nextInt();
		
		//Ergebins mit Methode ermitteln und ausgeben
		int[] ergebnis = ArrayOfMultibles.arrayMultiblesErstellen(zahl, anzahl);
		System.out.println(Arrays.toString(ergebnis));
		eingabeFenster.close();
		

	}

}
