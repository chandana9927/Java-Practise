package com.Practise.Prac;

public class Exponential {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base = 2;
		int exp = 32;
		long ans = 1;
		while(exp != 0) {
			ans = base * ans;
			exp--;
		}
		System.out.println(ans);

	}

}
