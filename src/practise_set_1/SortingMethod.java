package practise_set_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class SortingMethod {
	
	public static void main(String[] args) {
		String[] words = {"foo", "bar", "baz", "ball"};
		int[] intArray = {23, 45, 1, 32, 67, 99, 102, 21};
		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(11);
		list.add(100);
		list.add(67);
		list.add(34);
		SortingMethod mObject = new SortingMethod();
		mObject.stringSorting(words);
		mObject.arraySorting(intArray);
		mObject.arrayListSorting(list);
		
	}
	
	
	private void stringSorting(String[] str) {
		Arrays.sort(str);
		for(String s: str) {
			System.out.println(s);
		}
		System.out.println("");
	}
	
	private void arraySorting(int[] ar) {
		Arrays.sort(ar);
		for(int i : ar) {
			System.out.println(i);
		}
		System.out.println("");
	}
	
	private void arrayListSorting(List<Integer> list) {
		Collections.sort(list);
		for(int i : list) {
			System.out.println(i);
		}
		System.out.println("");
	}

}
