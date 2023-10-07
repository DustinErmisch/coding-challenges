package backspaceAttack;

import java.util.Arrays;
import java.util.Iterator;

/**
 * Backspace Attack
 * 
 * Suppose a hash # represents the BACKSPACE key being pressed. Write a function
 * that transforms a string containing # into a string without any #. Examples
 * 
 * erase("he##l#hel#llo") ➞ "hello"
 * 
 * erase("major# spar##ks") ➞ "majo spks"
 * 
 * erase("si###t boy") ➞ "t boy"
 * 
 * erase("####") ➞ ""
 * 
 * Notes
 * 
 * In addition to characters, backspaces can also remove whitespaces. If the
 * number of hashes exceeds the previous characters, remove those previous
 * characters entirely (see example #3). If there only exist backspaces, return
 * an empty string (see example #4).
 */
public class BackspaceAttack {

	public static void main(String[] args) {
		erase("he##l#hel#llo"); // "hello"

	}
	public static void erase(String word1)
	{
		toArray(word1);
		
	}
	public static void toArray(String word) {
		int l = word.length();
		String[] wordAr = null;
		wordAr = new String[l];
		
		for (int i = 0; i < wordAr.length; i++) {
			wordAr[i] = ""+word.charAt(i);
		}
		System.out.println(Arrays.toString(wordAr));
		System.out.println(Arrays.toString(delete(wordAr)));
	}
	public static String[] delete(String[] wordAr) {
		for (int i = 0; i < wordAr.length; i++) {
			if(wordAr[i].equals("#")) {
				System.out.println("test");
				wordAr[i] = "%";
				wordAr[i-1]="%";
				break;
			}
		}
		return wordAr;
	}

}
