package challenge.algorithms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class FormingAMagicSquare {

	public static boolean isMagicSquare(int[][] s) {
		int size = s.length;
		int maxValue = size * size;
		int value = maxValue * (maxValue + 1) / 2 / size;

		int sumMainDiagonal = 0;
		int sumAntiDiagonal = 0;
		for (int i = 0; i < size; i++) {
			int sumRow = 0;
			int sumColumn = 0;

			sumMainDiagonal += s[i][i];
			sumAntiDiagonal += s[i][size - i - 1];
			for (int j = 0; j < size; j++) {
				sumRow += s[i][j];
				sumColumn += s[j][i];
			}

			if (sumRow != value || sumColumn != value) {
				return false;
			}
		}

		if (sumMainDiagonal != value || sumAntiDiagonal != value) {
			return false;
		}

		return true;
	}
	

	public static int[][][] listMatrix;
	public static int[][] matrix;
	public static int[] isUsed;
	public static int k;

	
	public static void magicSquare(int n, int size) {
		int maxValue = size * size;

		if (n == maxValue) {
			if (isMagicSquare(matrix)) {
				for (int i=0; i<matrix.length; i++) {
					listMatrix[k][i] = matrix[i].clone();
				}
				
				k++;
			}
		} else {
			int row = n / size;
			int column = n % size;

			for (int i = 1; i < maxValue + 1; i++) {
				if (isUsed[i-1] != 1) {
					FormingAMagicSquare.matrix[row][column] = i;
					FormingAMagicSquare.isUsed[i-1] = 1;
					
					magicSquare(n + 1, size);
					
					FormingAMagicSquare.isUsed[i-1] = 0;
				}
			}
		}
		
		return ;
	}
	
	
	public static void getFormingMagicSquare(int size) {
		int maxValue = size * size;
		k = 0;
		listMatrix = new int[100][size][size];
		matrix = new int[size][size];
		isUsed = new int[maxValue];
		
		magicSquare(0, size);
	}

	
	// Complete the formingMagicSquare function below.
	static int formingMagicSquare(int[][] s) {
		int result = Integer.MAX_VALUE;
		int size = s.length;
		
		for (int i=0; i<k; i++) {
			int cost = 0;
			
			for (int m=0; m<size; m++) {
				for (int n=0; n<size; n++) {
					cost += Math.abs(listMatrix[i][m][n] - s[m][n]);
				}
			}
			
			result = Math.min(cost, result);
		}
		
		return result;
	}

	
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int[][] s = new int[3][3];

		for (int i = 0; i < 3; i++) {
			String[] sRowItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int j = 0; j < 3; j++) {
				int sItem = Integer.parseInt(sRowItems[j]);
				s[i][j] = sItem;
			}
		}
		
		FormingAMagicSquare.getFormingMagicSquare(s.length);
		int result = formingMagicSquare(s);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
