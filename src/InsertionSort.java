
public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/**
	 * [5,4,14,2,8] -->[4,5,14,2,8] -->[4,5,14,2,8] -->[2,4,5,14,8] -->[2,4,5,8,14]
	 * Start with 2nd element to the last element of the array, so use a for loop.
	 * Store the value into another variable
	 * @param arr
	 */
	public static void insertionSort(int[] arr){
		for(int i = 1; i < arr.length; i++){
			int valueToStore = arr[i];
			int j = i;
			while(j > 0 && arr[j - 1] > valueToStore){
				arr[j] = arr[j - 1];//把左边的相对教大的值移到右边
				j--;
			}
			arr[j] = valueToStore;
		}
	}
}
