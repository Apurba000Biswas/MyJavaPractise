package cs106b_practise_set_2;

public class RecursionExample2 {
	
	public static void main(String[] args){
		RecursionExample2 obj = new RecursionExample2();
		obj.run();
	}
	
	private void run(){
		System.out.println("Factorial of 5 : " + factorial(5));
	}
	
	private int factorial(int n){
		if(n == 0 || n == 1){
			return 1;
		}else{
			return n * factorial(n-1);
		}
	}
}
