package nc;

import java.util.Arrays;
import java.lang.String;

class emp implements Comparable{
	int id;
	String name;
	double sal;
	public emp(int id, String name, double sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	public String toString() {
//		compareTo(this.name);
		return id + " " + name + " " + sal;
	}
	
	public int compareTo(Object obj) {
		emp e = (emp) obj;
//		return;
		return this.name.compareTo(e.name);
	}
	
}
public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		emp e1 = new emp(5, "Irwin", 5600.99);
		emp e2 = new emp(7, "Rowan", 8999.99);
		emp e3 = new emp(3, "Albert", 10000.99);
		emp arr[] = {e1, e2, e3};
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
