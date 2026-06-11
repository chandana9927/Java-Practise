package arrays;

import java.util.Arrays;

//Compare the given array
public class Arr24 {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30};
		int[] brr = {10, 20, 30, 40, 50};
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(brr));
		System.out.println(Arrays.equals(arr, brr));
	}

}
