package consecutiveNumbers;


public class ConsecutiveNumbers {
	/**
	 * Create a function that determines whether elements in array can be rearranged
	 * to form a consecutive list of numbers where each number appears exactly once
	 * Examples: cons([5,1,4,3,2]); = true -> 1,2,3,4,5 
	 * cons([5,1,4,3,2,8]); = false -> 1,2,3,4,5,X,X,8 
	 * cons([5,6,7,8,9,9]); = false -> 5,6,7,8,9,9
	 * cons([7,9,6,4,8,5]); = true -> 4,5,6,7,8,9
	 * cons([14,11,13,10,12,15]); = true -> 10,11,12,13,14,15
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		int[] array1 = { 5, 1, 4, 3, 2 }; //true
		System.out.println(cons(array1));
		int[] array2 = {5,1,4,3,2,8}; //false
		System.out.println(cons(array2));
		int[] array3 = {5,6,7,8,9,9}; //false
		System.out.println(cons(array3));
		int[] array4 = {7,9,6,4,8,5}; //true
		System.out.println(cons(array4));
		int[] array5 = {14,11,13,10,12,15}; //true
		System.out.println(cons(array5));
		int[] array6 = {1,10,11,12}; //false
		System.out.println(cons(array6));

	}
	
	//Bubble Sort
	public static int[] bubbleSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {

			for (int j = 0; j < array.length - 1; j++) {

				if (array[j] > array[j + 1]) {
					int speicher = array[j + 1];
					array[j + 1] = array[j];
					array[j] = speicher;
				}
			}
		}
		return array;
		
	}

	public static boolean cons(int[] array) {
		//initialisieren des ergebis
		boolean ergebnis = false;
		array = bubbleSort(array);
		
		//sortierten Array durchgehen, jedes Element sollte subtrahiert mit dem vorherigen 1 ergeben, 
		//array[i+1]-array[i] == 1 ->true, wenn nicht false und aus der Schleife raus
		for (int i = 0; i < array.length-1; i++) {
			
			if((array[i+1]-array[i])==1){
				ergebnis = true;
			}else {
				ergebnis = false;
				break;
			}
		}
		return ergebnis;
	}

}
