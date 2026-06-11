package javaPrj;

import shapes.*;
import java.util.Scanner;

public class MainPrg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CircularQueue cq = new CircularQueue(3);
		
		try {
			
			System.out.println();
			
			cq.enqueue(10);
			cq.enqueue(20);
			cq.enqueue(30);
			
			System.out.println();
			
			cq.enqueue(40);//causes overflow
			
		}catch(QueueFullException e) {
			
			System.out.println(e.getMessage());
			
			System.out.println();
			
		}
		
		try {
			
			System.out.println("Deleted : " + cq.dequeue());
			System.out.println("Deleted : " + cq.dequeue());
			System.out.println("Deleted : " + cq.dequeue());
			
			System.out.println();
			cq.dequeue(); //Causes underflow
			
		}catch(QueueEmptyException e) {
			
			System.out.println(e.getMessage());
			
		}
		System.out.println();
		
		cq.display();
		
		//Using Package Classes.
		
		Square s = new Square();
		Triangle t = new Triangle();
		Circle c = new Circle();
		
		int res1 = s.area(5);
		double res2 = t.area(8, 3);
		int res3 = c.area(3);
		
		System.out.println("\n===========Areas===========");
		System.out.println("Area of Square = " +res1);
		System.out.println("Area of Triangle = " +res2);
		System.out.println("Area of Circle = " +res3);
		
	}

}
