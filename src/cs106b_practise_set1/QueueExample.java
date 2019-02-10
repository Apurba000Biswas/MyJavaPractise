package cs106b_practise_set1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueExample obj = new QueueExample();
		obj.run();
	}
	
	private void run(){
		Queue<Integer> queue = new LinkedList<>();
		for(int i=0; i<5; i++){
			queue.add(i);
		}
		System.out.println("Element of Queue " + queue);
		queue.remove();
		System.out.println("After remove " + queue);
	}

}
