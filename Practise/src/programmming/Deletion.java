package programmming;
import java.util.Scanner;

public class Deletion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the array elements: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the element to delete: ");
		int ele = sc.nextInt();
		int ans[] = new int[arr.length-1];
		for (int i = 0; i < ans.length; i++) {
			if(arr[i] != ele) {
				ans[i] = arr[i];
			}
		}
		for (int i = 0; i < ans.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
