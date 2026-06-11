package arrays;

//multiply even elements..
public class Arr13 {
	static void mulEven(int[] arr) {
		int mul = 1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				mul = mul * arr[i];
			}
		}
		System.out.println(mul);
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		mulEven(arr);
	}

}
