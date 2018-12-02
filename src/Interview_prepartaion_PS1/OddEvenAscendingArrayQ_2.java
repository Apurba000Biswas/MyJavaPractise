package Interview_prepartaion_PS1;

import java.util.ArrayList;
import java.util.List;

public class OddEvenAscendingArrayQ_2 {
	
	
	private int[] array;
	public static void main(String[] args) {
		OddEvenAscendingArrayQ_2 obj = new OddEvenAscendingArrayQ_2();
		obj.makeArray();
		int[] result = obj.sortArray();
		obj.printArray(result);
	}
	
	private void makeArray() {
		array = new int[]{1, 78, 23, 45, 88, 90, 22, 41};
	}
	
	private void printArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	private int[] sortArray() {
		int[] resultantArray = new int[array.length];
		List<Integer> leftSideList = new ArrayList<Integer>();
		List<Integer> rightSideList = new ArrayList<Integer>();
		for(int i=0; i<array.length; i++) {
			if(isOdd(array[i])) {
				putInList(leftSideList, array[i]);
			}else {
				putInList(rightSideList, array[i]);
			}
		}
		formResultantArray(resultantArray, leftSideList);
		formResultantArray(resultantArray, rightSideList);
		return resultantArray;
	}
	
	private boolean isOdd(int num) {
		return num%2 == 1;
	}
	private void putInList(List<Integer> list, int value) {
		list.add(value);
	}
	
	private void formResultantArray(int[] array , List<Integer> list) {
		int min = 10000;
		int index = 0;
		while(!list.isEmpty()) {
			for(int i=0; i<list.size(); i++) {
				if(min > list.get(i)) {
					min = list.get(i);
					index = i;
				}
			}
			putInArray(array, min);
			list.remove(index);
			min = 100000;
		}
	}
	private void putInArray(int[] arr, int val) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == 0) {
				arr[i] = val;
				break;
			}
		}
	}
}
