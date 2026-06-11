package testfreshers;

public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		String s = "";
		while(n!=0) {
			int rem = n%2;
			s = s + rem;
			n = n/2;
		}
		System.out.println(s);

	}

}
