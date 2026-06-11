package com.Practise.Prac;

public class Desirium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 175;
		int no = n;
		int num = n;
		int count = 0;
		int sum = 0;
		while(n != 0) {
			n = n / 10;
			count++;
		}
		while(no != 0) {
			int rem = no % 10;
			sum += Math.pow(rem, count);
			no = no / 10;
			count--;
		}
		if(num == sum) {
			System.out.println(num + " Desirium");
		}
		else {
			System.out.println(num + "Not Desirium");
		}

	}

}
