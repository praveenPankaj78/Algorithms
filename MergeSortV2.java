package algorithms;

import java.util.Arrays;

public class MergeSortV2 {

	public MergeSortV2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {3, 41, 52, 26, 38, 57, 9, 49};
		mergeSort(arr, 0, arr.length-1);
		
		System.out.println(Arrays.toString(arr));

	}
	
	private static void merge(int[] arr, int p, int q, int r) {
		int n1 = q-p+1;
		int n2 = r-q;
		
		int[] left = new int[n1];
		int[] right = new int[n2];
		
		// Putting sentinel value
//		left[n1] = Integer.MAX_VALUE;
//		right[n2] = Integer.MAX_VALUE;
		
		for(int i = 0; i < n1; i++) {
			left[i] = arr[p+i];
		}
		
		for(int i = 0; i < n2; i++) {
			right[i] = arr[q+1+i];
		}
		
		int j = 0;
		int k = 0;
		boolean isLeftEmpty = false;
		boolean isRightEmpty = false;
		
		for(int i = 0; i < r-p+1; i++) {
			
			if(isLeftEmpty) {
				arr[p+i] = right[k];
				++k;
				continue;
			}
			
			if(isRightEmpty) {
				arr[p+i] = left[j];
				j++;
				continue;
			}
			
			if(left[j] < right[k]) {
				arr[p+i] = left[j];
				j++;
			}
			else {
				arr[p+i] = right[k];
				++k;
			}
			
			// End of Left array
			if(j == n1) {
				isLeftEmpty = true;
			}
			// End of right array
			if(k == n2) {
				isRightEmpty = true;
			}

		}
		
	}
	
	private static void mergeSort(int[] arr, int p, int r) {
		
		if(r > p) {
			int q = (p+r)/2;
			
			mergeSort(arr, p, q);
			mergeSort(arr, q+1, r);
			merge(arr, p, q, r);
		}
		
	}

}
