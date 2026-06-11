package programming;

public class Strongnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		strong(145);
		strong(258);
	}
	public static int strong(int num) {
		int sum = 0;
		int copy = num;
		while(copy!=0) {
			int rem = copy % 10;
			int fact = 1;
			for(int i = rem; i >= 1; i--) {
				
				fact = fact * i;
			
			}
			sum = sum + fact;
			copy = copy / 10;
		}
		if(num == sum) {
			System.out.println(num+" is a strong number");
		}
		else {
			System.out.println(num+" is not a strong number");
		}
		return sum;
	}
	

}
