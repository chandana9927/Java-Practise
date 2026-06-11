package logics;

import java.util.Scanner;

public class L1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n%2==1) {
			System.out.println("Weird");
		}
		else {
			if(n>=2 && n<=5) {
				System.out.println("Not Weird");
			}else if(n>=6 && n<=20) {
				System.out.println("Weird");
			}else {
				System.out.println("Not Weird");
			}
		}
		
		//Test Case1: 24 Not Weird--->Pass
		//Test Case2: 4 Not Weird
		//Test Case3: 18 Weird
		//Test case4: 29 Weird
		//Test Case5: 5 Weird
		//Test Case6: 100 Not Weird
		//Test Case7: 20 Weird

	}

}
