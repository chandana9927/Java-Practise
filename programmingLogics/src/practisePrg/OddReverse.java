package practisePrg;

public class OddReverse {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		for(int i = arr.length-1; i>=0; i--) {
			if(arr[i] % 2 != 0) {
				System.out.print(arr[i]+" ");
			}
		}

	}

}
