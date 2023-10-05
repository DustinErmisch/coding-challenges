package findTheOddInteger;

import java.util.Arrays;

public class FindTheOddInteger {

	public static void main(String[] args) {
		int[] array1 = {1,1,2,-2,5,2,4,4,-1,-2,5};//-1
		int[] array2 = {20,1,1,2,2,3,3,5,5,4,20,4,5};//5
		int[] array3 = {10};//10
		
		System.out.println(findOdd(array1));
		System.out.println(findOdd(array2));
		System.out.println(findOdd(array3));
	}
	public static int findOdd(int[] array) {
		int k = 1;
		for (int i = 0; i < array.length; i++) {
			//System.out.println("i:"+array[i]);
			for (int j = 1; j < array.length; j++) {
				if(array[i]==array[j]) {
					//System.out.println("j:"+array[j]);
					k++;
					array[j]=0;
				}
			}
			if(k%2==1) {
				//return array[i];
			}else {
				k = 0;
			}
			array[i]=0;
		}
		//System.out.println(Arrays.toString(array));
		return 0;
	}

}
