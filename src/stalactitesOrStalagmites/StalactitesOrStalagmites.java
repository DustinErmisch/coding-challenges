package stalactitesOrStalagmites;

/**
 * Stalactites or Stalagmites?
 * 
 * Stalactites hang from the ceiling of a cave while stalagmites grow from the
 * floor.
 * 
 * Create a function that determines whether the input represents "stalactites"
 * or "stalagmites". If it represents both, return "both". Input will be a 2D
 * array, with 1 representing a piece of rock, and 0 representing air space.
 * Examples
 * 
 * mineralFormation([ [0, 1, 0, 1], [0, 1, 0, 1], [0, 0, 0, 1], [0, 0, 0, 0] ])
 * ➞ "stalactites"
 * 
 * mineralFormation([ [0, 0, 0, 0], [0, 1, 0, 1], [0, 1, 1, 1], [0, 1, 1, 1] ])
 * ➞ "stalagmites"
 * 
 * mineralFormation([ [1, 0, 1, 0], [1, 1, 0, 1], [0, 1, 1, 1], [0, 1, 1, 1] ])
 * ➞ "both"
 * 
 * Notes
 * 
 * There won't be any examples where both stalactites and stalagmites meet
 * (because those are called pillars). There won't be any example of neither
 * stalactites nor stalagmites. In other words, if the first array has 1s,
 * return "stalactites". If the last array has 1s, return "stalagmites". If both
 * have them, return "both".
 */
public class StalactitesOrStalagmites {

	public static void main(String[] args) {

		// @formatter:off
		int[][] array1= {
				{0,1,0,1},
				{0,1,0,1},
				{0,0,0,1},
				{0,0,0,0}};//stalactites
		
		int[][] array2= {
				{0,0,0,0},
				{0,1,0,1},
				{0,1,1,1},
				{0,1,1,1}};//stalagmites
		
		int[][] array3= {
				{1,0,1,0},
				{1,1,0,1},
				{0,1,1,1},
				{0,1,1,1}};//both
		// @formatter:on
		System.out.println(mineralFormation(array1));
		System.out.println(mineralFormation(array2));
		System.out.println(mineralFormation(array3));
	}

	public static String mineralFormation(int[][] array) {
		boolean a = false;
		boolean b = false;
		// System.out.println(array[0].length);
		// alle Elemente des arrays durchgehen
		for (int i = 0; i < array.length; i++) {
			// alle Elemente des Elements durchgehen
			for (int j = 0; j < array[i].length; j++) {
				// wenn eine 1 in dem ersten Element vorkommt dann a =1
				if (array[i][j] == 1 && i == 0) {
					a = true;
				}
				// wenn eine 1 in dem zweiten Element vorkommt dann b =1
				if (array[i][j] == 1 && i == 3) {
					b = true;
				}
			}
		}
		// System.out.println("a:" + a + " b:" + b);
		// eigentlich selbsterklaerend, verstehe oben wann a und wann b
		if (a && !b) {
			return "Stalactites";
		} else if (!a && b) {
			return "Stalagmites";
		} else if (a && b) {
			return "both";
		}
		return "";
	}

}
