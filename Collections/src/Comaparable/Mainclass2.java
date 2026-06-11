package Comaparable;

import java.util.Arrays;

class Person implements Comparable{
	String name;
	String address;
	double yearly_income;
	public Person(String name, String address, double yearly_income) {
		this.name = name;
		this.address = address;
		this.yearly_income = yearly_income;
	}
	
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", yearly_income=" + yearly_income + "]";
	}

	public int compareTo(Object obj) {
		Person p = (Person) obj;
//		return this.name.compareTo(p.name);
//		return this.address.compareTo(p.address);
		return (int) (this.yearly_income-p.yearly_income);
	}
	
	
}

public class Mainclass2 {

	public static void main(String[] args) {
		Person p1 = new Person("Yuri", "New York", 16352.99);
		Person p2 = new Person("Katzu", "New Jersey", 46532.99);
		Person p3 = new Person("Yuzu", "Chicago", 35325.92);
		Person p4 = new Person("Pearl", "Las Vegas", 35427.99);
		Person p5 = new Person("Rose", "Virginia", 25231.99);
		
		Person[] arr = {p1,p2,p3,p4,p5};
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
