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
	public static void erase(String word)
	{
		word = toArray(word,0);
		System.out.println(word);
		
	}
	public static String toArray(String word,int m) {
		int l = word.length()-m;
		String[] wordAr = null;
		wordAr = new String[l];
		
		for (int i = 0; i < wordAr.length; i++) {
			if(word.charAt(i)!= '%') {
			wordAr[i] = ""+word.charAt(i);
			}
		}
		System.out.println(Arrays.toString(wordAr));
		word =delete(wordAr,m);
		return word;
	}
	public static String delete(String[] wordAr, int m) {
		String word ="";
		for (int i = 0; i < wordAr.length; i++) {
			if(wordAr[i].equals("#")) {
				System.out.println("test");
				wordAr[i] = "%";
				wordAr[i-1]="%";
				m =2;
				break;
			}
		}
		for (int i = 0; i < wordAr.length; i++) {
			word = word+wordAr[i];
		}
		return word;
	}

}
