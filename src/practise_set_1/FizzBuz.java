package practise_set_1;

public class FizzBuz {
	
	public static void main(String[] args){
		FizzBuz ob = new FizzBuz();
		ob.run();
	}
	
	private void run(){
		System.out.println("This is FIZZ BUZZ Broo!!");
		printFizzBuzz();
		
	}
	
	private void printFizzBuzz(){
		for(int i=1; i<1000; i++){
			if(isDevideByBoth(i)){
				System.out.print("FizzBuzz" + " ");
			}else if (isDevidedByNum(i, 3)) {
				System.out.print("Fizz" + " ");
			}else if (isDevidedByNum(i, 5)) {
				System.out.print("Buzz" + " ");
			}else{
				System.out.print(i + " ");
			}
			//System.out.println();
		}
	}
	private boolean isDevideByBoth(int num){
		return num%3 == 0.0 && num%5 == 0.0;
	}
	private boolean isDevidedByNum(int num, int devider){
		return num%devider == 0.0;
	}
	

}
