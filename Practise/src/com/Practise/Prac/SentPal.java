package com.Practise.Prac;


public class SentPal {
	public static void main(String[] args) {
		String sent = "Racecar Hannah saw cool racecar Level";
		sent = sent.toLowerCase();
		String[] str = sent.split("\\s+");
		int count = 0;
		for(String words : str) {
			if(isPal(words)) {
				System.out.println(words);
				count++;
			}
		}
		System.out.println(count);
	}
	public static boolean isPal(String s) {
		int i = 0;//left
		int n = s.length()-1;//right
		while(i < n) {
			if(s.charAt(i) != s.charAt(n)) {
				return false;
			}
			i++;
			n--;
		}
		
		return true;
	}
}
