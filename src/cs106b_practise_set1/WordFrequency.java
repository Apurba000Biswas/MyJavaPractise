package cs106b_practise_set1;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WordFrequency {
	
	private static final String FILE_NAME = "D:/Project/MyJavaPractise/rand_storry.txt";
	
	public static final void main(String[] args){
		
		WordFrequency obj = new WordFrequency();
		obj.readFrequency();
	}
	
	private void readFrequency(){
		long startTime = System.nanoTime();
		try{
			Path path = Paths.get(FILE_NAME);
			Scanner scanner = new Scanner(path);
			//countFrequencyUsingArrayList(scanner);
			//countFrequencyUsingHashSet(scanner);
			countFrequencyUsingHashMap(scanner);
			//long endTime   = System.nanoTime();
			//long seconds = TimeUnit.NANOSECONDS.toSeconds(endTime - startTime);
			//System.out.println("Took " + seconds + " seconds");
		}catch(IOException ex){
			System.out.println("?????  " + ex.getMessage());
		}
	}
	
	private void countFrequencyUsingArrayList(Scanner scanner){
		System.out.println("Counting ... (Using ArrayList)");
		ArrayList<String> uniqueWords = new ArrayList<>();
		while(scanner.hasNext()){
			String word = scanner.next();
			if(!uniqueWords.contains(word)){
				uniqueWords.add(word);
			}
		}
		System.out.println("Total Unique Words : " + uniqueWords.size());
	}
	
	private void countFrequencyUsingHashSet(Scanner scanner){
		System.out.println("Counting ... (Using HashSet)");
		Set<String> uniqueWords = new HashSet<String>(); 
		while(scanner.hasNext()){
			String word = scanner.next();
			if(!uniqueWords.contains(word)){
				uniqueWords.add(word);
			}
		}
		System.out.println("Total Unique Words : " + uniqueWords.size());
		System.out.println("Here is all words");
		for(String word: uniqueWords){
			System.out.println(word);
		}
	}
	
	private void countFrequencyUsingHashMap(Scanner scanner){
		System.out.println("Counting ... (Using HashMap)");
		Map<String, Integer> wordsMap = new HashMap<>(); 
		while(scanner.hasNext()){
			String word = scanner.next();
			if(!wordsMap.containsKey(word)){
				wordsMap.put(word, 1);
			}else{
				int count = wordsMap.get(word);
				count++;
				wordsMap.put(word, count);
			}
		}
		
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.print("Enter a word to Search:('n' to stop) ");
			String input = sc.nextLine();
			if(input.equals("n")) break;
			System.out.println("Occurance: " + wordsMap.get(input) );
		}
		sc.close();
	}

}
