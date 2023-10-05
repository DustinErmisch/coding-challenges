package stalactitesOrStalagmites;

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
		//alle Elemente des arrays durchgehen
		for (int i = 0; i < array.length; i++) {
			//alle Elemente des Elements durchgehen
			for (int j = 0; j < array[i].length; j++) {
				//wenn eine 1 in dem ersten Element vorkommt dann a =1
				if (array[i][j] == 1 && i == 0) {
					a = true;
				}
				//wenn eine 1 in dem zweiten Element vorkommt dann b =1
				if (array[i][j] == 1 && i == 3) {
					b = true;
				}
			}
		}
		//System.out.println("a:" + a + " b:" + b);
		//eigentlich selbsterklaerend, verstehe oben wann a und wann b
		if (a && !b) {
			return "Stalactites";
		} else if (!a && b) {
			return "Stalagmites";
		}else if (a && b) {
			return "both";
		}
		return "";
	}

}
