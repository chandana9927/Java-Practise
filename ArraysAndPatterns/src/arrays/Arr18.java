package arrays;

import java.util.Arrays;

/**
 * Delete an element from a specific index of specific array.
 *
 */
public class Arr18 {

	public static void main(String[] args) {
		int arr[] = {10, 20, 30, 40, 50, 60};
		int ele = 60;
		int[] ans = new int[arr.length - 1];
		for (int i = 0; i < ans.length; i++) {
			if(arr[i] != ele) {
				ans[i] = arr[i];
			}
		}
		System.out.println(Arrays.toString(ans));
	}

}
