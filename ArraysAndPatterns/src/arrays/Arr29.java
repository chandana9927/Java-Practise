package arrays;
//To find sum of column-wise elements
public class Arr29 {

	public static void main(String[] args) {
		int ans[][] = {{1,2,3},{4,5,6}};
		for (int i = 0; i < ans[0].length; i++) {
			int sum = 0;
			for (int j = 0; j < ans.length; j++) {
				sum = sum + ans[j][i];
			}
			System.out.println(sum);
		}

	}

}
