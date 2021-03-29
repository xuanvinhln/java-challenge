package challenge.algorithms.dynamic_programming;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WetSharkAndTwoSubsequences {
	
	static int mod = 1000000007;

	
	static long[][] numArraySumEqualConstant (int[] x, int sum) {
		int length = x.length;
		int lengthPlus = length + 1;
		
		long[][] result = new long[lengthPlus][sum];
		
		long[][][] f = new long[lengthPlus][lengthPlus][sum + 1];
		f[0][0][0] = 1;
		
		for (int i = 1; i < lengthPlus; i++) {
			for (int j = 0; j < lengthPlus; j++) {
				for (int k = 0; k < sum + 1; k++) {
					
					if (i-1 < 0) {
						f[i][j][k] = 0;
						continue;
					}

					if (j-1 < 0 || k-x[i-1] < 0) {
						f[i][j][k] = f[i-1][j][k] % mod;
						continue;
					}
					
					f[i][j][k] = (f[i-1][j][k] + f[i-1][j-1][k - x[i-1]]) % mod;
				}
			}
		}
		
		for (int i = 0; i < lengthPlus; i++) {
			result[i] = f[length][i].clone();
		}
		
		return result;
	}
	
	
	static long twoSubsequences(int[] x, int r, int s) {
		long result = 0;
		
		if (r < s || (r + s) % 2 != 0) {
			return 0;
		}
		
		int sumA = (r + s) / 2;
        int sumB = (r - s) / 2;
                
		long m[][] = numArraySumEqualConstant(x, sumA);
		
		for (int i = 1; i < m.length; i++) {
			result += m[i][sumA] * m[i][sumB];
			result %= mod;
		}
		
		return result;
    }

	
//    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    	Scanner scanner = new Scanner(new FileReader("data/input.txt"));
    	
//      BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
    	BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("data/output.txt"));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] mrs = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mrs[0].trim());

        int r = Integer.parseInt(mrs[1].trim());

        int s = Integer.parseInt(mrs[2].trim());

        int[] x = new int[m];

        String[] xItems = scanner.nextLine().split(" ");

        for (int xItr = 0; xItr < m; xItr++) {
            int xItem = Integer.parseInt(xItems[xItr].trim());
            x[xItr] = xItem;
        }

        long result = twoSubsequences(x, r, s);
        System.out.println(result);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
