package nc;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1 = new ArrayList();
		a1.add(10);
		a1.add(34);
		a1.add(90);
		a1.add(21);
		a1.add(32);
		System.out.println(a1);
		
		ArrayList a2 = new ArrayList();
		
		a2.add(11);
		a2.add(34);
		a2.add(90);
		a2.add(22);
		a2.add(32);
		System.out.println(a2);
		
//		a1.addAll(a2);
//		System.out.println(a1);
//		a1.removeAll(a2);
//		System.out.println(a1);
		
//		a1.retainAll(a2);
//		System.out.println(a1);
		
		System.out.println(a1.containsAll(a2));
		
	}

}
