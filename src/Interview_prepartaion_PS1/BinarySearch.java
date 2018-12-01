package Interview_prepartaion_PS1;

import java.util.Scanner;

public class BinarySearch {
	
	private int[] array;
	private int searchInput;
	
	public static void main(String[] args) {
		BinarySearch object = new BinarySearch();
		object.makeArray();
		object.getSearchInput();
		int result = object.makeBinarySearch();
		System.out.println("Located on " + result + " num index");
	}
	
	private void makeArray() {
		array = new int[] {2, 3, 4, 10, 40};
		searchInput = 0;
	}
	
	private void getSearchInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to search: ");
		searchInput= sc.nextInt();
		sc.close();
	}
	
	private int makeBinarySearch() {
		int start = 0;
		int end = array.length-1;
		while(start <= end) {
			int mid = start + (end-1)/2;
			if(start == end) {
				mid = start;
			}
			if(array[mid] == searchInput) {
				return mid;
			}else if(array[mid] > searchInput) {
				end = mid-1;
			}else {
				start = mid+1;
			}
		}
		return -1;
	}

}
