package challenge.algorithms.recursion;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ThePowerSum {
	
	public static int count;
	
	public static void check(int X, int N, int start) {
		if (X == 0) {
			count++;
			
		} else {
			double pow = (double) 1/N;
			int maxValue = (int) Math.round(Math.pow(X, pow));
			
			for (int i=start; i<=maxValue; i++) {
				int value = (int) Math.pow(i, N);

				if (value <= X) {
					check(X - value, N, i + 1);
				} else {
				}
			}
		}
	}
	
    // Complete the powerSum function below.
    static int powerSum(int X, int N) {
    	int result = 0;
    	count = 0;
    	
    	check(X, N, 1);

    	result = count;
    	return result;
    }
    

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int X = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = powerSum(X, N);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
