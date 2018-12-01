package Interview_prepartaion_PS1;

import java.util.Scanner;

public class BinarySearch_recursion {
	
	
	private int[] array;
	private int searchInput;
	
	public static void main(String[] args) {
		BinarySearch_recursion object = new BinarySearch_recursion();
		object.controllOperation();
	}
	
	private void controllOperation() {
		makeArray();
		getsearchInput();
		int result = makeBinarySearch(array, 0, array.length-1, searchInput);
		System.out.println("Result is: " + result);
	}
	
	private void makeArray() {
		array = new int[] {2, 3, 4, 10, 40, 45, 67, 68, 80};
		searchInput = 0;
	}
	
	private void getsearchInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to search: ");
		searchInput = sc.nextInt();
		sc.close();
	}
	
	private int makeBinarySearch(int[] array
			, int start
			, int end
			, int searchValue) {
		
		if(start <= end) {
			int mid = start + (end-1)/2;
			if(start == end) mid = start;
			if(array[mid] == searchValue) {
				return mid;
			}else if(array[mid] > searchValue) {
				return makeBinarySearch(array, start, mid-1, searchValue);
			}else {
				return makeBinarySearch(array, mid+1, end, searchValue);
			}
		}
		return -1;
	}

}
