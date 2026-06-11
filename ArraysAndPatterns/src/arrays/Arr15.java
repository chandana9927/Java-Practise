package arrays;
//method to true if the given array is palindrome
public class Arr15 {
	static boolean palindrome(int[] arr) {
		int i = 0;
		int j = arr.length-1;
		while(i < arr.length/2) {
			if(arr[i] != arr[j]) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	public static void main(String[] args) {
		int[] arr = {1, 2, 2, 1};
		System.out.println(palindrome(arr));

	}

}
