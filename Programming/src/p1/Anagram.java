package p1;
import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s1 = "palm";
		String s2 = "lamp";
		char[] ch = s1.toCharArray();
		char[] bh = s2.toCharArray();
		Arrays.sort(bh);
		Arrays.sort(ch);
		if(Arrays.equals(ch, bh)) {
			System.out.println("Is anagram");
		}
		else {
			System.out.println("Not anagram");
		}

	}

}
