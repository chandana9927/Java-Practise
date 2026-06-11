package com.Practise.Prac;

public class Perfectnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		int num = n;
		int sum = 0;
		for(int i = 1; i<= n/2; i++) {
			if(n % i == 0) {
				sum = sum + i;
			}
		}
		if(num == sum) {
			System.out.println("Perfect no");
		}
		else {
			System.out.println("Not perfect");
		}

	}

}
