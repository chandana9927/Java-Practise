package programming_assignment;

public class a12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "GOOd MOrning";
		for(int i = 0; i < a.length(); i++) {
			char ch = a.charAt(i);
			if(ch == 'O') {
				a = a.replace(ch, 'o');
			}
		}
		System.out.println(a);

	}

}
