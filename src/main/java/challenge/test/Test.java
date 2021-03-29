package challenge.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Test {
	static boolean isUniqueChars(String str) {
		int checker = 0;
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i) - 'a';
			System.out.println("checker, " + Integer.toBinaryString(checker));
			System.out.println("1 << val, " + Integer.toBinaryString(1 << val));
			System.out.println("checker & (1 << val), " + Integer.toBinaryString(checker & (1 << val)));
			
			if ((checker & (1 << val)) > 0) {
				return false;
			}
			checker |= (1 << val);
			System.out.println("checker |= (1 << val), " + Integer.toBinaryString(checker |= (1 << val)));
			System.out.println("---------------------------");
		}
		return true;
	}
	
	public void task() {
		while (true) {
			System.out.println("My name is ...");
			
			if (true) break;
		}
	}

	public static void main(String[] args) {
//		System.out.println(isUniqueChars("abcdea"));
//		new Test().task();
		
		List<String> words = new ArrayList<String>();
		words.add("a");
		words.add("a");
		words.remove("b");
		
		System.out.println(words);
		System.out.println(words.size());
	}
}
