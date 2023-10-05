package pronouncinTheXs;

//import java.util.Arrays;

public class PronouncinTheXs {

	public static void main(String[] args) {
		System.out.println(xPronounce("Inside the box was a xylophone")); // "Inside the bocks was a zylophone"
		System.out.println(xPronounce("The x ray is excellent"));// "The ecks ray is eckscellent"
		System.out.println(xPronounce("OMG x box unboxing video x D")); // "OMG ecks bocks unbocksing video ecks D"

	}
	public static String xPronounce(String words) {
		//words Buchstaben in array speichern
		String[] array = null;
		
		array = new String [words.length()];
		for (int i = 0; i < array.length; i++) {
			array[i] = ""+words.charAt(i);
		}
		//words leer machen
		words= "";
		
		//System.out.println(Arrays.toString(array));
		for (int i = 0; i < array.length-1; i++) {
			
			//Wort faengt mit x an dann z
			if (!array[i+1].equals(" ") && array[i].equals("x") && array[i-1].equals(" ")) {
				array[i] = "z";
			//Wort ist nur x dann ecks
			}else if (array[i+1].equals(" ") && array[i].equals("x") && array[i-1].equals(" ")) {
				array[i] = "ecks";
			//in allen anderen Faellen ist x cks
			}else if (array[i].equals("x")) {
				array[i] = "cks";
			}
			//Buchstaben array[i] in words einfuegen
			words = words + array[i];
		}
		//da die Schleife nur bis <array.lenght laeuft (wegen array[i+1]) 
		//den letzten Buchstaben einfuegen wobei da wuerde x nicht behandelt werden
		words = words + array[array.length-1];
		//System.out.println(Arrays.toString(array));
		return words;
	}

}
