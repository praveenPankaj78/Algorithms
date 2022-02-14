package algorithms;

import java.util.ArrayList;
import java.util.Collections;

public class HeapSortRecursive {

	public HeapSortRecursive() {
		// TODO Auto-generated constructor stub
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(5);
		arr.add(3);
		arr.add(17);
		arr.add(10);
		arr.add(84);
		arr.add(19);
		arr.add(6);
		arr.add(22);
		arr.add(9);
		
		System.out.println(arr);
		heapSort(arr);
		System.out.println(arr);
		
	}

	private static void heapSort(ArrayList<Integer> arr) {
		// TODO Auto-generated method stub
		maxHeap(arr);
		System.out.println(arr);
		for(int i = arr.size()-1; i > 0; --i) {
			Collections.swap(arr, 0, i);
			
			// Don't heapify for the last element
			if(i != 1) {
				heapify(arr, 0, i-1);
			}
		}
	}

	private static void heapify(ArrayList<Integer> arr, int startIndex, int endIndex) {
		// TODO Auto-generated method stub
		
		if(endIndex > startIndex) {
		
			while(startIndex <= (endIndex-1)/2) {
				
				// If right child node doesn't exist
				if(2*startIndex + 2 > endIndex) {
					if(arr.get(startIndex) < arr.get(2*startIndex + 1)) {
						Collections.swap(arr, startIndex, 2*startIndex + 1);
						startIndex = 2*startIndex + 1;
					}
					else {
						break;
					}
				}
				else {
					// If both left and right child exist
					// If left child is greatest
					if(arr.get(startIndex) < arr.get(2*startIndex + 1) && arr.get(2*startIndex + 2) <= arr.get(2*startIndex + 1)) {
						Collections.swap(arr, startIndex, 2*startIndex + 1);
						startIndex = 2*startIndex + 1;
					}
					// If right child is greatest
					else if(arr.get(startIndex) < arr.get(2*startIndex + 2) && arr.get(2*startIndex + 1) <= arr.get(2*startIndex + 2)) {
						Collections.swap(arr, startIndex, 2*startIndex + 2);
						startIndex = 2*startIndex + 2;	
					}
					else {
						break;
					}
				}
				
			}
		
		}
	}

	private static void maxHeap(ArrayList<Integer> arr) {
		// TODO Auto-generated method stub
		// This function initializes the array and makes it a max heap
		for(int i = (arr.size() -1)/2; i >= 0; --i) {
			
			// If it has no child node
			if(2*i + 1 > arr.size() -1) {
				continue;
			}
			// if it has only left child node
			else if(2*i + 2 > arr.size() -1) {
				if(arr.get(i) < arr.get(2*i + 1)) {
					Collections.swap(arr, i, 2*i + 1);
					heapify(arr, 2*i + 1, arr.size()-1);
				}
			}
			// If it has both child nodes
			else {
				if(arr.get(i) < arr.get(2*i + 1) && arr.get(2*i + 2) <= arr.get(2*i + 1)) {
					Collections.swap(arr, i, 2*i + 1);
					heapify(arr, 2*i + 1, arr.size()-1);
				}
				else if(arr.get(i) < arr.get(2*i + 2) && arr.get(2*i + 1) <= arr.get(2*i + 2)) {
					Collections.swap(arr, i, 2*i + 2);
					heapify(arr, 2*i + 2, arr.size()-1);
				}
			}
		}
		
	}

}
