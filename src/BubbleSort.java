/**
 * In bubble sort, the array of integers is traversed from index 0 to length-1.
 * The value at 0th position is compared with value at 1st position and if the
 * later is small, its swapped. The comparison is moved from 0th index to
 * length-1 index so that after first iteration, the last index has the biggest
 * value. Same process is repeated again from 0th to length-1 index. After
 * (length-1) iteration, array is sorted. In worst-case the complexity of bubble
 * sort is O(n2) and in best-case the complexity of bubble sort is Ω(n).
 * 
 * @author cassie9082
 * 
 */
public class BubbleSort {
	public static int[] bubbleSortAscending(int[] arr) {
		for(int i = 0; i < arr.length - 1; i++){ //**In bubble sort, the array of integers is traversed from index 0 to length-1
			for(int j = 1; j < arr.length - i; j++){ //把大的数字往后放，arr.length - i是指不用考虑之后的数字了
				if(arr[j - 1] > arr[j]){
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

	public static int[] bubbleSortDescending(int[] arr){
		for(int i = 0; i < arr.length - 1; i++){
			for(int j = 1; j < arr.length - i; j++){
				if(arr[j - 1] < arr[j]){
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
}
