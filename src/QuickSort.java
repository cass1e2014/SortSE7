import java.util.Arrays;

/**
 * Quicksort is a divide and conquer algorithm. It first divides a large list
 * into two smaller sub-lists and then recursively sort the two sub-lists. If we
 * want to sort an array without any extra space, quicksort is a good option. On
 * average, time complexity is O(n log(n)).
 * 
 * 
 * The basic step of sorting an array are as follows:
 * 
 * 1) Select a pivot, normally the middle one 
 * 2) From both ends, swap elements and make all elements on the left less than the pivot and all elements on the
 * right greater than the pivot 
 * 3) Recursively sort left part and right part
 * 
 * @author cassie9082
 * 
 */
public class QuickSort {
	public static void main(String[] args) {
		int[] x = { 9, 2, 4, 7, 3, 7, 10 };
		System.out.println(Arrays.toString(x));
 
		int low = 0;
		int high = x.length - 1;
 
		quickSort(x, low, high);
		System.out.println(Arrays.toString(x));
		//output:
		//9 2 4 7 3 7 10
		//2 3 4 7 7 9 10
	}
 
	public static void quickSort(int[] arr, int low, int high) {
		if (arr == null || arr.length == 0)
			return;
 
		if (low >= high)
			return;
 
		// pick the pivot
		int middle = low + (high - low) / 2;
		int pivot = arr[middle];
 
		// make left < pivot and right > pivot
		int i = low, j = high;
		while (i <= j) {
			while (arr[i] < pivot) {
				i++;
			}
 
			while (arr[j] > pivot) {
				j--;
			}
 
			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
 
		// recursively sort two sub parts
		if (low < j)
			quickSort(arr, low, j);
 
		if (high > i)
			quickSort(arr, i, high);
	}
}
