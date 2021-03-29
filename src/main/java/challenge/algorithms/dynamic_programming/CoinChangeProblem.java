package challenge.algorithms.dynamic_programming;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

class Result {
	public static int[] arr;
	public static int nums;
	public static long[][] dp;
		
	public static long solve(int start, int amount) {
//		if (amount == 0) {
//			return 1;
//		}
		
		if (amount < 0) {
			return 0;
		}
		
		if (start >= nums) {
			return 0;
		}
		
		if (dp[amount][start] != -1) {
			return dp[amount][start];
		}
		dp[amount][start] = solve(start + 1, amount) + solve(start, amount - arr[start]);
		
		return dp[amount][start];  
	}
	
    /*
     * Complete the 'getWays' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. LONG_INTEGER_ARRAY c
     */
    public static long getWays(int n, List<Long> c) {
    	long result = 0;
    	nums = c.size();
    	arr = new int[nums];
    	dp = new long[n+1][nums];
    	
    	for (int j = 0; j < nums; j++) {
			dp[0][j] = 1;
		}
    	
    	for (int i = 1; i < n+1; i++) {
    		for (int j = 0; j < nums; j++) {
				dp[i][j] = -1;
			}
		}
    	
    	for (int i = 0; i < nums; i++) {
    		arr[i] = c.get(i).intValue();
		}
    	
    	result = solve(0, n);
    	System.out.println(result);
    	return result;
    }
}

public class CoinChangeProblem {
    public static void main(String[] args) throws IOException {
    	Scanner scanner = new Scanner(new FileReader("data/input.txt"));
    	BufferedReader bufferedReader = new BufferedReader(new FileReader("data/input.txt"));
    	BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("data/output.txt"));
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<Long> c = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Long::parseLong)
            .collect(toList());

        // Print the number of ways of making change for 'n' units using coins having the values given by 'c'

        long ways = Result.getWays(n, c);

        bufferedWriter.write(String.valueOf(ways));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
