package com.products;

import java.sql.SQLException;
import java.util.Scanner;

public class Controller {
	static {
		System.out.println("Welcome to Chocalate World");
	}
public static void main(String[] args) throws Exception {
	ProductDao dao = new ProductDao();
	boolean choice = true;
	while(choice) {
		System.out.println("Enter 1 to Save the data \n 2 to update the data \n 3 to delete the data \n 4 to fetch the data");
		Scanner scan = new Scanner(System.in);
		int option=scan.nextInt();
		switch (option) {
		case 1:{
			System.out.println("Enter the Name");
			String Name = scan.next();
			System.out.println("Enter the price");
			int price = scan.nextInt();
			System.out.println("Enter the Description");
			String description= scan.next();
			System.out.println("enter the brand");
			String brand = scan.next();
			Product p = new Product(Name, price, description, brand);
			int count=dao.save(p);
			if(count > 0) {
				System.out.println("data Saved");
			}
			else
			{
				System.out.println("Data not saved");
			}
			break;
		}
		case 2: {
			System.out.println("Enter the name of the product which you want to update");
			String name = scan.next();
			System.out.println("Enter the new price");
			int price = scan.nextInt();
			int count = dao.update(name, price);
			if (count > 0) {
				System.out.println("dataupdated");
			} else {
				System.out.println("data not updated");
			}
			break;
		}
		case 3: {
			System.out.println("Enter the product you want to delete");
			String name = scan.next();
			int count = dao.delete(name);
			if (count > 0) {
				System.out.println("data deleted");
			} else {
				System.out.println("data not deleted");
			}
			break;
		}
		case 4: {
			System.out.println("Enter the name of the product which you want to fetch");
			String name = scan.next();
			Product p = dao.fetch(name);
			System.out.println(p);
			break;
		}
		case 5: {
			choice = false;
			System.out.println("Thankyou");
			break;
		}
		default:
			System.out.println("wrong choice");
			break;
		}

	}

}
}