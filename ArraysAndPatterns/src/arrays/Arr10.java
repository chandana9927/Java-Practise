package arrays;

import java.util.Arrays;

//Bubble sort
public class Arr10 {

	public static void main(String[] args) {
		int[] arr = {4, 1, 3, 5, 2};
		int n = arr.length; 
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) { 
                    // swap temp and arr[i] 
                    int temp = arr[j]; 
                    arr[j] = arr[j + 1]; 
                    arr[j + 1] = temp; 
                }
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
