package programming;

public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no = 7;
		String s = " ";
		while(no != 0) {
			int rem = no % 2;
			s = rem + s;
			no = no / 2;
		}
		System.out.println(s);

	}

}
