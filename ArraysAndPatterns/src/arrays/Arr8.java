package arrays;
//find the occurance (count of elements) of array elements
public class Arr8 {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
		System.out.println(search(arr, 20));
	}
	static int search(int[] arr, int ele) {
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == ele) {
				count++;
			}
		}
		return count;
	}
}
