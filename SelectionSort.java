package algorithms;

import java.util.Arrays;

public class SelectionSort {

	public SelectionSort() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,5,3,8,10,6,0};
		
		sortSelection(arr);
		
	}

	private static void sortSelection(int[] arr) {
		// TODO Auto-generated method stub
		for(int i = 0; i < arr.length - 1; i++) {
			int small = arr[i];
			int index = i;
			
			for(int j = i+1; j<arr.length; j++) {
				if(arr[j] < small) {
					small = arr[j];
					index = j;
				}
			}
			
			arr[index] = arr[i];
			arr[i] = small;
			
			System.out.println(Arrays.toString(arr));
			
		}
	}

}
