package programmming;

public class ElementInsertion {
	public static void main(String[] args) {
		int arr[] = {10, 20, 30, 40};
		int ele = 50;
		int index = 4;
		int ans[] = new int[arr.length+1];
		for (int i = 0; i < ans.length; i++) {
			if(index == i) {
				ans[i] = ele;
			}
			else {
				ans[i] = arr[i];
			}
		}
		for (int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
		}
	}

}
