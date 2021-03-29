package challenge.algorithms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class sherlockAndCost {

    // Complete the cost function below.
    static int cost(int[] B) {
		int[][] D = new int[100000][2];
    	int value00 = Math.abs(1 - 1);
		int value01 = Math.abs(1 - B[0]);
		D[1][0] = Math.max(value00, value01);
		
		int value10 = Math.abs(B[1] - 1);
		int value11 = Math.abs(B[1] - B[0]);
		D[1][1] = Math.max(value10, value11);
    	
    	int length = B.length;
    	
    	for (int i=2; i<length; i++) {
    		value00 = D[i-1][0] + Math.abs(1 - 1);
    		value01 = D[i-1][1] + Math.abs(1 - B[i-1]);
			D[i][0] = Math.max(value00, value01);
			
			value10 = D[i-1][0] + Math.abs(B[i] - 1);
    		value11 = D[i-1][1] + Math.abs(B[i] - B[i-1]);
			D[i][1] = Math.max(value10, value11);
    	}
    	
    	int result = Math.max(D[length-1][0], D[length-1][1]);
    	
    	return result;
    }


    public static void main(String[] args) throws IOException {
    	Scanner scanner = new Scanner(System.in);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] B = new int[n];

            String[] BItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int BItem = Integer.parseInt(BItems[i]);
                B[i] = BItem;
            }

            int result = cost(B);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
