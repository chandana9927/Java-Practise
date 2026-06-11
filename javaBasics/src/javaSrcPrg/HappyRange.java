package javaSrcPrg;

public class HappyRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 99; i++) {
			int j = i;
			while(j > 9) {
				j = happyRange(j);
			}
			if(j == 1 || j == 7 ) {
				System.out.println(i + " is a happy number");
			}
//			else {
//				System.out.println(i + " is not a happy number");
//			}
		}

	}

	public static int happyRange(int j) {
		// TODO Auto-generated method stub
		int sum = 0;
		while(j != 0)
		{
			int rem = j % 10;
			sum = sum + rem * rem;
			j = j / 10;
		}
		
		return sum;
	}

}
