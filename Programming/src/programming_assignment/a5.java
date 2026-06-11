package programming_assignment;

public class a5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "+a-+b";
		for(int i = 0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch == '+') {
				s = s.replace(ch, '#');
			}
		}
		System.out.println(s);

	}

}
