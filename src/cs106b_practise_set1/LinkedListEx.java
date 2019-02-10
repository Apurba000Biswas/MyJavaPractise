package cs106b_practise_set1;

import java.util.LinkedList;

public class LinkedListEx {
	
	
	public static final void main(String[] args){
		LinkedListEx obj = new LinkedListEx();
		obj.run();
	}
	
	private void run(){
		LinkedList<String> list = new LinkedList<>();
		list.add("Apurba");
		list.add("Monami");
		list.add("Brytto");
		list.add("Tatum");
		System.out.println("Before Inserting a String middle of the list the linkLiat was:");
		printList(list);
		
		list.add(2, "Hey i am new!");
		System.out.println("After Inserting a String the LinkedList is: ");
		printList(list);
	}
	
	private void printList(LinkedList<String> list){
		for(String name: list){
			System.out.println(name);
		}
	}
}
