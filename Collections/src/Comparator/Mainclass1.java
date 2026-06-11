package Comparator;

import java.util.Arrays;
import java.util.Comparator;


final class Hero{
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
}
class Demo implements Comparator{

	public int compare(Object o1, Object o2) {
		Hero a1 = (Hero) o1;
		Hero a2 = (Hero) o2;
//		return a1.name.compareTo(a2.name);
		return (int) (a1.income-a2.income);
//		return a1.gender-a2.gender;
//		return a1.age-a2.age;
	}
	
	
}

public class Mainclass1 {

	public static void main(String[] args) {
		Hero h1 = new Hero("Yuri", 46573.99, 'F', 34);
		Hero h2 = new Hero("Yuzu", 26343.99, 'M', 21);
		Hero h3 = new Hero("Katzu", 87453.92, 'M', 43);
		Hero h4 = new Hero("Pearl", 13417.99, 'F', 35);
		Hero h5 = new Hero("Rose", 36352.99, 'F', 24);
		
		Hero[] arr = {h1,h2,h3,h4,h5};
		Arrays.sort(arr, new Demo());
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
