package algorithms;


// To search for an element in a sorted element.
// Iterative algorithm uses loop without recursion
public class BinarySearchIterative {

	public BinarySearchIterative() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,5,10,15,18,30,90,100,120};
		findIndexOf(arr, 15);
		
		int[] arr2 = {0};
		findIndexOf(arr2, 0);
		
	}

	// Binary Search Iterative
	private static void findIndexOf(int[] arr, int n) {
		// TODO Auto-generated method stub
		boolean isAvailable = true;
		int start_index = 0;
		int end_index = arr.length -1;
		int index = (start_index + end_index)/2;
		
		while(isAvailable ) {
			
			if(arr[index] == n) {
				break;
			}
			else if(start_index >= end_index) {
				isAvailable = false;
				break;
			}
			else if(arr[index] > n) {
				end_index = index;
			}
			else{
				if(end_index - start_index == 1) {
					start_index = end_index;
				}
				else {
					start_index = index;
				}
				
			}
			
			index = (start_index + end_index)/2;
			
		}
		
		if(isAvailable) {
			System.out.println("Index of " + n + " is: " + index);
		}
		else {
			System.out.println("No index for " + n + " found in array.");
		}
		
	}

}
