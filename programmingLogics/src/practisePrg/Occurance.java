package practisePrg;

public class Occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello mam how are you?";
		for (int i = 0; i < str.length(); i++) {
			char[] ch = str.toCharArray();
			if(ch[i] == 'h') {
				System.out.println(i + "=>" + ch[i]);
			}
		}

	}
}
