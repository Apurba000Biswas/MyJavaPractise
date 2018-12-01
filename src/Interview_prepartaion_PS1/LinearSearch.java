package Interview_prepartaion_PS1;

import java.util.Scanner;

public class LinearSearch {
	
	private int[] array;
	private int searchInput;
	
	public static void main(String[] args) {
		LinearSearch object = new LinearSearch();
		object.makeArray();
		object.getSearchInput();
		int locatedIndex = object.makeLinearSearch();
		System.out.println("Inputed number located in : " + locatedIndex + " num index");
	}
	
	private void makeArray() {
		array = new int[] {10, 20, 80, 30, 60, 50, 
                110, 100, 130, 170};
		searchInput = 0;
	}
	
	private void getSearchInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to search in the array: ");
		searchInput = sc.nextInt();
		sc.close();
	}
	
	private int makeLinearSearch() {
		for(int index = 0; index<array.length; index++) {
			if(array[index] == searchInput) {
				return index;
			}
		}
		return -1;
	}
}
