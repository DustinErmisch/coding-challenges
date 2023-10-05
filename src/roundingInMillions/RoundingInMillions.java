package roundingInMillions;

import java.util.Arrays;

public class RoundingInMillions {

	public static void main(String[] args) {
		Object[][] cities1 = { { "Nice", 942208 }, { "Abu Dhabi", 1482816 }, { "Neaples", 2186853 },
				{ "Vatican City", 572 } };
		for (int i = 0; i < cities1.length; i++) {
			System.out.println(Arrays.toString(cities1[i]));
		}
		System.out.println("-----------------------------------");
		 cities1 = millionsRounding(cities1);
			for (int i = 0; i < cities1.length; i++) {
				System.out.println(Arrays.toString(cities1[i]));
			}
	}

	public static Object[][] millionsRounding(Object[][] cities) {
		
		for (int i = 0; i < cities.length; i++) {
			
			//Bevoelkerung als Int fuer erste Bedingung
			int popInt = (int) cities[i][1];
			//Bevoelkerung/1000000 als double fuer Math.pow
			double popDouble = (double) popInt/1000000;
			//wenn Bevoelkerung < 500000 dann 0
			if(popInt <500000 ) {
				cities[i][1] = 0;
				//Sonst Bevoelkerung runden auf Millionen
			}else {
				
				//runden kaufmaennisch
				double d = Math.pow(10, 0);
			    popDouble = Math.round(popDouble * d) / d;
				
				cities[i][1] = (int)popDouble*1000000;
			}
		}

		return cities;
	}

}
