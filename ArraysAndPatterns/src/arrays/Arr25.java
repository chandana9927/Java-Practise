package arrays;
//Find the common elements present in an array
public class Arr25 {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int[] brr = {1, 2, 3, 4, 5, 6, 7, 8};
		System.out.println("Common Elements");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < brr.length; j++) {
				if(arr[i] == brr[j]) {
					System.out.println(arr[i]);
				}
			}
		}
	}

}
