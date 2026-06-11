package arrays;
//merge 2 arrays w/o using in-built methods
public class Arr23 {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40};
		int[] brr = {50, 60, 70, 80};
		int[] res = new int[arr.length + brr.length];
		int j = 0;
		for(int i = 0; i < arr.length; i++, j++) {
			res[j] = arr[i];
		}
		for (int i = 0; i < brr.length; i++, j++) {
			res[j] = brr[i];
		}
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}

	}

}
