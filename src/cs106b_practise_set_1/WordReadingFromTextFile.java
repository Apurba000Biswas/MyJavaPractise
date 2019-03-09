package cs106b_practise_set_1;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class WordReadingFromTextFile {
	
	
	private static final String FILE_NAME = "D:/Project/MyJavaPractise/rand_storry.txt";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WordReadingFromTextFile obj = new WordReadingFromTextFile();
		obj.readStorry();
	}
	
	private void readStorry(){
		Path path = Paths.get(FILE_NAME);
		try{
			Scanner scanner = new Scanner(path);
			//readLineByLine(scanner);
			readWordByWord(scanner);
		}catch(IOException e){
			System.out.println("????  " + e.getMessage());
		}
	}
	
	private void readLineByLine(Scanner scanner){
		while(scanner.hasNextLine()){
		    String line = scanner.nextLine();
		    System.out.println(line);
		}
		scanner.close();
	}
	
	private void readWordByWord(Scanner scanner){
		while(scanner.hasNext()){
			String word = scanner.next();
			System.out.println(word);
		}
        scanner.close();
	}

}
