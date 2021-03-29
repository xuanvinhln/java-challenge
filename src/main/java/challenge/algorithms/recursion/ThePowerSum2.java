package challenge.algorithms.recursion;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ThePowerSum2 {
	
	public static int count;
	public static int targetValue;
	
	public static void check(int X, int N, int start, int end) {
		if (X == targetValue) {
			count++;
			
		} else if (X < targetValue) {
			for (int i=start; i<=end; i++) {
				int value = (int) Math.pow(i, N);
				
				check(X + value, N, i + 1, end);
			}
		}
		
		return ;
	}
	
    // Complete the powerSum function below.
    static int powerSum(int X, int N) {
    	int result = 0;
    	count = 0;
    	targetValue = X;
    	
		double pow = (double) 1/N;
		int maxValue = (int) Math.round(Math.pow(X, pow));
    	
    	check(0, N, 1, maxValue);

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
        System.out.println(result);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
