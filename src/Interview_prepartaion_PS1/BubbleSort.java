package Interview_prepartaion_PS1;

public class BubbleSort {
	
	
	private int[] array;
	
	public static void main(String[] args) {
		BubbleSort object = new BubbleSort();
		object.makeArray();
		System.out.println("Original Array was: ");
		object.printArray();
		object.performBubbleSort();
		System.out.println("Resultant Array is: ");
		object.printArray();
	}
	
	private void makeArray() {
		array = new int[] { 32, 51, 27, 85,-123, 66, 23, 13, 57, 0};
		
	}
	
	private void performBubbleSort() {
		for(int i=array.length; i>0; i--) {
			for(int j=0; j<i-1; j++) {
				if(array[j] > array[j+1]) {
					swapElements(j, j+1);
				}
			}
		}
	}
	
	private void swapElements(int position1, int position2) {
		int temp = array[position1];
		array[position1] = array[position2];
		array[position2] = temp;
	}
	
	private void printArray() {
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
	}

}
