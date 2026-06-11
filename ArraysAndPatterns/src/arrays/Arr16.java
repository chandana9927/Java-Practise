package arrays;
//method to return true if an array consists more than 2 even nos.
public class Arr16 {

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 6, 7};
		System.out.println(even(arr));

	}
	static boolean even(int[] arr) {
		int count = 0;
		for(int i = 0; i<arr.length;i++) {
			if(arr[i] % 2 == 0) {
				count++;
			}
		}
		if(count > 2) {
			return true;
		}
		else {
			return false;
		}
	}

}
