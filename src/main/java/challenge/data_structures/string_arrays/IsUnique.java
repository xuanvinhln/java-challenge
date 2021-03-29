package challenge.data_structures.string_arrays;

public class IsUnique {
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

	public static void main(String[] args) {
		System.out.println(isUniqueChars("abcdea"));
	}
}
