package challenge.algorithms.sorting;

import java.util.Arrays;

public class MergeSort {
	public static void sort(int[] arr, int l, int r) {
		int m = (l + r) / 2;
		
		if (l < r) {
			sort(arr, l, m);
			sort(arr, m + 1, r);
			merge(arr, l, m, r);
		}
	}
	
	/*
	 * arr: input data
	 * Left arr: arr[l, m]
	 * Right arr: arr[m+1, r]
	 */
	public static void merge(int[] arr, int l, int m, int r) {
		int[] arrNew = new int[r - l + 1];
		
		int i = l;
		int j = m + 1;
		int k = 0;
		while (i <= m && j <= r) {
			if (arr[i] <= arr[j]) {
				arrNew[k] = arr[i];
				i++;
				k++;
			} else {
				arrNew[k] = arr[j];
				j++;
				k++;
			}
		}
		
		while (i <= m) {
			arrNew[k] = arr[i];
			i++;
			k++;
		}
		
		while (j <= r) {
			arrNew[k] = arr[j];
			j++;
			k++;
		}
		
		k = 0;
		for (i = l; i <= r; i++) {
			arr[i] = arrNew[k];
			k++;
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 9, 3, 4, 6, 7, 8, 9, 1, 2, 3, 4, 5};
		
		MergeSort.sort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}
}
