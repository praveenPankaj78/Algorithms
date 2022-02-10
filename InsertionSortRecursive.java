package algorithms;

import java.util.Arrays;

public class InsertionSortRecursive {

	public InsertionSortRecursive() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		int[] arr = {3, 41, 52, 26, 38, 57, 9, 49};
		insertionSort(arr, arr.length-1);
		System.out.println(Arrays.toString(arr));

	}
	
	// Takes argument array and the last index
	private static void insertionSort(int[] arr, int n) {
		if(n > 0) {
			insertionSort(arr, n-1);
			insertLast(arr, n);
		}
	}

	private static void insertLast(int[] arr, int n) {
		for(int i = n-1; i > -1; --i) {
			if(arr[i] < arr[i+1]) {
				break;
			}
			
			int last = arr[i+1];
			arr[i+1] = arr[i];
			arr[i] = last;
			
		}
		
	}

}
