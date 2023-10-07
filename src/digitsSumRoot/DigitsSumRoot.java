package digitsSumRoot;

/**
 * Digits Sum Root
 * 
 * Create a function that takes a number and returns one digit that is the
 * result of summing all the digits of the input number. When the sum of the
 * digits consists of more than one digit, repeat summing until you get one
 * digit. Examples
 * 
 * digitRoot(123) ➞ 6 // 1 + 2 + 3 = 6
 * 
 * digitRoot(999888777L) ➞ 9
 * 
 * digitRoot(1238763636555555555L) ➞ 9
 * 
 * Notes
 * 
 * Recursion is allowed.
 */

public class DigitsSumRoot {

	public static void main(String[] args) {
		System.out.println(digitRoot(123));//6
		System.out.println(digitRoot(999888777L));//9
		System.out.println(digitRoot(1238763636555555555L));//9
		
	}

	public static long digitRoot(long number) {
		//Wenn die digitRootSum Methode einen Wert der über 9 ist (summe), also mehrstellig
		//dann wird die digitSumRoot Methode ausgefuehrt, wobei dadurch number aktualisiert wird
		if(digitRootSum(number, 0L)/10!=0) {
			
			number = digitRootSum(number, 0L); //number = sum , da return = sum
			
		}
		//wenn die digitRootSum Methode  die summe unter 10 zurueck gibt, dann dieser Wert als return
		return digitRootSum(number, 0L);
	}

	public static long digitRootSum(long number, long sum) {
		//wenn die number / 10 ungleich 0 ist, dann ist die number mehr als eine Stelle
		if (number / 10 != 0) {
			//dann summe =summe + summe modulo 10
			sum = sum +  number % 10;
			//number = number/10, um eine Stelle zu reduzieren, die durch %10 schon in der summme ist
			number = number / 10;
			//summe wird aktualisiert
			sum = digitRootSum(number, sum);

		} else {
			//wenn die zahl number nur noch einstellig ist, number zur summer addieren
			sum = sum + number;
			
		}
		// System.out.println("summe:" +sum);
		// System.out.println("number:" +number);
		//return sum
		return sum;
	}

}
