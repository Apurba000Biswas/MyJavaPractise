package cs106b_practise_set_1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetExample obj = new SetExample();
		obj.run();
	}
	
	private void run(){
		Set<String> set = new HashSet<>();
		buildSet(set);
		printSet(set);
		System.out.println("******This is default print********");
		System.out.println(set);
		
	}
	
	private void buildSet(Set<String> set){
		set.add("Apurba");
		set.add("Biswas");
		set.add("Test");
		set.add("Hey");
		set.add("Apurba");
		set.add("Apurba");
	}
	
	private void printSet(Set<String> set){
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
