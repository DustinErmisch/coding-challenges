package warOfNumbers;

import javax.swing.JOptionPane;

public class WarOfNumbersApp {

	public static void main(String[] args) {
		
		String zahlen = "";
		int[] zahlenArray = null;

		//Eingabe des  Strings
		zahlen = JOptionPane.showInputDialog("Gib die Zahlen ein und trenne mit Komma");
		//Die Komma des Strings legen die Anzahl Elemente des Arrays fest und speichert die Werte
		zahlenArray = ZahlenArrayMitKommaTrennen.zahlenArrayMitKommaTrennen(zahlen);
		//Ausgabe
		JOptionPane.showMessageDialog(null,( "Aus dem Krieg geht folgende Zahl hervor: " + TheWar.theWar(zahlenArray)));
	}

}
