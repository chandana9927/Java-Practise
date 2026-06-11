package programming_assignment;

public class a1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "PATA PATA";
//		 res;
		for(int i = 0; i < s.length(); i++) {
			
			char ch = s.charAt(i);
			if(ch == 'P') {
				s =  s.replace(ch, 'T');
			}
		}
		System.out.println(s);

	}

}
