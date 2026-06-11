package com.Practise.Prac;

public class primeno1to10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 2; i <= 10; i++) {
			int n = i;
			int fl = 1;
			
			for (int j = 2; j < n; j++) {
				if(n % j == 0) {
					fl = 0;
					break;
				}
			}
			if(fl == 1) {
				System.out.println(i+" Prime No");
			}
		}

	}

}
