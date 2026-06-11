package nc;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1 = new ArrayList();
		a1.add(23);
//		a1.add(2.4);
		a1.add(true);
		a1.add(null);
//		a1.add("Java");
//		a1.add("Giraffe");
		a1.add('A');
		a1.add(null);
		a1.add("10");
		System.out.println(a1);
//		a1.remove("Giraffe");
//		System.out.println(a1);
//		a1.add(3,30);
//		System.out.println(a1);
//		a1.set(2, "Mocha");
//		System.out.println(a1);
//		System.out.println(a1.get(8));
//		System.out.println(a1.remove(2));
//		System.out.println(a1);
//		System.out.println(a1.contains(null));
//		System.out.println(a1.size());
//		System.out.println(a1.isEmpty());
//		Object[] arr = a1.toArray();
//		System.out.println(Arrays.toString(arr));
		ArrayList a2 = new ArrayList();
		a2.add("HTML");
		a2.add(null);
		a2.add(45.66);
		a2.add(true);
		System.out.println(a2);
		System.out.println(a1.addAll(a2));
		System.out.println(a1);
//		System.out.println(a1.addAll(3, a2));
//		System.out.println(a1);
//		a1.removeAll(a2);
//		System.out.println(a1);
		a1.retainAll(a2);
		System.out.println(a1);
		
	}

}
