package challenge.test;
import java.util.Arrays;

public class ArrModulo {
	public static int sequenceElement(int[] a, int n) {
		int temp = 0;

		for (int i=5; i<n+1; i++) {
			temp = (a[0] + a[1] + a[2] + a[3] + a[4]) % 10;
			int idx = (i-5) % 5;
			a[idx] = temp;
		}

		return temp;
	}
	
	public static void main(String[] args) {
		int[] a = new int[5];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		int n = 9;
		
		System.out.println(sequenceElement(a, n));
	}
}
