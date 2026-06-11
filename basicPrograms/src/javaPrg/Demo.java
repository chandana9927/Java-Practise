package javaPrg;

public class Demo {
	public static void main(String[] args) {
		int copy = 14341;
		int num = copy;
		int rev = 0;
		while(copy != 0) {
			
			int rem = copy % 10;
			rev = (rev * 10) + rem;
			copy = copy / 10;
		}
		if(num == rev) {
			System.out.println(num + " is a palindrome");
		}
		else
		{
			System.out.println(num + " is not a palindrome");
		}
		
		}

}
