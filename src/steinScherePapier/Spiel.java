package steinScherePapier;

import javax.swing.JOptionPane;

public class Spiel {

	public static void main(String[] args) {

		boolean eingabe1B = false;
		boolean eingabe2B = false;
		String eingabe1 = "";
		String eingabe2 = "";
		
		//Eingabe Schleife, solange die Eingabe nicht stein oder schere oder papier ist, eingabe wiederholen
		while (eingabe1B == false) {
			eingabe1 = JOptionPane.showInputDialog("Spieler1: Stein, Schere oder Papier");
			//toLowerCas() schreibt alles klein, damit der Spieler Gross-, und Kleinschreibung nicht beachten muss
			eingabe1 = eingabe1.toLowerCase();
			if (eingabe1.equals("stein") || eingabe1.equals("schere") || eingabe1.equals("papier")) {
				eingabe1B = true;
			} else {
				JOptionPane.showMessageDialog(null, "Gebe ein: Stein oder Schere oder Papier");
			}
		}
		while (eingabe2B == false) {
			eingabe2 = JOptionPane.showInputDialog("Spieler2: stein, schere oder papier");
			eingabe2 = eingabe2.toLowerCase();
			if (eingabe2.equals("stein") || eingabe2.equals("schere") || eingabe2.equals("papier")) {
				eingabe2B = true;
			} else {
				JOptionPane.showMessageDialog(null, "Gebe ein: Stein oder Schere oder Papier");
			}
		}
		
		//Alle Faelle abfragen
		if(eingabe1.equals("stein") && eingabe2.equals("stein") || eingabe1.equals("papier")&& eingabe2.equals("papier")
				|| eingabe1.equals("schere") && eingabe2.equals("schere")) {
			JOptionPane.showMessageDialog(null, "Unentschieden");
		}else if(eingabe1.equals("stein")&& eingabe2.equals("schere")||eingabe1.equals("schere")&&eingabe2.equals("papier")
				|| eingabe1.equals("papier")&&eingabe2.equals("stein")) {
			JOptionPane.showMessageDialog(null, "Spieler1 gewinnt");
		}else {
			JOptionPane.showMessageDialog(null, "Spieler2 gewinnt");
		}
		

	}

}
