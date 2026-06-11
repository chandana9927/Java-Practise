package arrays;
//To find sum of row-wise elements
public class Arr28 {

	public static void main(String[] args) {
		int ans[][] = {{1,2,3},{4,5,6},{7,8,9}};
		for (int i = 0; i < ans.length; i++) {
			int sum = 0;
			for (int j = 0; j < ans[i].length; j++) {
				sum = sum + ans[i][j];
			}
			System.out.println(sum);
		}


	}

}
