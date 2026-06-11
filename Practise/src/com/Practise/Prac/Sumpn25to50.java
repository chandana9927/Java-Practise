package com.Practise.Prac;

public class Sumpn25to50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 25; i <= 50; i++) {
			int n = i;
			int fl = 1;
			for (int j = 2; j < n; j++) {
				if(n % j == 0) {
					fl = 0;
					break;
				}
			}
			if(fl == 1) {
				System.out.println(i + " prime number");
			}
			
		}
	}

}
