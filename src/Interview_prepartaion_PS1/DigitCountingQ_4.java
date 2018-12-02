package Interview_prepartaion_PS1;

public class DigitCountingQ_4 {
	
	public static void main(String[] args) {
		DigitCountingQ_4 ob = new DigitCountingQ_4();
		float num = ob.getNum();
		ob.countDigit(num);
	}
	
	
	
	private float getNum() {
		float num = (float) 1713.099;
		return num;
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
