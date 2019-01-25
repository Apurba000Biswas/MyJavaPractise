package practise_set_1;

public class SkipTowNumCount {
	
	public static void main(String[] args){
		SkipTowNumCount object = new SkipTowNumCount();
		object.run();
	}
	
	private void run(){
		System.out.println("Hello again!!");
		skipTwoNum();
	}
	
	
	private void skipTwoNum(){
		int count = 0;
		for(int i=1; i < 50; i++){
			if(count == 2){
				System.out.println(" i = " + i);
			}else if(count == 3){
				System.out.println(" i = " + i);
			}else if(count == 4){
				count = 0;
			}
			count++;
			
		}
	}
}
