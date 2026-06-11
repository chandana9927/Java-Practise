package arrays;
//Find an element based on index or search an element based on index.
public class Arr7 {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
		System.out.println(search(arr, 20));
	}
	static int search(int[] a, int ele) {
		for(int i = 0; i < a.length; i++) {
			if(a[i] == ele) {
				return i;
			}
		}
		return -1;
	}

}
