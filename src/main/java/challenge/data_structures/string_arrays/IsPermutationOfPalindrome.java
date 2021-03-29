package challenge.data_structures.string_arrays;

public class IsPermutationOfPalindrome {
	public boolean isPermutationOfPalindrome(String s) {
		int bitVector = createBitVector(s);
		return (bitVector == 0) || checkExactlyOneBitSet(bitVector);
	}

	private int createBitVector(String s) {
		int bitVector = 0;
		
		for (int i = 0; i < s.length(); i++) {
			int index = getCharNumber(s.charAt(i));
			bitVector = toggle(bitVector, index); 
		}
		
		return bitVector;
	}

	private int getCharNumber(Character c) {
		int a = Character.getNumericValue('a');
		int z = Character.getNumericValue('z');
		int val = Character.getNumericValue(c);
		if (a <= val && val <= z) {
			return val - a;
		}

		return -1;
	}
	
	private int toggle(int bitVector, int index) {
		if (index < 0) return bitVector;
		
		int mask = 1 << index;
		
		if ((bitVector & mask) == 0) {
			bitVector |= mask;
		} else {
			bitVector &= ~mask;
		}
		
		return bitVector;
	}
	
	private boolean checkExactlyOneBitSet(int bitVector) {
		
		return (bitVector & (bitVector -1)) == 0;
	}
	
	public static void main(String[] args) {
		boolean a= new IsPermutationOfPalindrome().isPermutationOfPalindrome("aabbbccc");
		System.out.println(a);
	}
}
