package practise_set_1;

import java.util.Arrays;

public class SortingMethod {
	
	public static void main(String[] args) {
		String[] words = {"foo", "bar", "baz", "ball"};
		SortingMethod mObject = new SortingMethod();
		mObject.stringSorting(words);
		
	}
	
	
	public void stringSorting(String[] str) {
		Arrays.sort(str);
		for(String s: str) {
			System.out.println(s);
		}
	}

}
