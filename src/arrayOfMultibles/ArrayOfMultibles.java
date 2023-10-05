package arrayOfMultibles;

public class ArrayOfMultibles {
	
	public static int[] arrayMultiblesErstellen(int zahl, int anzahl) {
		// Array erstellen mit der Anzahl der gewuenschten Vielfachen
		int[] array = null;
		array = new int[anzahl];
		//Jede Wert der Zahl von vielfaches, erst mal eins (j), dann
		//mal 2, mal 3 usw. (j++);
		int j = 1;
		for (int i = 0; i < array.length; i++) {
			array[i] = zahl * j;
			j++;
		}
		return array;

	}

}
