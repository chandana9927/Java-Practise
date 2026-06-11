package arrays;
//print odd index
public class Arr3 {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
		odd(arr);
	}
	static void odd(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			if(i % 2 == 1) {
				System.out.println(arr[i]);
			}
		}
	}

}
