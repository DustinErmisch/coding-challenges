package howManyPrimeNumbers;

//import java.util.Arrays;

public class HowManyPrimeNumbers {

	public static void main(String[] args) {
		System.out.println(primeNumbers(10)+"\n");//4
		//2,3,5,7
		System.out.println(primeNumbers(20)+"\n");//8
		//2,3,5,7,11,13,17,19
		System.out.println(primeNumbers(30));//10
		//2,3,5,7,11,13,17,19,23,29

	}
	public static int primeNumbers(int zahlL) {
		int[] array = null;
		//zahlL-1 weil wir 0 und 1 nicht brauchen
		array = new int [zahlL-1];
		
		//2 weil kleinste Primzahl = 2
		int j = 2;
		
		//Array mit allen Zahlen fuellen von 2 bis Parameter
		for (int i = 0; i < array.length; i++) {
			
			array[i]=j;
			j++;
		}
		
		//j = 0 damit wir den zeahler wieder verwenden koennen
		j=0;
		
		//jedes Element durchgehen
		for (int i = 0; i < array.length; i++) {
			
			//multiplikation von array[i]*k1
			for (int k1 = array[i]; k1 < array.length; k1++) {
				
			
			//mit jedem Element vergleichen
			for (int k = 0; k < array.length; k++) {
				//wenn array[i] mit einem vielfachen k1 von sich im Array ist, dann array[i]=0
				if(array[i]*k1==array[k]) {
					
					array[k]=0;
					
				}
				
				
			}
			}
			//wenn array[i] !=0 dann ist es eine Primzahl, also j++ was die Anzahl von Primzahlen ist
			if(array[i]!=0) {
				j++;
			}
			
			
		}
		
		//System.out.println(Arrays.toString(array));
		return j;
	}

}
