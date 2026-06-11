package p1;

public class Prac1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//K||1||A||2||C||1
		//0  1  2  3  4  5
		//Expected o/p: KAAC
		String s1 = "K1A2C1";
		for(int i = 0; i<s1.length();i++) {
			if(Character.isAlphabetic(s1.charAt(i))) {
				System.out.println(s1.charAt(i));
			}
			else {
				int n = Character.getNumericValue(s1.charAt(i));
//				System.out.println(i);
				for(int j = 1; j < n; j++) {
//					System.out.println(i-1);
					System.out.println(s1.charAt(i-1));
				}
			}
		}

	}

}
