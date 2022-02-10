package algorithms;

public class BinarySearchRecursive {

	public BinarySearchRecursive() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,5,10,15,18,30,90,100,120};
		findIndexOf(arr, 100, 0, arr.length-1);
		
		int[] arr2 = {0};
		findIndexOf(arr2, 0, 0, arr2.length-1);

	}

	// Binary Search Recursive
	private static void findIndexOf(int[] arr, int n, int start_index, int end_index) {
		// TODO Auto-generated method stub
		int index = (start_index + end_index)/2;
		if(arr[index] == n) {
			System.out.println("Index of " + n + " is: " + index);
		}
		else {		
			if(start_index >= end_index) {
				System.out.println("No index for " + n + " found in array.");
			}
			else {
				if(arr[index] > n) {
					end_index = index;
				}
				else {
					if(end_index - start_index == 1) {
						start_index = end_index;
					}
					else {
						start_index = index;
					}
				}
				
				findIndexOf(arr, n, start_index, end_index);
				
			}
		}
		
	}

}
