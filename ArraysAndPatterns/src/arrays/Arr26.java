package arrays;
//2 dimensional array in the form of matrix
public class Arr26 {

	public static void main(String[] args) {
//		int[] arr = {1, 2, 3};
//		int[] brr = {5, 6, 7};
		int ans[][] = {{1,2,3},{4,5,6},{7,8,9}};
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[i].length; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}
	}

}
