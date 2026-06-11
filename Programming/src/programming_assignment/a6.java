package programming_assignment;

public class a6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ARORA";
		String rev = "";
		for(int i = s.length()-1;i>=0;i--) {
			rev = rev + s.charAt(i);
		}
		if(s.equals(rev)) {
			System.out.println(s + " is a palindrome");
		}
		else
		{
			System.out.println(s + " is not a palindrome");
		}

	}

}
