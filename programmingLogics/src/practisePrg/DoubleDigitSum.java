package practisePrg;

public class DoubleDigitSum {

	public static void main(String[] args) {
		// arr= 12,33,43, 53,...
		int sum = 0;
		int[] arr = {12, 35, 21, 1, 3, 34, 9, 182};
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]>9 && arr[i]<100) {
				sum += arr[i];
			}
		}
		System.out.println(sum);
	}

}
