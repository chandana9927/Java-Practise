package programming_assignment;

public class a2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "oooo----hhhh----oooo";
//		 res;
		for(int i = 0; i < s.length(); i++) {
			
			char ch = s.charAt(i);
			if(ch == 'h') {
				s =  s.replace(ch, 's');
			}
		}
		System.out.println(s);

	}

}
