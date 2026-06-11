package Comaparable;

import java.util.Arrays;

class Hero implements Comparable{
	String name;
	double income;
	char gender;
	int age;
	public Hero(String name, double income, char gender, int age) {
		this.name = name;
		this.income = income;
		this.gender = gender;
		this.age = age;
	}

	public String toString() {
		return "Hero [name=" + name + ", income=" + income + ", gender=" + gender + ", age=" + age + "]";
	}

	public int compareTo(Object obj) {
		Hero h = (Hero) obj;
//		return this.name.compareTo(h.name);
//		return (int) (this.income-h.income);
//		return this.gender-h.gender;
		return this.age-h.age;
	}
	
	
}

public class Mainclass1 {

	public static void main(String[] args) {
		Hero h1 = new Hero("Yuri", 16352.99, 'F', 34);
		Hero h2 = new Hero("Yuzu", 46532.99, 'M', 21);
		Hero h3 = new Hero("Katzu", 35325.92, 'M', 43);
		Hero h4 = new Hero("Pearl", 35427.99, 'F', 35);
		Hero h5 = new Hero("Rose", 25231.99, 'F', 24);
		
		Hero[] arr = {h1,h2,h3,h4,h5};
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
