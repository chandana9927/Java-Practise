package com.Practise.Prac;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 14241;
		int rev = 0;
		int num = n;
		while(n != 0) {
			int rem = n % 10;
			rev = (rev * 10) + rem;
			n = n / 10;
		}
		if(num == rev) {
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not palindrome");
		}

	}

}
