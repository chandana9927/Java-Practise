package p1;

public class CountConsonants {
	static void consonants(String s) {
//		String s = "India";
		s = s.toLowerCase();
		int count = 0;
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
//				System.out.println(ch);
				count++;
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		consonants("ThisConsonants");

	}

}
