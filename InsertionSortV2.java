package algorithms;

import java.util.Arrays;

// This uses insertion sort along with binary search reducing the complexity to nlog(n)
public class InsertionSortV2 {

	public InsertionSortV2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {3, 41, 52, 26, 38, 57, 9, 49};
		insertionSortModified(arr, arr.length-1);
		System.out.println(Arrays.toString(arr));
		
		int[] arr2 = {0};
		insertionSortModified(arr2, arr2.length-1);
		System.out.println(Arrays.toString(arr2));
	}

	private static void insertionSortModified(int[] arr, int n) {
		// TODO Auto-generated method stub

		if(n > 0) {
			insertionSortModified(arr, n-1);
			
			int insert_index = findIndexFor(arr, n);
			sortSubarray(arr, insert_index, n);
		}
	
	}
	
	private static void sortSubarray(int[] arr, int start_index, int end_index) {
		// TODO Auto-generated method stub
		
		if(start_index != end_index) {
			int prev = arr[start_index];
			int next = arr[start_index+1];
			
			
			for(int i = start_index; i < end_index; i++) {				
				arr[i + 1] = prev;
				prev = next;
				
				if(i != end_index -1) {
					next = arr[i+2];
				}
			}
			
			arr[start_index] = prev;
		}
	}

	// Using iterative binary search to look for position to insert arr[n]
	private static int findIndexFor(int[] arr, int n) {
		
		int start_index = 0;
		int end_index = n-1;
		int index = 0;
		int mid = (start_index + end_index)/2;
		
		while(true) {
			if(arr[n] > arr[end_index]) {
				index = end_index + 1;
				break;
			}
			else if(arr[n] < arr[start_index]) {
				index = start_index;
				break;
			}
			else {
				if(arr[n] < arr[mid]) {
					end_index = mid;
				}
				else {
					if(end_index - start_index == 1) {
						start_index = end_index;
					}
					else {
						start_index = mid;
					}
				}
				
				mid = (start_index + end_index)/2;
				
			}
			
		}
		
		return index;
		
	}

}
