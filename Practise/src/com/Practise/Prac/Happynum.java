package com.Practise.Prac;

public class Happynum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 13;
		while(n > 9) {
			n = hapno(n);
		}
		if(n == 1 || n == 7) {
			System.out.println("Happy No");
		}
		else {
			System.out.println("Not happy");
		}
	}
	static int hapno(int n) {
		int sum = 0;
		while(n !=0) {
			int rem = n % 10;
			sum = sum + rem * rem;
			n = n / 10;
		}
		return sum;
	}

}
