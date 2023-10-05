/**
 * Write a function that takes the coordinates of three points and returns the perimeter of the triangle. The given points are the vertices of a triangle on a two-dimensional plane.
Examples

perimeter(arr[0]={15, 7}, arr[1]={5, 22}, arr[2]={11, 1}) ➞ 47.08

perimeter(arr[0]={0, 0}, arr[1]={0, 1}, arr[2]={1, 0}) ➞ 3.41

perimeter(arr[0]={-10, -10}, arr[1]={10, 10}, arr[2]={-10, 10}) ➞ 68.28

Notes

    The given points always create a triangle.
    The numbers in the argument array can be positive or negative.
    There is 0.1 tolerance, so you don't need to round your result.
    This challenge is easier than it looks.
 */

package geometry3PermiterOfATriangle;

public class Geometry3PermiterOfATriangle {

	public static void main(String[] args) {
		int[][] array1 = { { 15, 7 }, { 5, 22 }, { 11, 1 } }; // 47.08
		System.out.println(perimeter(array1));

		int[][] array2 = { { 0, 0 }, { 0, 1 }, { 1, 0 } }; // 3.41
		System.out.println(perimeter(array2));

		int[][] array3 = { { -10, -10 }, { 10, 10 }, { -10, 10 } }; // 68.28
		System.out.println(perimeter(array3));
	}

	public static double perimeter(int[][] array) {
		double a = 0.0;
		double b = 0.0;
		double c = 0.0;
		double summe = 0.0;
		/**
		 * Koordinatensystem: z.B: Koordinatenpunkte A(15,7); B(5,22); C(11,1) Strecke a
		 * ist: 15-5=10 -> 10^2 = 100 7-22=-15 -> -15^2 = 225 100+225 = 325 -> Wurzel
		 * aus 32 5= 18.027 (Pythagoras)
		 **/

		// for Schleife muss bis 2 laufen
		for (int i = 0; i < array.length; i++) {
			// die letzte Strecke per Pythagoras i=2
			if (i == array.length - 1) {
				a = array[i][0] - array[i - i][0];
				b = array[i][1] - array[i - i][1];
				c = Math.sqrt((a * a) + (b * b));

				// die ersten zwei Strecken per Pythagoras i=0 und i=1
			} else {
				a = array[i][0] - array[i + 1][0];
				b = array[i][1] - array[i + 1][1];
				c = Math.sqrt((a * a) + (b * b));
			}
			// System.out.println(c);
			summe = summe + c;

			// runden kaufmaennisch
			double d = Math.pow(10, 2);
			summe = Math.round(summe * d) / d;
		}

		return summe;
	}

}
