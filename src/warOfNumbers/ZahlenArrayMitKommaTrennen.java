package warOfNumbers;



public class ZahlenArrayMitKommaTrennen {
	public static int[] zahlenArrayMitKommaTrennen(String zahlen) {
		//Die Zahlen werden im String Array gespeichert und die Komma geben die Elemente an
		String[] zahlenString = zahlen.split("[,]");
		
		//Zahlenarray mit der laenge des String Arrays
		int[] array = new int [zahlenString.length];
		
		// in dem Zahlenarray werden die Werte des String Arrays gespeichert
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(zahlenString[i]);	
		}
		return array;
	}
}
