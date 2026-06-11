package com.Practise.Prac;

public class StrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 145;
		int num = n;
		int sum = 0;
		while(n != 0) {
			int rem = n % 10;
			int fact = 1;
			for(int i = rem; i >= 1; i--) {
				fact = fact * i;
			}
			sum = sum + fact;
			n = n / 10;
		}
		if(num == sum) {
			System.out.println("Strong no");
		}
		else {
			System.out.println("Not strong");
		}

	}

}
