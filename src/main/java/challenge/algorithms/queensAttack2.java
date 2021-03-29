package challenge.algorithms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class queensAttack2 {

	public static int attackUp(int n, int r_q, int c_q, Set<Long> setObstacles) {
		int count = 0;
		
		int j1 = c_q - 1;
		int j2 = c_q;
		int j3 = c_q + 1;
		
		for (int i=r_q+1; i<n+1; i++) {
			long value;
			
			if (j1 != 0) {
				value = (long) (i) * n + j1;
				if (setObstacles.contains(value)) {
					j1 = 0;
				} else {
					count++;
					j1--;
				}
			}
			
			if (j2 != 0) {
				value = (long) (i) * n + j2;
				if (setObstacles.contains(value)) {
					j2 = 0;
				} else {
					count++;
				}
			}
			
			if (j3 != n+1) {
				value = (long) (i) * n + j3;
				if (setObstacles.contains(value)) {
					j3 = n+1;
				} else {
					count++;
					j3++;
				}
			}
		}
		
		return count;
	}
	
	
	public static int attackDown(int n, int r_q, int c_q, Set<Long> setObstacles) {
		int count = 0;
		
		int j1 = c_q - 1;
		int j2 = c_q;
		int j3 = c_q + 1;
		
		for (int i=r_q-1; i>0; i--) {
			long value;
			
			if (j1 != 0) {
				value = (long) (i) * n + j1;
				if (setObstacles.contains(value)) {
					j1 = 0;
				} else {
					count++;
					j1--;
				}
			}
			
			if (j2 != 0) {
				value = (long) (i) * n + j2;
				if (setObstacles.contains(value)) {
					j2 = 0;
				} else {
					count++;
				}
			}
			
			if (j3 != n+1) {
				value = (long) (i) * n + j3;
				if (setObstacles.contains(value)) {
					j3 = n+1;
				} else {
					count++;
					j3++;
				}
			}
		}
		
		return count;
	}
	
	
	public static int attackHorizontal(int n, int r_q, int c_q, Set<Long> setObstacles) {
		int count = 0;
		
		int i = r_q;
		int j1 = c_q - 1;
		int j3 = c_q + 1;
		
		long value;
		
		while (j1 != 0 || j3 != n+1) {
			if (j1 != 0) {
				value = (long) (i) * n + j1;
				if (setObstacles.contains(value)) {
					j1 = 0;
				} else {
					count++;
					j1--;
				}
			}
			
			if (j3 != n+1) {
				value = (long) (i) * n + j3;
				if (setObstacles.contains(value)) {
					j3 = n+1;
				} else {
					count++;
					j3++;
				}
			}
		}
		
		return count;
	}
	
	
	// Complete the queensAttack function below.
    static int queensAttack(int n, int k, int r_q, int c_q, int[][] obstacles) {
    	int result = 0;
    	
    	Set<Long> setObstacles = new HashSet<Long>();
    	for (int i=0; i<k; i++) {
    		long value = (long) (obstacles[i][0]) * n + obstacles[i][1];
    		setObstacles.add(value);
    	}

    	System.out.println("abc");
    	result = attackDown(n, r_q, c_q, setObstacles) + attackHorizontal(n, r_q, c_q, setObstacles) + attackUp(n, r_q, c_q, setObstacles);
    	
    	return result;
    }

//    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    	Scanner scanner = new Scanner(new BufferedReader(new FileReader("data/input.txt")));
    	
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("data/output.txt"));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        String[] r_qC_q = scanner.nextLine().split(" ");

        int r_q = Integer.parseInt(r_qC_q[0]);

        int c_q = Integer.parseInt(r_qC_q[1]);

        int[][] obstacles = new int[k][2];

        for (int i = 0; i < k; i++) {
            String[] obstaclesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 2; j++) {
                int obstaclesItem = Integer.parseInt(obstaclesRowItems[j]);
                obstacles[i][j] = obstaclesItem;
            }
        }

        int result = queensAttack(n, k, r_q, c_q, obstacles);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}