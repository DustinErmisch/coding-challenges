package recursionInterDigitsCounts;

public class RecursionIntegerDigitsCounts {
	// Rekursion -> Methode ruft sich selbst auf
	public static void main(String[] args) {
		System.out.println(count(318));// 3
		System.out.println(count(-92563));// 5
		System.out.println(count(4666));// 4
		System.out.println(count(-314890));// 6
		System.out.println(count(654321));// 6
		System.out.println(count(638476));// 6

	}

	public static int count(long zahl) {
		// ergebnis 1, weil die Zahl auf jeden Fall eine Stelle hat
		int ergebnis = 1;

		// zahl / 10 arbeitet quasi jede Stelle ab, bis die Zahl 0 ist
		if (zahl / 10 != 0) {

			zahl = zahl / 10;

			/**
			 * Die count Funktion gibt die Variable ergebnis wieder, bei jedem durchlauf
			 * ergebnis +1 muss so gemacht werden, weil die Initialisierung so quasi
			 * ignoriert wird Ausserdem ist das die Rekursion, d.h. die Methode ruft sich
			 * immer wieder selbst auf, //solange die if Bedingung erfuellt ist
			 */
			ergebnis = count(zahl) + 1;

		}

		return ergebnis;
	}

}
