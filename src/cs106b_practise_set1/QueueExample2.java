package cs106b_practise_set1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueExample2 obj = new QueueExample2();
		obj.run();
	}
	
	private void run(){
		Queue<String> queue = new LinkedList<>();
		queue.add("a");
		queue.add("b");
		queue.add("c");
		System.out.println("Before Mirror: " + queue);
		mirror(queue);
		System.out.println("After Mirror: " + queue);
	}
	
	
	private void mirror(Queue<String> queue){
		Stack<String> stack = new Stack<>();
		int size = queue.size();
		for(int i=0; i<size; i++){
			String s = queue.remove();
			stack.push(s);
			queue.add(s);
		}
		while(!stack.isEmpty()){
			queue.add(stack.pop());
		}
	}

}
