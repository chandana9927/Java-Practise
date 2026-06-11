package programming;

public class Happy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no = 7;
		int temp = no;
		while( no > 9 ) {
			no = happy(no);
		}
		if( no == 1 || no == 7 ) {
			System.out.println(temp + " is a happy no");
		}
		else {
			System.out.println(temp + " is not a happy no" );
		}
		

	}

	public static int happy(int no) {
		// TODO Auto-generated method stub
		int sum = 0;
		while( no != 0 ) {
			int rem = no % 10;
			sum = sum + rem * rem;
			no = no / 10;
		}
		return sum;
	}
//	public int hdygyfg() {
//		System.out.println("dygetftu");
//		return 0;
//	}

}
