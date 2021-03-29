package challenge.data_structures.string_arrays;

import java.util.Arrays;

public class CheckPermutation {
	private static String sort(String s) {
		char c[] = s.toCharArray();
		
		Arrays.sort(c);
		
		return new String(c);
	}
	
	public static boolean permutation(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		
		return sort(s).equals(sort(t));
	}
	
	public static boolean permutation2(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		
		int letter[] = new int[256];
		
		for (int i=0; i < s.length(); i++) {
			letter[s.charAt(i)]++;
		}
		
		for (int i=0; i < t.length(); i++) {
			char c = t.charAt(i);
			letter[c]--;
			
			if (letter[c] < 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(permutation2("abc", "bca"));
	}
}
