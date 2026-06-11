package programming;

public class Palindrome {
		public static void main(String[] args) 
		{
			int n = 1221;
			int no1 = n;
			int rev = 0;
			while(n != 0){
				int rem = n % 10;
				rev = (rev * 10) + rem;
				n = n / 10;
				
			}
			if(no1 == rev) {
				System.out.println("Is palidrome");
			}
			else
			{
				System.out.println("Not palidrome");
			}
		}
	}


