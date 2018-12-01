package Interview_prepartaion_PS1;

public class SelectionSort {
	
	private int[] array;
	
	public static void main(String[] args) {
		SelectionSort object = new SelectionSort();
		object.makeArray();
		object.printArray();
		object.performSelectionSort();
		object.printArray();
	}
	
	private void makeArray() {
		array = new int[] {4, 1, 3, 9, 7};
	}
	private void printArray() {
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	private void performSelectionSort() {
		for(int i=0; i<array.length; i++) {
			int minIndex = findMinimum(i);
			int temp = array[i];
			array[i] = array[minIndex];
			array[minIndex] = temp;
		}
	}
	private int findMinimum(int startingIndex) {
		int minValue = 10000;
		int minIndex = -1;
		for(int i = startingIndex; i<array.length; i++) {
			if(array[i]<minValue) {
				minValue = array[i];
				minIndex = i;
			}
		}
		return minIndex;
	}
}
