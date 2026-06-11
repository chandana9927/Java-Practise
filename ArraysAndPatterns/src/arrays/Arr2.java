package arrays;
//Print even elements from an array
public class Arr2 {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		even(arr);
	}
	static void even(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				System.out.println(arr[i]);
			}
		}
	}

}
