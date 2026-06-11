package programming;

public class HappyRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for ( int i = 1; i <= 50; i++ ) {
			int no = i;
			while (no > 9) {
				no = happyRange(no);
			}
			if ( no == 1 || no == 7) {
				System.out.println(i + " Happy no");
			}
//			else {
//				System.out.println(i + "Not happy");
//			}
		}
		

	}

	public static int happyRange(int no) {
		// TODO Auto-generated method stub
		int sum = 0;
		while (no != 0) {
			int rem = no % 10;
			sum = sum + rem * rem;
			no = no / 10;
		}
		return sum;
	}

}
