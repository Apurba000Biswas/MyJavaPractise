package Interview_prepartaion_PS1;


/*
 * Note: *************** This is incomplete ******************
 */






public class MergeSort {
	
	private int[] array;
	
	
	public static void main(String[] args) {
		MergeSort ob = new MergeSort();
		ob.operation();
	}
	
	private void operation() {
		makeArray();
		//printArray(array);
		mergeSort(array, 0, array.length);
	}
	private void makeArray() {
		array = new int[] {38, 27, 43, 3, 9, 82, 10, 67, 23, 89};
	}
	private void printArray(int[] array, int start, int end) {
		for(int i=start; i<end; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("-------------");
	}
	
	
	private void mergeSort(int[] array, int start, int end) {
		
		if(start < end) {
			printArray(array, start, end);
			int mid = (start + end)/2;
			//System.out.print("Start: " + start + " End: " + end + " Mid: " + mid + " \\");
			mergeSort(array, start, mid); // first half
			mergeSort(array, mid+1, end); // second half
		}
	}
}
