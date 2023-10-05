package warOfNumbers;

public class TheWar {
	private static int ergebnisGerade = 0;
	private static int ergebnisUngerade = 0;
	private static int ergebnis = 0;

	public static int theWar(int[] array) {
		for (int i = 0; i < array.length; i++) {
			//Wenn das Element durch 2 teilbar ist, ist es gerade , sonst ungerade
			if (array[i] % 2 == 0) {
				ergebnisGerade = ergebnisGerade + array[i];
			} else {
				ergebnisUngerade = ergebnisUngerade + array[i];
			}
		}
		// Wenn die Gerade Zahl groesser als die Ungerade ist, ist das Ergebnis Gerade. Sonst umgekehrt
		if (ergebnisGerade > ergebnisUngerade) {
			ergebnis = ergebnisGerade - ergebnisUngerade;
			
		} else {
			ergebnis = ergebnisUngerade - ergebnisGerade;
			
		}
		return ergebnis;
	}
}
