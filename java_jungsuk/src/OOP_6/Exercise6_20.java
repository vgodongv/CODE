package OOP_6;

import java.util.Random;

public class Exercise6_20 {
	int temp;

	int[] shuffle(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int num= (int)(Math.random()*arr.length);
			temp= arr[0];  //arr[0] 대신 arr[i]여도 똑같
			arr[0]=arr[num];
			arr[num]=temp;
		}
		return arr;
	}

	public static void main(String[] args) {
		Exercise6_20 c = new Exercise6_20();
		
		 int[] original = {1,2,3,4,5,6,7,8,9};
		 System.out.println(java.util.Arrays.toString(original)); 
		 int[] result = c.shuffle(original); System.out.println(java.util.Arrays.toString(result));
		 
	}

}
