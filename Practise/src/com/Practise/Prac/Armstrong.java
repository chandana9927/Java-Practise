package com.Practise.Prac;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 153;
		int num = n;
		int no = n;
		int count = 0;
		int sum = 0;
		while(n != 0) {
			n = n /10;
			count++;
		}
		while(no != 0) {
			int rem = no % 10;
			sum += Math.pow(rem, count);
			no = no /10;
		}
		if(num == sum) {
			System.out.println(num + " Armstrong");
		}
		else {
			System.out.println(num + "Not armstrong");
		}

	}

}
