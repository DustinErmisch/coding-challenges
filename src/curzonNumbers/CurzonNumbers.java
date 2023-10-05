package curzonNumbers;

public class CurzonNumbers {
	/**
	 * Given a positive integer n and if 1 plus 2 times n exactly divides 1 plus 2
	 * raised to the power n, then n is said to be a Curzon number. Examples:
	 * isCurzon(5) -> true; 2^5+1 = 33; 2*5+1 = 11; 33 is a multiple of 11
	 * isCurzon(10) -> false; 2^10+1 = 1025; 2*10+1 = 21; 1025 in not a multiple of
	 * 21 isCurzon(14)-> true; 2^14+1 = 16385; 2*14+1 = 29; 16385 is a multiple of
	 * 29
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(isCurzon(5));
		System.out.println(isCurzon(10));
		System.out.println(isCurzon(14));
		System.out.println(isCurzon(26));

	}

	public static String isCurzon(int zahl) {
		String ergebnis = "";
		long ergebnisZahl = 1;
		long ergebnisZahl2 = 0;
		// Als erstes 2^n+1
		for (int i = 0; i < zahl; i++) {
			ergebnisZahl = ergebnisZahl * 2;
		}
		ergebnisZahl = ergebnisZahl + 1;
		

		// dann 2*n+1
		ergebnisZahl2 = 2 * zahl + 1;
		
		// wenn 2^n+1 modulo 2*n+1 gleich 0 ist, dann ist 2*n+1 ein vielfaches von 2^n+1
		if (ergebnisZahl % ergebnisZahl2 == 0) {
			ergebnis = ergebnisZahl + " is a multiple of " + ergebnisZahl2;
		} else {
			ergebnis = ergebnisZahl + " is not a multiple of " + ergebnisZahl2;
		}
		return ergebnis;
	}

}
