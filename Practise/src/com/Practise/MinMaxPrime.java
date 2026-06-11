package com.Practise;

public class MinMaxPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = minPrime(6, 30);
		int b = maxPrime(6, 30);
		System.out.println("Sum= " + (a + b));
	}

	static int minPrime(int mini, int maxi) {
		for(int i = mini; i <= maxi; i++) {
			int no = i;
			boolean flag = true;
			for(int j = 2; j < no;j++) {
				if(no % j == 0) {
					flag = false;
					break;
				}
			}
			if(flag) {
				return no;
			}
		}
		return 0;
		
	}
	static int maxPrime(int mini, int maxi) {
		for(int i = maxi; i >= mini; i--) {
			int no = i;
			boolean flag = true;
			for(int j = 2; j < no;j++) {
				if(no % j == 0) {
					flag = false;
					break;
				}
			}
			if(flag) {
				return no;
			}
		}
		return 0;
		
	}
}
