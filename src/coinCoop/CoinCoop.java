package coinCoop;

import java.util.Arrays;

public class CoinCoop {
	/**
	 * Let's say that there exists a machine that gives out free coins, but with a
	 * twist!
	 * 
	 * Separating two people is a wall, and this machine is placed in such a way
	 * that both people are able to access it. Spending a coin in this machine will
	 * give the person on the other side 3 coins and vice versa.
	 * 
	 * If both people continually spend coins for each other (SHARING), then they'll
	 * both gain a net profit of 2 coins per turn. However, there is always the
	 * possibility for someone to act selfishly (STEALING): they spend no coins, yet
	 * they still receive the generous 3 coin gift from the other person!
	 * 
	 * The Challenge
	 * 
	 * Assuming that both people start with 3 coins each, create a function that
	 * calculates both people's final number of coins. You will be given two arrays
	 * of strings, with each string being the words "share" or "steal".
	 */

	public static void main(String[] args) {
		String[] array1 = { "share" };
		String[] array12 = { "share" };
		System.out.println(Arrays.toString(getCoinBalances(array1, array12)));// ➞ [5, 5]
		// Both people spend one coin, and receive 3 coins each.
		String[] array2 = {"steal"};
		String[] array21 = {"share"};
		System.out.println(Arrays.toString(getCoinBalances(array2, array21))) ;//➞ [6, 2]
		// Person 1 gains 3 coins, while person 2 loses a coin.

		String[] array3 = {"steal"};
		String[] array31 = {"steal"};
		System.out.println(Arrays.toString(getCoinBalances(array3, array31))) ;//➞ [3, 3]
		// Neither person spends any coins and so no one gets rewarded.

		String[] array4 = {"share", "share", "share"};
		String[] array41 = {"steal", "share", "steal"};
		System.out.println(Arrays.toString(getCoinBalances(array4, array41))) ;//➞ [3, 11]
		// Neither person spends any coins and so no one gets rewarded.
	}

	public static int[] getCoinBalances(String[] array1, String[] array2) {
		int[] array = { 3, 3 };
		for (int i = 0; i < array1.length; i++) {
			
			//jedes Array Element beider Elemente an der Stelle i miteinander vergleichen und Punkte an return array vergeben
			if (array1[i].equals("share") && array2[i].equals("share")) {
				array[0]= array[0] +2;
				array[1] = array[1] +2;
			}else if (array1[i].equals("steal") && array2[i].equals("share")) {
				array[0]= array[0] +3;
				array[1] = array[1] -1;
			}else if (array1[i].equals("share") && array2[i].equals("steal")) {
				array[0]= array[0] -1;
				array[1] = array[1] +3;
			}else {
				array[0]= array[0];
				array[1] = array[1];
			}
		}
		return array;
	}

}
