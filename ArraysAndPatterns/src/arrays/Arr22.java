package arrays;
//Find the index value of occurance element
public class Arr22 {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 4, 5};
		int res = occurance(arr,4,2);
		System.out.println("Element found at index " +res);
	}
	static int occurance(int[] arr, int ele, int occ) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if(ele == arr[i]) {
				count++;
			}
			if(count>=occ) {
				return i;
			}
		}
				return -1;
	}

}
