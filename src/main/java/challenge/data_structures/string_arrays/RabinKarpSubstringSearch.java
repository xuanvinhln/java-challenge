package challenge.data_structures.string_arrays;

public class RabinKarpSubstringSearch {
	private static long hashFunc(String s) {
		long hashCode = 0;
		int length = s.length();
		
		for (int i = 0; i < length; i++) {
			char c = s.charAt(i);
			
			hashCode = hashCode * 128 + c;
		}
		
		return hashCode;
	}
	
	private static long hashFunc(long hashCode, char remove, char add, long factorRemove) {
		
		hashCode = (hashCode - remove * factorRemove) * 128 + add; 
		
		return hashCode;
	}
	
	private static int rabinKarpSearch(String s, String pattern) {
		int m = pattern.length();
		
		long factorRemove = 1;
		for (int i = 0; i < m - 1; i++) {
			factorRemove *= 128;
		}
		
		long hashCodeTrue = hashFunc(pattern);
		long hashCodeCurrent = -1;
		
		for (int i = 0; i < (s.length() - m ); i++) {
			if (i > 0) {
				hashCodeCurrent = hashFunc(hashCodeCurrent, s.charAt(i-1), s.charAt(i + m - 1), factorRemove);
			} else {
				hashCodeCurrent = hashFunc(s.substring(i, m));
			}
			
			if (hashCodeTrue == hashCodeCurrent) {
				if (s.substring(i, i + m).equals(pattern)) {
					return i + 1;
				}
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		String s = "chuxuanvinh abc";
		String pattern = "h a";
		
		System.out.println(rabinKarpSearch(s, pattern));
	}
}
