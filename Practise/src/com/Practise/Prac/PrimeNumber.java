package com.Practise.Prac;

public class PrimeNumber {
	public static void main(String[] args) {
		int n = 19;
		for (int j = n+1; j <= 100; j++) {
			int no = j;
			boolean flag = true;
			for (int i = 2; i < no; i++) {
				if (no % i == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println(no + " is a prime number");
				break;
			}
		}
	}
}
