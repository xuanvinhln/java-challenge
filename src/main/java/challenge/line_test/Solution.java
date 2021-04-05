package challenge.line_test;

import java.util.HashSet;

public class Solution {
	public int solution(int X, int[] A) {
		HashSet<Integer> hashSet = new HashSet<>();
		for (int i = 1; i <= X; i++) {
			hashSet.add(i);
		}

		for (int i = 0; i < A.length; i++) {
			hashSet.remove(A[i]);
			if (hashSet.size() == 0) {
				return i;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		int[] A = { 1, 2, 3, 4, 5 };
		int X = 3;

		Solution a = new Solution();
		int result = a.solution(X, A);

		System.out.println(result);
	}
}
