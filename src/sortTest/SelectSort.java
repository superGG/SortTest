package sortTest;

/**
 * select sort
 * @author Kellan
 * 2017年9月23日
 */
public class SelectSort {

	public static void main(String[] args) {
		int[] arr = {1, 3, 1, 5, 7, 2, 4, 9, 6,8};
		selectSort1(arr);
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);

		// System.out.println(arr[maxNum(arr,0)]);
	}

	/**
	 * find the minmine number of the array
	 * 
	 * @author Kellan
	 * @param arr
	 * @param i
	 * @return
	 */
	public static int minNum(int[] arr, int i) {
		int k = i;
		for (int j = i + 1; j < arr.length; j++) {
			if (arr[k] > arr[j])
				k = j;
		}
		return k;
	}

	/**
	 * find the max number of the array
	 * 
	 * @author Kellan
	 * @param arr
	 * @param i
	 * @return
	 */
	public static int maxNum(int[] arr, int i) {
		int max = i;
		for (int j = arr.length - i - 1; j > 0; j--) {
			if (arr[max] < arr[j])
				max = j;
		}
		return max;
	}

	/**
	 * simple select sort
	 * 
	 * @author Kellan
	 * @param arr
	 */
	public static void selectSort1(int[] arr) {
		int k, tem;
		for (int i = 0; i < arr.length; i++) {
			k = i;
			for (int j = i + 1; j < arr.length; j++) {   //从未排序数组中找到最小的数 
				if (arr[k] > arr[j])    
					k = j;
			}
			if (k != i) {
				tem = arr[k];
				arr[k] = arr[i];
				arr[i] = tem;
			}
		}
	}

	public static void selectSort2(int[] r) {
		int n = r.length;
		int i, j, min, max;
		System.out.print("init:");
		for (int t = 0; t < r.length; t++)System.out.print(r[t]);
		System.out.println();
		for (i = 0; i <n / 2; i++) {
			// 做不超过n/2趟选择排序
			min = i;
			max = i; // 分别记录最大和最小关键字记录位置
			for (j = i; j < n - i; j++) {
				if (r[j] > r[max]) {
					max = j;
					continue;
				}
				if (r[j] < r[min]) {
					min = j;
				}
			}
			// 该交换操作还可分情况讨论以提高效率
			int maxtmp = 0;
			int mintmp = 0; 
			
			maxtmp = r[max];
			r[max] = r[n-i-1];
			r[n-i-1] = maxtmp;
			
			mintmp = r[min];
	        r[min] = r[i];
	        r[i] = mintmp;
	        
	        
	        
			System.out.print(i+"time:");
			for (int t = 0; t < r.length; t++)System.out.print(" "+r[t]);
			System.out.println();
		}
	}
}
