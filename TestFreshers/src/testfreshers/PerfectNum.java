package testfreshers;

public class PerfectNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		int sum =0;
		for(int i =1; i<=n/2;i++) {
			if(n%i==0) {
				sum = sum+i;
			}
		}
		if(n == sum) {
			System.out.println("Perfect num");
		}
		else {
			System.out.println("Not perfect");
		}

	}

}
