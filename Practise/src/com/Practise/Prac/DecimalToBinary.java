package com.Practise.Prac;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 9;
		String s =  " ";
		while(n != 0) {
			int rem = n % 2;
			s = rem + s;
			n = n / 2;
		}
		System.out.println(s);

	}

}
