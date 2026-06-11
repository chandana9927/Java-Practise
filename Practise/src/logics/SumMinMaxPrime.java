package logics;

public class SumMinMaxPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = minPrime(16,50);
		int b = maxPrime(16,50);
		System.out.println("Sum = " + (a+b));
	}
	
	static int minPrime(int x, int y) {
		for(int i = x; i <= y; i++) {
			int no = i;
			boolean f = true;
			for(int j = 2; j < no; j++) {
				if(no % j == 0) {
					f = false;
					break;
				}
			}
			if(f) {
				return no;
			}
		}
		return 0;
	}
	
	static int maxPrime(int x, int y) {
		for(int i = y; i >= x; i--) {
			int no = i;
			boolean f = true;
			for(int j = 2; j < no; j++) {
				if(no % j == 0) {
					f = false;
					break;
				}
			}
			if(f) {
				return no;
			}
		}
		return 0;
	}
}
