package com.Practise.Prac;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact = 1;
		int n = 6;
		for(int i = n; i >= 1; i--) {
			fact = fact * i;
		}
		System.out.println(fact);

	}

}
