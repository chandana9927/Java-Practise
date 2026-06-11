package arrays;

// Add even index and odd index using method with parameter.
public class Arr14 {
	static void mulEven(int[] arr) {
		int mul = 1;
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				mul = mul * arr[i];
			}
		}
		System.out.println(mul);
	}

	static void mulOdd(int[] arr) {
		int mul = 1;
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 != 0) {
				mul = mul * arr[i];
			}
		}
		System.out.println(mul);
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		mulEven(arr);
		mulOdd(arr);
	}

}
