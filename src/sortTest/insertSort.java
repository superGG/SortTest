package sortTest;

/**
 * insert sort
 * @author Kellan
 * 2017年9月23日
 */
public class insertSort {
	
	public static void main(String[] args) {
		int[] arr = {9,8,7,6,5,4,3,1,2,11,15,12,7};
		print(arr,0);
		for(int i=1; i<arr.length; i++){
			if(arr[i] < arr[i-1]){  //当插入数据大于 已排序数组中最大一位时，直接插入
				int tmp = arr[i]; //保存插入数据

				int j = i-1;
				while(j>-1 && tmp < arr[j]){
					arr[j+1] = arr[j];  //（第一次操作就是 a[i] = a[i-1]）持续后移一位，直到找到比插入数据tmp小的
					j--;
				}
				arr[j+1] = tmp; // 因为 插入数据 比a[j]要小，所以tmp插在a[j]前面一位，即a[j+1]
			}
			print(arr,i);
		}
	}
	
	public static void print(int[] arr,int i){
		System.out.println(i+" time: ");
		for (int t = 0; t < arr.length; t++)System.out.print(" "+arr[t]);
		System.out.println();
	}
}
