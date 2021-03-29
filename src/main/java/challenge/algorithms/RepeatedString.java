package challenge.algorithms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RepeatedString {
	
	static int numCharInString(String s, char a) {
		int num = 0;
		char[] sArr = s.toCharArray();
		
		for (int i=0; i<sArr.length; i++) {
			if (a == sArr[i]) {
				num++;
			}
		}
		
		return num;
	}

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
    	long count = 0;
    	int length = s.length();
    	
    	long count1 = n / length;
    	int count2 = (int) (n % length);
    	
    	int num1 = numCharInString(s, 'a');
    	int num2 = numCharInString(s.substring(0, count2), 'a');
    	    	
    	count = num1 * count1 + num2;
		return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}