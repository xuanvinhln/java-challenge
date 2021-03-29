package challenge.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Test {
	
	public static void method1(int[] a) {
		a[1] = 10;
		
		return ;
	}
	
	public static void main(String[] args) {
//		int[][] a = {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}};
		
		int[] a = {8, 1, 6};
		
//		method1(a);
		int[] b = a.clone();
		
		a[0] = 5;
		int ab = 100000;
		int c = 100000;
		long abc = (long) (ab) * c;
		
		double pow = (double) 1 / 3;
		System.out.println(Math.cbrt(-27));
		
		Random random = new Random();
		for (int i=0; i<10; i++) {
			System.out.println(random.nextInt(10));
		}
		
		
		Class test = Arrays.class;
		System.out.println(test.getClassLoader());
		
		 // create an empty array list with an initial capacity 
        ArrayList<Integer> arrlist = new ArrayList<Integer>(5); 
  
        // use add() method to add elements in the list 
        arrlist.add(15); 
        arrlist.add(20); 
        arrlist.add(25); 
  
        // prints all the elements available in list 
//        System.out.println(arrlist);
	}
}
