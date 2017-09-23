package sortTest;

import java.util.Arrays;

public class QuickSort {
	
	
	public static int partition(int[] arr, int low, int hig) {
		int key = arr[low];
		while(low < hig) {
			while(low < hig && key < arr[hig]) hig--;
			arr[low] = arr[hig];
			
			while(low < hig && arr[low] < key) low++;
			arr[hig] = arr[low]; 
		}
		arr[low] = key;
		return low;
	}
	
	
	public static void quickSort(int[] arr,int start, int end) {
		if(start >= end) return;
		int index = partition(arr, start, end);
		quickSort(arr, start, index-1);
		quickSort(arr, index+1, end);
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 4, 8, 0, 3, 7, 9, 5, 2, 6};
		quickSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

}
