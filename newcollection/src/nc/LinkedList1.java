package nc;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a = new ArrayList();
		long startTime1 = System.nanoTime();
		for (long i = 1; i < 10000; i++) {
			a.add(0,i);
		}
		long endTime1 = System.nanoTime();
		long res1 = endTime1 - startTime1;
		System.out.println(res1);
//		System.out.println(a);
		
		LinkedList l = new LinkedList();
		long startTime2 = System.nanoTime();
		for (long i = 1; i < 10000; i++) {
			l.add(0,i);
		}
		long endTime2 = System.nanoTime();
		long res2 = endTime2 - startTime2;
		System.out.println(res2);
		if(res1 > res2) {
			System.out.println("Linked List executes faster");
		}
		else {
			System.out.println("Array List executes faster");
		}
//		System.out.println(l);
		
		LinkedList l2 = new LinkedList();
		l2.add(10);
		l2.add("Hello World!");
		l2.add('A');
		l2.add(34.23);
		System.out.println(l2);
		System.out.println(l2.peek());
		System.out.println(l2);
		System.out.println(l2.poll());
		System.out.println(l2);
	}

}
