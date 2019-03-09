package cs106b_practise_set_2;

public class RecursionExample1 {
	
	public static void main(String[] args){
		RecursionExample1 obj = new RecursionExample1();
		obj.run();
	}
	
	private void run(){
		System.out.println("Factorial of 5 : " + factorial(5));
		System.out.println("Double of 10 MnM in a bowl : " + doubleMnM(10));
	}
	
	private int factorial(int n){
		if(n == 0 || n == 1){
			return 1;
		}else{
			return n * factorial(n-1);
		}
	}
	
	private int doubleMnM(int bowl){
		if(bowl == 0){
			return 0; // bowl is empty so pass it back
		}else{
			bowl = doubleMnM(bowl-1); // pick one MnM then pass it to next
			return bowl + 2; // when bowl comes back put two MnM in it and then pass it to previous
		}
	}
}
