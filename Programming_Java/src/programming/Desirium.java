package programming;

public class Desirium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no = 175;
		int no1 = no;
		int no2 = no;
		int sum = 0;
		int count = 0;
		
		while(no != 0) {
			no = no / 10;
			count ++;
		}
		
		while(no1 != 0) {
			int rem = no1 % 10;
			sum += Math.pow(rem, count);
			no1 = no1 / 10;
			count --;
		}
		if(no2 == sum) {
			System.out.println("Desirium no");
		}
		else {
			System.out.println("Not Desirium");
		}

	}

}
