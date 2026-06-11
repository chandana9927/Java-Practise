package com.Practise.Prac;

public class Freq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str = "chessmess";
//		str = str.toLowerCase();
//		int[] a = new int[123];
//		for (int i = 0; i < str.length(); i++) {
//			char ch = str.charAt(i);
//			a[ch]++;
//		}
//		for (int i = 0; i < a.length; i++) {
//			if (a[i] > 0) {
//				System.out.println((char) i + "->" + a[i]);
//			}
//		}
		String s = "That is a tall giraffe and this is a small zebra, I most of all prefer to see elephants!@#%@%#@#***@$!%@";
		int[] a = new int[123];
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
				a[ch]++;
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0 && i>64) { // if (a[i] > 0 && i == 97) FOR PARTICULAR CARACTER. {
				System.out.print((char) i + " -> " + a[i] + "\s");
			}
		}

	}

}

/*
 * a-97, b = 98, c= 99, d = 100, e = 101, f = 102, g = 103, h = 104, i = 105, j
 * = 106, k = 107, l = 108, m = 109, n = 110, o = 111, p = 112, q = 113, r =
 * 114, s = 115, t = 116, u = 117, v = 118, w = 119, x = 120, y = 121, z = 122.
 */
/*range of spcl characters */