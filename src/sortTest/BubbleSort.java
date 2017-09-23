package sortTest;

/**
 * bubble sort
 * @author Kellan
 * 2017年9月23日
 */
public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = { 1,2,3,4,5,6,7,8,9 };
		print(arr,0);
		sort(arr);
	}
	
	//这种冒泡是 前置冒泡 将每回与第一个待排序的数比较，如果比它小/大，则交换
	public static void sort(int[] arr) {
		int tmp;
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[j] > arr[i]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
			print(arr,i+1);
		}
	}
	
	//这种冒泡是后置冒泡，将最大或最小的一直冒泡至最后
	public static void sort2(int[] arr) {
		int tmp;
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-i-1; j++) {
				if (arr[j+1] > arr[j]) {
					tmp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = tmp;
				}
			}
			print(arr,i+1);
		}
	}
	
	public static void print(int[] arr, int i) {
		System.out.print(i+" time: ");
		for (int j = 0; j < arr.length; j++)System.out.print(" "+arr[j]);
		System.out.println();
	}
}
