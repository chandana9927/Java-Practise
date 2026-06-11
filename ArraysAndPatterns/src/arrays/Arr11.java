package arrays;

import java.util.Scanner;

//find biggest and smallest elements in an array using scanner.
public class Arr11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size:");
		int size = sc.nextInt();
		System.out.println("Enter the elements:");
		
		int[] arr = new int[size];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		int big = arr[0];
		int small = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(big < arr[i]) {
				big = arr[i];
			}
			else if(small > arr[i]) {
				small = arr[i];
			}
		}
		System.out.println("Biggest-->" + big);
		System.out.println("Smallest-->" +small);
	}

}
