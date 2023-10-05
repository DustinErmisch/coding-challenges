package test;


import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		int[] array1= new int[] {13,1,4,6,12,3,2,11};
		Arrays.sort(array1);
		boolean bool1 = true;
		boolean bool2 = true;
		
		while (bool2 && bool1) {
			System.out.println("true");
			bool1 = false;
		}
		
		System.out.println(Arrays.toString(array1));

	}

}
