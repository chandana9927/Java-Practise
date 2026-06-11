package arrays;
//find missing element in a given array
public class Arr30 {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6};
		int[] brr = {5, 6, 1, 3, 2};
		int sum = 0;
		int sum1 = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum+arr[i];
		}
		for (int i = 0; i < brr.length; i++) {
			sum1 = sum1 + brr[i];
		}
		if(brr.length>arr.length) {
			System.out.println(sum1-sum);
		}
		else {
			System.out.println(sum-sum1);
		}
	}

}
