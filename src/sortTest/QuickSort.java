package sortTest;

import java.util.Arrays;

/**
 * quick sort
 * @author Kellan
 * 2017年9月24日
 */
public class QuickSort {
	
	
	public static int partition(int[] arr, int low, int hig) {
		int key = arr[low]; //选取基准点
		while (low < hig) {
	        while (low < hig && key < arr[hig]) hig--; //从数组尾巴开始扫描 找到比基准点要小的hig的位置
	        arr[low] = arr[hig];   //基准点 与 所找到的值交换, 此时arr[hig] = key(可省略不写) 因为下面会用到key 即arr[hig]
	        while (low < hig && key > arr[low]) low++; //此时从数组头部开始扫描，找到比基准点arr[hig]要小的值
	        arr[hig] = arr[low];   //基准点 与 所知道的值交换，此时arr[low] = key(可省略不写) 因为上面会用到key 即arr[low]
	    }
	    arr[low] = key; //此时的low == hig， 即arr[low]=arr[hig]=key
	    return low; //返回基准点的位置
	}
	
	
	public static void quickSort(int[] arr,int start, int end) {
		if (start >= end) return; //排序结束（递归结束）防止递归发生 StackOverFlow错误
	    int index = partition(arr, start, end); //将数组以基准点分开，获得基准点位置
	    quickSort(arr, start, index-1); //新数组，范围是 前基准点的左边部分
	    quickSort(arr, index+1, end); //新数组，范围是 前基准点的右边部分
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 4, 8, 0, 3, 7, 9, 5, 2, 6};
		quickSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

}
