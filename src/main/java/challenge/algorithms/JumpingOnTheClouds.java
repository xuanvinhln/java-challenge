package challenge.algorithms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class JumpingOnTheClouds {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
    	int jumps = 0;
    	int cur = 0;
    	int length = c.length - 1;
    	
    	while (cur != length) {
    		if (cur + 2 <= length) {
    			if (c[cur + 2] == 0) {
    				cur += 2;
    			} else {	    		
    				cur += 1;
    			}
    		} else {
    			cur += 1;
    		}
    		
    		jumps += 1;
    	}
    	
		return jumps;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
