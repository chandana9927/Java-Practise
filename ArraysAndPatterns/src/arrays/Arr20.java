package arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Frequency of given elements in the given array using scanner
 *
 */
public class Arr20 {

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
		int[] fr = new int[arr.length];
		for (int i = 0; i < fr.length; i++) {
			int count = 1;
			for (int j = i+1; j < fr.length; j++) {
					if(arr[i] == arr[j]) {
						fr[j] = -1;
						count++;
					}
					if(fr[i]!=-1) {
						fr[i]=count;
					}
			}
		}
		for (int i = 0; i < fr.length; i++) {
			System.out.println(arr[i]+" "+fr[i]);
		}
	}

}