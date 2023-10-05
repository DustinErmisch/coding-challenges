package removeRepeatedCharacters;



public class RemoveRepeatedCharacters {

	public static void main(String[] args) {
		System.out.println(unrepeated("teshahset"));//"tesha"
		System.out.println(unrepeated("hello"));//"helo"
		System.out.println(unrepeated("aaaaa"));//"a"
		System.out.println(unrepeated("WWE!!!"));//"WE!"
		System.out.println(unrepeated("call 911"));//"cal 91"
		
	}
	public static String unrepeated(String word) {
		//Erstmal jeden Buchstaben in einem Element speichern
		String[] wordArray = null;
		wordArray = new String [word.length()];
		for (int i = 0; i < wordArray.length; i++) {
			wordArray[i] = ""+ word.charAt(i);
		}
		//Dann das Wort leeren
		word = "";
		
		//jedes Element durchgehen		
		for (int i = 0; i < wordArray.length; i++) {
			
			
			//mit jedem Element von hinten vergleichen, solangen j > i
			for (int j = wordArray.length-1; j > i; j--) {
				
				//Wenn der Buchstabe gleich ist, also mehrmals vorkommt
				if (wordArray[i].equals( wordArray[j])) {
					//dann das Element mit wohl nie als Parameter vorkommender Zeichenfolge ueberschreiben
					wordArray[j] = "+%+***";
					
				}
			}
			
		}
		//Dann den Array wieder durchgehen
		for (int i = 0; i < wordArray.length; i++) {
			//und nur wenn das Element nicht gleich der wohl nie als Parameter vorkommender Zeichenfolge ist
			//wieder ins Wort einschreiben
			if (wordArray[i]!="+%+***") {
				word = word+wordArray[i];
			}
		}
		
		return word;
	}
}
