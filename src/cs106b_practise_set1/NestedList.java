package cs106b_practise_set1;

import java.util.ArrayList;

public class NestedList {
	
	public static final void main(String[] args){
		NestedList obj = new NestedList();
		obj.run();
	}
	
	private void run(){
		System.out.println("Hi there!");
		ArrayList<Integer> row1 = new ArrayList<>();
		ArrayList<Integer> row2 = new ArrayList<>();
		ArrayList<Integer> row3 = new ArrayList<>();
		
		row1.add(2);
		row1.add(4);
		
		row2.add(2);
		row2.add(5);
		row2.add(6);
		
		row3.add(3);
		row3.add(12);
		row3.add(7);
		
		ArrayList<ArrayList<Integer>> ll = new ArrayList<>();
		ll.add(row1);
		ll.add(row2);
		ll.add(row3);
		
		printNetstedList(ll);
	}
	
	private void printNetstedList(ArrayList<ArrayList<Integer>> ll){
		for(ArrayList<Integer> row : ll){
			for(int num : row){
				System.out.print(num + "  ");
			}
			System.out.println();
		}
	}
}
