package Interview_prepartaion_PS1;

public class FractionalPart {
	
	
	public static void main(String[] args) {
		FractionalPart obj = new FractionalPart();
		obj.operation();
	}
	
	private void operation() {
		float numF = (float) 47.005;
		findFraction(numF);
	}
	
	private void findFraction(float numF) {
		float num = numF;
		
	}
	
	private void countDigit(float num) {
		int iNum = (int)num;
		int count = 1;
		while(isDivisable(iNum)) {
			count ++;
			iNum = iNum/10;
		}
		System.out.println("Digit Count : " + count);
	}
	private boolean isDivisable(int num) {
		return num/10 >= 1;
	}

}
