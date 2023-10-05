package positvesAndNegatives;

public class PositivesAndNegatives {

	public static void main(String[] args) {
		int[] array1 = { 3, -2, 5, -5, 2, -8 };
		System.out.println(alternateSign(array1)); // true
		int[] array2 = { -6, 1, -1, 4, -3 };
		System.out.println(alternateSign(array2)); // true
		int[] array3 = { 4, 4, -2, 3, -6, 19 };
		System.out.println(alternateSign(array3)); // false
		int[] array4 = { 4, -4, 2,-3, 6, 19 };
		System.out.println(alternateSign(array4)); // false
	}

	public static boolean alternateSign(int[] array) {
		boolean ergebnis = false;
		//Array durchgehen
		for (int i = 0; i < array.length-1; i++) {
			//negative und positive Zahlen muessen sich abwechseln, dann true, sons false
			if(array[i+1]>0 && array[i]<0||array[i+1]<0&&array[i]>0) {
				ergebnis = true;
			}else {
				ergebnis = false;
				break;
			}
		}
		return ergebnis;
	}

}
