package arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Rotate an array based on index value using scanner
 *
 */
public class Arr21 {

	public static void main(String[] args) {
//		int arr[] = {10, 20, 30, 40, 50, 60};
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size:");
		int size = s.nextInt();
		System.out.println("Enter the value to rotate:");
		int rotate = s.nextInt();
		int x = 0;
		int arr[] = new int[size];
		System.out.println("Enter the array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		int[] ans = new int[arr.length];
		System.out.println(Arrays.toString(arr));
		System.out.println(rotate);
		for (int i = rotate; i < arr.length; i++) {
				ans[x] = arr[i];
				x++;
					
		}
		
		for (int i = 0; i < rotate; i++) {
			ans[x] = arr[i];
			x++;
		}
		System.out.println(Arrays.toString(ans));
	}

}