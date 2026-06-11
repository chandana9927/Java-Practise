package arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Delete an element from a specific index of specific array using scanner
 *
 */
public class Arr19 {

	public static void main(String[] args) {
//		int arr[] = {10, 20, 30, 40, 50, 60};
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size:");
		int size = s.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		System.out.println("Enter the element to delete:");
		int ele = s.nextInt();
		int[] ans = new int[arr.length - 1];
		for (int i = 0; i < ans.length; i++) {
			if (arr[i] != ele) {
				ans[i] = arr[i];
			}
		}
		System.out.println(Arrays.toString(ans));
	}

}