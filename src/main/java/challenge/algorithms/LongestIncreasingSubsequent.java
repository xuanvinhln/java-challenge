package challenge.algorithms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class LongestIncreasingSubsequent {

	static int longestIncreasingSubsequence2(int[] arr) {
		int result = 0;
		int length = arr.length;
		
		int[][] L = new int[length][length];
		for (int j=0; j<length; j++) {
			if (arr[0] <= arr[j]) {
				L[0][j] = 1;
			}
		}

		for (int i = 1; i < length; i++) {
			for (int j = 0; j < length; j++) {
				if (arr[j] < arr[i]) {
					L[i][j] = L[i - 1][j];
				} else {
					if (arr[j] > arr[i]) {
						L[i][j] = Math.max(L[i - 1][i] + 1, L[i - 1][j]);
					} else {
						L[i][j] = L[i - 1][j];
					}
				}
			}
		}

		int max = 0;
		for (int j=0; j<length; j++) {
			max = Math.max(L[length-1][j], max);
		}
		
		result = max;
		return result;
	}
	
	
	static int longestIncreasingSubsequence(int[] arr) {
		int result = 0;
		int length = arr.length;
		int L[] = new int[length];
		L[0] = 1;
		result = L[0];

		for (int i = 1; i < length; i++) {
			int max = 1;

			for (int j = 0; j < i; j++) {
				if (arr[i] > arr[j]) {
					max = Math.max(max, L[j] + 1);
				}
			}

			L[i] = max;
			result = Math.max(result, L[i]);
		}

		return result;
	}

	
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(new BufferedReader(new FileReader("data/input.txt")));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			int arrItem = scanner.nextInt();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
			arr[i] = arrItem;
		}

		int result = longestIncreasingSubsequence2(arr);

		System.out.println(result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

		scanner.close();
	}
}
