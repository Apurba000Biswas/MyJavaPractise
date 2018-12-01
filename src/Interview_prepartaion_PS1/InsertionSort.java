package Interview_prepartaion_PS1;

public class InsertionSort {
	
	private int[] array;
	
	public static void main(String[] args) {
		InsertionSort object = new InsertionSort();
		object.makeArray();
		object.printArray();
		object.performInsertionSort();
		object.printArray();
	}
	
	private void makeArray() {
		array = new int[] {10,9, 8, 7, 6, 5, 4, 3, 2, 1};
	}
	
	private void performInsertionSort() {
		for(int i=1; i<array.length; i++) {
			int key = array[i];
			int j = i-1;
			while(j>=0 && array[j]> key){
				swapWithFront(j+1);
				j--;
			}
		}
	}
	
	private void swapWithFront(int index) {
		int temp = array[index];
		array[index] = array[index-1];
		array[index-1] = temp;
	}
	
	private void printArray() {
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}
