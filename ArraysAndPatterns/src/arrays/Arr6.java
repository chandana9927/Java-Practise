package arrays;
//count of even elements
public class Arr6 {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		even(arr);
	}
	static void even(int[] arr) {
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				count++;
			}
		}
		System.out.println(count);
	}

}
