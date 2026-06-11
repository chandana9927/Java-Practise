package arrays;
//Sum of odd index value.
public class Arr4 {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		odd(arr);
	}
	static void odd(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			if(i % 2 == 1) {
				sum = sum + arr[i];
			}
		}
		System.out.println(sum);
	}
}
