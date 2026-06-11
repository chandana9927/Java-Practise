package arrays;
//sum of even elements
public class Arr5 {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		even(arr);
	}
	static void even(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				sum = sum + arr[i];
			}
		}
		System.out.println(sum);
	}

}
