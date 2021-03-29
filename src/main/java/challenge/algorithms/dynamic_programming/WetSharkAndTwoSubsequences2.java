package challenge.algorithms.dynamic_programming; 

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WetSharkAndTwoSubsequences2 {
    public static boolean[][] dp;
    public static int countFalse;
//    public static ArrayList<Integer> resultList = new ArrayList<Integer>();
    public static int[] countBySize;
    
    static boolean check(int[] x, int sum, int startIndex, int numElement, int level) {
    	if (startIndex > 97) {
    		System.out.println("start: " + startIndex);
//    		System.out.println(sum);
    	}
    	
//    	System.out.println("--> level: " + level);
    	try {
//    		System.out.println(sum + " " + startIndex + " " + dp[sum][startIndex]);
    	} catch (Exception e) {
			// TODO: handle exception
		}
    	
    	if (sum < 0) {
    		return false;
    	}
    	
    	boolean isSubsetSum = false;
    	
        if (sum == 0 && numElement > 0) {
            countBySize[numElement]++;
//            	System.out.println("-----------------------------Tong den bay gio la: " + count + "   " + numElement);
//            	System.out.println(resultList.toString());
            return true;
        }
            
       	if (dp[sum][startIndex] == false) {
//       		countFalse++;
//       		if (countFalse % 10000000 == 0) {
//       			System.out.println("FALSE " + countFalse);
//       		}
       		
    		return false; 
    	}
    	
        for (int i = startIndex; i < x.length; i++) {
            if (sum - x[i] >= 0) {
//            	System.out.println("try sum = " + sum + "; x["+i+"] = " + x[i]);
//            	resultList.add(x[i]);
            	boolean ok = check(x, sum - x[i], i + 1, numElement + 1, level + 1);
//            	resultList.remove(numElement);
            	
            	isSubsetSum = isSubsetSum || ok; 
            } else {
//            	System.out.println("skip sum = " + sum + "; x["+i+"] = " + x[i]);
            }
        }

        if (isSubsetSum == false) {
	        countFalse++;
	   		if (countFalse % 100 == 0) {
	   			System.out.println("FALSE " + countFalse);
	   		}
        }
        
        dp[sum][startIndex] = isSubsetSum;
//        System.out.println("isSubsetSum: " + isSubsetSum);
//        System.out.println("Set: " + sum + " " + startIndex + " " + dp[sum][startIndex]);
//        System.out.println("backtrack <-------------- \n");
        
        return isSubsetSum;
    }
    

    static int[] numArraySumEqualConstant(int[] x, int sum) {
        int num[];
        
        countFalse = 0;
        int length = x.length;
        countBySize = new int[length + 1];
        
        dp = new boolean[sum + 1][length + 1];
        for (int i = 1; i < sum + 1; i++) {
        	for (int j = 0; j < length; j++) {
				dp[i][j] = true;
			}
		}
        
        check(x, sum, 0, 0, 0);
        
        num = countBySize;
        
        return num;
    }
    

    static int twoSubsequences(int[] x, int r, int s) {
        int result = 0;
        
        int sumA = (r + s) / 2;
        int sumB = (r - s) / 2;
        
        int m[] = numArraySumEqualConstant(x, sumA).clone();
//        int n[] = numArraySumEqualConstant(x, sumB).clone();

//        for (int i = 0; i < n.length; i++) {
//        	result += (m[i] * n[i]) % 1000000007;
//		}
        
        return result;
    }
    
//    private static final Scanner scanner = new Scanner(System.in);

    
    public static void main(String[] args) throws IOException {
    	Scanner scanner = new Scanner(new FileReader("data/input.txt"));
    	
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
    	BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("data/output.txt"));

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

        System.out.println("start");
        int result = twoSubsequences(x, r, s);
        System.out.println(result);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
