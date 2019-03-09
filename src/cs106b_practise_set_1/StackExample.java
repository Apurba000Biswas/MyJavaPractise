package cs106b_practise_set_1;

import java.util.ArrayList;
import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StackExample obj = new StackExample();
		obj.run();
	}
	
	private void run(){
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("b");
		list.add("d");
		list.add("b");
		list.add("e");
		System.out.println("Original List");
		printList(list);
		
		Stack<String> stack = putInStack(list, "b");
		while(!stack.isEmpty()){
			System.out.println(stack.pop());
		}
	}
	
	private void printList(ArrayList<String> list){
		for(String str: list){
			System.out.print(str  + " ");
		}
		System.out.println();
	}
	
	private Stack<String> putInStack(ArrayList<String> list, String str){
		Stack<String> stack = new Stack<>();
		for(String s: list){
			if(s.equals(str)){
				stack.push(s);
			}
		}
		return stack;
	}

}
