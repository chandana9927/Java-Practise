package programming_assignment;

public class a8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "helloMorning";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				System.out.print(ch);
			}
			
		}

	}

}
