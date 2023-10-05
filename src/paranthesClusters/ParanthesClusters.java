package paranthesClusters;

import java.util.Arrays;

public class ParanthesClusters {

	public static void main(String[] args) {
		String split1 = "((()))(())()()(()())"; // Beispiel1
		// String split1 = "()()()"; //Beispiel2
		// String split1 = "((()))"; //Beispiel3
		System.out.println("aus:\n"+split1);
		int j = 0;
		int k = 0;

		// Erstmal die Laenge des neuen Arrays ermitteln, ist immer +1 wenn
		// die Anzahl der Klammern auf (j++) gleich der Klammern zu (j--) ist
		for (int i = 0; i < split1.length(); i++) {
			if (split1.charAt(i) == '(') {
				j++;
			} else if (split1.charAt(i) == ')') {
				j--;
			}
			if (j == 0) {
				k++;
			}
		}

		//Neuer String Array mit der zuvor ermittelten Groesse
		String[] array = new String[k];
		//Um null aus dem Array zu löschen, Array leer ueberschreiben
		for (int i = 0; i < array.length; i++) {
			array[i] = "";
		}

		//alle Zaehler auf 0
		j = 0;
		k = 0;
		
		//Element (k) wird solange eingefuegt bis wie oben (j=0), dann wird das
		//naechste Elemnt des Arrays beschrieben. Fuer alle Elemente des split1
		for (int i = 0; i < split1.length(); i++) { 
			
			if (split1.charAt(i) == '(') {

				array[k] = array[k] + split1.charAt(i);
				j++;
			} else if (split1.charAt(i) == ')') {
				array[k] = array[k] + split1.charAt(i);
				j--;
			}
			if (j == 0) {
				k++;
			}
		}
		System.out.println("wird:\n"+Arrays.toString(array));

	}
}
